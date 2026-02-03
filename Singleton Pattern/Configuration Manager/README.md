

## **Problem**

Write a program to implement a **Configuration Manager** using the **Singleton Design Pattern**.

The Configuration Manager is responsible for storing and providing application-wide configuration settings.

### **Requirements**

* Create a **ConfigurationManager** class that:

    * Ensures only **one instance** exists in the application
    * Stores configuration values such as:

        * Application name
        * Database URL
        * Timeout values

* Provide methods such as:

    * `getProperty(String key)`
    * `setProperty(String key, String value)`

* All modules of the application should access configuration data through the same Configuration Manager instance.

### **Design Constraints**

* The Configuration Manager must be implemented using the **Singleton Pattern**.
* The constructor must be **private**.
* The instance should be globally accessible.
* Configuration data should remain consistent across the entire application.
