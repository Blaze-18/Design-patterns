
## **Problem**

Write a program to create different **Database-related components** using the **Abstract Factory Design Pattern**.

The application should support **multiple database systems**, specifically **MySQL** and **PostgreSQL**.
Each database system should provide its own implementation of database components.

### **Requirements**

* Create database components:

    * **Connection**
    * **Command**
    * **ResultSet**

* Each component should have appropriate methods, for example:

    * `connect()` for Connection
    * `execute()` for Command
    * `getResults()` for ResultSet

* Implement two database systems:

    * **MySQL**
    * **PostgreSQL**

* Each database system should produce its own set of database components:

    * MySQL Connection, MySQL Command, MySQL ResultSet
    * PostgreSQL Connection, PostgreSQL Command, PostgreSQL ResultSet

### **Design Constraints**

* Use the **Abstract Factory Pattern** to create families of related database components.
* Each database system should have its own **concrete factory**.
* The client code must interact only with **abstract interfaces**, not concrete implementations.
* Switching between database systems should not require any change in the client code.

