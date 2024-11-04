package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

import org.junit.Test;
import java.util.List;

public class LibrarySystemTest {

    private LibrarySystem librarySystem;
    private Book book1;
    private Book book2;
    private Member member;

    @Before
    public void setUp() {
        librarySystem = new LibrarySystem();
        book1 = new Book("1234567890", "Refactoring", "Martin Fowler", 5);
        book2 = new Book("0987654321", "Test Driven Development", "Kent Beck", 2);
        member = new Member("M001", "Alice Smith");
        librarySystem.addBook(book1);
        librarySystem.addBook(book2);
        librarySystem.registerMember(member);
    }

    @Test
    public void testIssueLoan() {
        librarySystem.issueLoan(member.getMemberId(), book1.getIsbn());
        assertEquals(1, member.getBorrowedBooks().size());
    }

    @Test(expected = IllegalStateException.class)
    public void testIssueLoan_NoCopiesAvailable() {
        book2.borrowBook();  // Only 2 copies, borrow both
        book2.borrowBook();
        librarySystem.issueLoan(member.getMemberId(), book1.getIsbn());  // No copies left, should throw exception
    }

}