
## **Problem 4**

Write a program to implement a **Logger System** using the **Singleton Design Pattern**.

The application should ensure that **only one instance** of the logger exists throughout the execution of the program.

### **Requirements**

* Create a **Logger** class that:

    * Maintains a single instance of itself
    * Provides a global access point to that instance

* The Logger class should include methods such as:

    * `logInfo(String message)`
    * `logError(String message)`

* Multiple parts of the application should use the same Logger instance to record messages.

### **Design Constraints**

* The Logger class must follow the **Singleton Pattern**.
* The constructor of the Logger class should be **private**.
* The instance should be created in a **controlled manner** (eager or lazy initialization).
* No other class should be able to create another Logger instance.


