package com.example.library.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.example.library.Book;

public class BookTest {
    
    private Book book;

    @Before
    public void setUp() {
        book = new Book("1234567890", "Effective Java", "Joshua Bloch", 5);
    }

    @Test
    public void testBorrowBook_Success() {
        book.borrowBook();
        assertEquals(4, book.getCopiesAvailable());
    }

    @Test(expected = IllegalStateException.class)
    public void testBorrowBook_NoCopiesAvailable() {
        book = new Book("1234567890", "Effective Java", "Joshua Bloch", 0);
        book.borrowBook(); // Should throw exception
    }

    @Test
    public void testReturnBook_Success() {
        book.borrowBook();  // Borrowing 1 copy, reducing available copies to 4
        book.returnBook();  // Returning, should increase copies to 5 again
        assertEquals(5, book.getCopiesAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidISBN() {
        book = new Book("", "Invalid Book", "Author", 1);  // Invalid ISBN
    }
}