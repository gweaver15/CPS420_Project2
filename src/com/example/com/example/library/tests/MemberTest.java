package com.example.library.tests;

import org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;
import com.example.library.Book;
import com.example.library.LibrarySystem;
import com.example.library.Member;
import com.example.library.Loan;

public class MemberTest {
    
    private Member member;
    private Book book;
    private Loan loan;

    @Before
    public void setUp() {
        member = new Member("M001", "John Doe");
        book = new Book("1234567890", "Clean Code", "Robert Martin", 3);
        loan = new Loan(member, book);
    }

    @Test
    public void testBorrowBook_Success() {
        member.borrowBook(book);
        assertEquals(1, member.getBorrowedBooks().size());
    }

    @Test
    public void testReturnBook_Success() {
        member.borrowBook(book);
        member.returnBook(loan);
        assertEquals(0, member.getBorrowedBooks().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReturnBook_NotBorrowed() {
        member.returnBook(loan);  // Returning a book that was never borrowed, should throw exception
    }
}
