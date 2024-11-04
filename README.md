# Library Management System

## Overview

The **Library Management System (LMS)** is a Java-based application that allows libraries to streamline their operations. The system provides functionalities such as book cataloging, member registration, loan management, and overdue tracking. The project includes a set of unit tests to ensure the application's reliability and uses Continuous Integration (CI) to automate building, testing, and deployment.

## Features

- **Book Management**: Add, update, and manage book records, including inventory tracking.
- **Member Management**: Register new members, maintain member records, and enforce borrowing limits.
- **Loan Management**: Handle borrowing and returning books, calculate due dates, and manage overdue notifications.
- **Search Functionality**: Search the library catalog by title, author, or ISBN.

### Prerequisites

-   **Java** (version 8 or higher)
-   **Apache Ant** for building and running the project
-   **Travis CI** or **GitHub Actions** for Continuous Integration (optional)

### How to Clone, Build, and Run the Application

1.  **Clone the Repository**: Clone the repository to your local machine using the following command:
    
    `git clone https://github.com/your-username/LibraryManagementSystem.git
    cd LibraryManagementSystem` 
    
2.  **Compile the Code**: This project uses **Apache Ant** for build automation. Compile the source code using the following command:

    `ant compile` 
    
    This will compile all Java files in the `src/` directory.
    
3.  **Run the Application**: After compilation, run the application using:
 
    `ant run` 
    
    This command will execute the `Main.java` file, which showcases the basic functionality of the Library Management System.
    
4.  **Clean the Project** (optional): To remove compiled files and clean up the project directory:
    
    `ant clean` 

### Running Unit Tests

Unit tests are included to ensure the key components of the system function correctly. The tests are written using **JUnit** and cover a range of scenarios, including edge cases.

To run the tests, use the following command:

`ant test` 

This will compile and run all tests located in the `tests/` directory and display the results in your terminal.
  
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
