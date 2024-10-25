
## Getting Started

### Prerequisites

-   **Java** (version 8 or higher)
-   **Apache Ant** for building and running the project
-   **Travis CI**

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

### Explanation of Tests

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

## Detailed Codebase Explanation

### **Book.java**

The `Book` class represents a book in the library, with attributes such as:

-   `ISBN`, `title`, `author`, and `copiesAvailable` to track availability.
-   Methods include `borrowBook()` to decrement available copies and `returnBook()` to increment available copies.

### **Member.java**

The `Member` class represents a library member. Key features include:

-   A loan limit (`MAX_LOAN_LIMIT`), enforced by the `borrowBook()` method.
-   A list of borrowed books, with methods for borrowing and returning books.

### **Loan.java**

The `Loan` class tracks a loan transaction between a member and a book, including:

-   `loanDate` and `dueDate` for calculating when a book is due.
-   `isOverdue()` method for checking if the current date exceeds the due date.

### **LibrarySystem.java**

This is the main controller of the system. It manages:

-   A list of books, members, and loans.
-   Methods to add/remove books and members, issue loans, and search the catalog.

### **Main.java**

The `Main` class demonstrates basic usage of the Library Management System, performing operations such as:

-   Adding books and members.
-   Issuing and returning loans.
-   Displaying the current state of the system.

## Challenges and Solutions

-   **Edge Case Handling**: Edge cases such as borrowing when no copies are available or exceeding the loan limit were tested to ensure the system behaves as expected under extreme conditions.
-   **Overdue Loan Testing**: Simulating different dates to test the `isOverdue()` method allowed us to verify the accuracy of overdue loan detection.## Getting Started

### Prerequisites

-   **Java** (version 8 or higher)
-   **Apache Ant** for building and running the project
-   **Travis CI**
