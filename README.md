# Design Patterns in Object-Oriented Design

This repository is a collection of example implementations of **classic object-oriented design patterns**, created to demonstrate how these patterns can be applied in real-world scenarios.

The goal of this repository is **educational**: to help understand *why* and *how* different design patterns are used, and how they improve code structure, flexibility, and maintainability.

All examples in this repository are implemented using **Java**.

---

## 📌 Design Patterns Covered

### 1. Factory Pattern

The Factory Pattern provides an interface for creating objects while allowing subclasses or implementations to decide which class to instantiate.

It helps decouple object creation from its usage, making the code more flexible and easier to extend.

---

### 2. Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.

This pattern is useful when the system needs to be independent of how its objects are created and represented.

---

### 3. Singleton Pattern

The Singleton Pattern ensures that a class has **only one instance** and provides a global point of access to that instance.

It is commonly used for shared resources such as configuration managers, logging systems, or database connections.

---

### 4. Observer Pattern

The Observer Pattern defines a **one-to-many dependency** between objects, where a change in one object automatically notifies and updates its dependents.

This pattern is widely used in event-driven systems and for implementing publish–subscribe mechanisms.

---

### 5. Chain of Responsibility Pattern

The Chain of Responsibility Pattern passes a request along a chain of handlers, where each handler decides whether to process the request or pass it to the next handler.

This pattern helps reduce coupling between the sender and receiver of a request.

---

### 6. Builder Pattern

The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

It is especially useful when an object has many optional parameters or requires step-by-step construction.

---

### 7. Adapter Pattern

The Adapter Pattern allows incompatible interfaces to work together by acting as a bridge between them.

It is commonly used when integrating legacy systems or third-party libraries with existing code.

---

## 🎯 Purpose of This Repository

* To demonstrate **practical implementations** of object-oriented design patterns
* To improve understanding of **clean code and software design principles**
* To serve as a **reference and learning resource** for design patterns in Java

---

## 🛠️ Technology Used

* **Language:** Java
* **Paradigm:** Object-Oriented Programming

---

Feel free to explore the repository, study the implementations, and use them as a reference for learning and applying design patterns in your own projects.
