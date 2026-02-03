
## **Problem 6**

Write a program to simulate a **Meal Ordering System** using the **Builder Design Pattern**.

The system should construct different types of meals such as **Vegetarian** and **Non-Vegetarian** meals.
A typical meal consists of a **Burger** and a **Cold Drink**.

### **Requirements**

* Meal components:

    * **Burger**

        * Veg Burger
        * Chicken Burger
        * Packed using a **Wrapper**
    * **Cold Drink**

        * Coke
        * Pepsi
        * Packed in a **Bottle**

* Each food item should have methods such as:

    * `getName()`
    * `getPacking()`
    * `getPrice()`

### **Builder Pattern Usage**

* Use the **Builder Pattern** to encapsulate the step-by-step construction of meals.

* Create separate builders for:

    * **Vegetarian Meal**
    * **Non-Vegetarian Meal**

* A **Director** (or Meal Builder Manager) should control the construction process.

### **Program Functionality**

* Display the details of:

    * Vegetarian Meal
    * Non-Vegetarian Meal

* For each meal:

    * List all included items
    * Display the **total cost** of the meal

### **Design Constraints**

* The construction logic of meals must be separated from their representation.
* The same construction process should be able to create different meal configurations.
* Client code should not directly create individual meal items.

