
## **Problem 1**

Write a program to create various shapes such as **Circle**, **Triangle**, and **Rectangle**, and calculate the **area** of each shape.

You should use the **Factory Design Pattern** for shape creation so that all shapes can be created using a **single factory object**.

### **Requirements**

* Each shape should have its own **defining properties**:

    * **Circle** → radius
    * **Triangle** → length of its three sides
    * **Rectangle** → width and height

* Each shape must implement a method named:

  ```text
  getArea()
  ```

  which calculates and returns the area of that shape.

* When creating a particular shape, its properties should be initialized with **default values**.
  Examples:

    * Circle → `radius = 1`
    * Rectangle → `width = 2`, `height = 1.5`
    * Triangle → any valid default side lengths

### **Design Constraint**

* The program must use the **Factory Pattern** to create shape objects.
* The client code should not directly instantiate shape classes.
* All shape objects must be created through the **Shape Factory**.

