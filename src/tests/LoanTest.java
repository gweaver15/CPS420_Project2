package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import java.util.List;
import com.example.library.Book;
import com.example.library.LibrarySystem;
import com.example.library.Member;
import com.example.library.Loan;

public class LoanTest {

    private Loan loan;
    private Book book;
    private Member member;
    private LibrarySystem library;

    @Before
    public void setUp() {
        book = new Book("1234567890", "Test Book", "Author Name", 3);
        member = new Member("M001", "Jane Doe");
        loan = new Loan(member, book);
        library = new LibrarySystem();
    }

    @Test
    public void testLoanCreation() {
        assertNotNull(loan.getLoanDate());
        assertNotNull(loan.getDueDate());
    }

    @Test
    public void testIsReturned_FalseInitially() {
        assertFalse(loan.isReturned());
    }

    @Test
    public void testIsReturned_AfterReturn() {
        library.returnLoan(loan);
        assertTrue(loan.isReturned());
    }

    @Test
    public void testIsOverdue_NotOverdue() {
        assertFalse(loan.isOverdue());  // Loan is fresh, should not be overdue
    }

}