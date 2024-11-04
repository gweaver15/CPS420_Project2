# Library Management System

## Overview

The **Library Management System (LMS)** is a Java-based application that allows libraries to streamline their operations. The system provides functionalities such as book cataloging, member registration, loan management, and overdue tracking. The project includes a set of unit tests to ensure the application's reliability and uses Continuous Integration (CI) to automate building, testing, and deployment.

## Features

- **Book Management**: Add, update, and manage book records, including inventory tracking.
- **Member Management**: Register new members, maintain member records, and enforce borrowing limits.
- **Loan Management**: Handle borrowing and returning books, calculate due dates, and manage overdue notifications.
- **Search Functionality**: Search the library catalog by title, author, or ISBN.
- 
## Explanation of Tests

The test suite covers the most critical components of the Library Management System:

1.  **BookTest.java**:
    
    -   Tests the `borrowBook()` and `returnBook()` methods in the `Book` class.
    -   Edge cases such as attempting to borrow when no copies are available are tested.
2.  **MemberTest.java**:
    
    -   Tests borrowing and returning books for library members.
    -   Ensures that the loan limit is enforced and that the member's list of borrowed books is correctly updated.
3.  **LoanTest.java**:
    
    -   Validates the loan creation process, ensuring that due dates are calculated correctly.
    -   Tests the `isOverdue()` method by simulating various dates to check if a loan is overdue.
4.  **LibrarySystemTest.java**:
    
    -   Tests the system's core functionality, including adding books and members and issuing loans.
    -   Validates that overdue loans are detected and books are managed correctly.

These tests help verify the integrity of the system, ensuring that each feature works as intended and handles exceptional scenarios effectively.

## Continuous Integration (CI)

This project uses **Travis CI** for Continuous Integration, automating the build and test processes. CI runs every time a change is pushed to the repository, ensuring that the project remains stable.
    
The `.travis.yml` file in the root directory contains the necessary configuration to run the CI pipeline, which will build the project and run the test suite automatically on every push to the repository.
