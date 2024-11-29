The Bank Management System is a console-based Java application that simulates basic banking operations. The application uses classes to represent accounts and collections to store and manage multiple accounts. It allows users to perform actions like creating accounts, depositing money, withdrawing money, transferring funds, and checking account details.
Project Overview: Bank Management System
The Bank Management System is a console-based Java application that simulates basic banking operations. The application uses classes to represent accounts and collections to store and manage multiple accounts. It allows users to perform actions like creating accounts, depositing money, withdrawing money, transferring funds, and checking account details.

DSA Concepts in the Project
1. Data Structures Used
ArrayList (Dynamic Array)
The ArrayList from Java's Collections Framework is used in the Bank class to store all Account objects.
Why ArrayList?
Allows dynamic resizing as accounts are added.
Efficient for sequential access, which fits the project's requirements.


3. Algorithms Used
Linear Search

The findAccount method searches for an account in the ArrayList using the account number.
How it works?
Iterate through the list and compare each account's number with the input.
If a match is found, return the account; otherwise, return null.

Sequential Access

The program accesses and manipulates account details in sequential order when performing operations like depositing, withdrawing, or displaying account details.
Why not a more complex algorithm?
The use case is simple, with relatively small data sizes, so sequential access is sufficient.
