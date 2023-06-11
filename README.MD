<p align="center"> LIBRARYMANAGER APPLICATION </p>
<p align="center">
Library Management System that allows users to manage
books and borrowers. </p>

## FEATURES
 1. A Book class that includes the following attributes:
   • Title (String)
   • Author (String)
   • ISBN (String)
   • Available Copies (int)
 2. A Borrower class that includes the following attributes:
    • Name (String)
    • Email (String)
    • Phone Number (String)
 3. Programme Includes the following methods:
    • addBook: Adds a new book to the list
    • removeBook: Removes a book from the list
    • getBook: Returns a book based on its ISBN
    • borrowBook: Updates the available copies of a book when it is borrowed by a
    borrower
    • returnBook: Updates the available copies of a book when it is returned by a  
    borrower
    • addBorrower: Adds a new borrower to the list
    • removeBorrower: Removes a borrower from the list
    • getBorrower: Returns a borrower based on their email
 4. The system use JDBC to connect to the database.
 5. The system expose a REST API to allow users to interact with the system over
    the web.
6. Code includes Singleton and Factory design patterns
7. Using JDBC connections
8. Using Spring Boot to expose a REST API

## USING TECHNOLOGIES

* **Java:** 17
* **Framework:** Spring Boot (3.0.6)
* **Database:** PostgreSQL
* **IDE:** Intellij Idea

## THANK YOU
