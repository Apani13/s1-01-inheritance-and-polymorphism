# s1-01-inheritance-and-polymorphism
## OOP and Java Basics

🎶 **Java OOP Exercises – Music, Vehicles, Smartphones**

📝 **Description**
This repository contains a set of Java Object-Oriented Programming (OOP) exercises structured across two levels. Each exercise helps you understand and apply OOP principles such as inheritance, abstraction, polymorphism, encapsulation, interfaces, and class initialization behaviors in real-world-inspired scenarios.

* Use Eclipse or IntelliJ IDEA for all exercises.
* Follow the best practices detailed in Sprint 0 for consistent GitHub repository structure and delivery.
* You may build the projects using Maven, Gradle, or plain Java.
* All code must be written in English.

🎯 **Objectives**

* Understand and apply core OOP principles in Java.
* Work with abstract classes, interfaces, static/final members, and class initialization blocks.
* Gain hands-on experience building and testing Java-based CLI applications.

📚 **Exercise Overview**
**Level 1**

* **Exercise 1 – Musical Instruments**

    * Create classes for WindInstrument, StringInstrument, and PercussionInstrument.
    * All inherit from a common Instrument class with attributes `name`, `price`, and abstract method `play()`.
    * Override `play()` to print the appropriate message for each instrument type.
    * Demonstrate class loading behavior using static blocks and initialization blocks.

* **Exercise 2 – Car Class**

    * Create a Car class with attributes: `carBrand` (static final), `carModel` (static), and `carPower` (final).
    * Add methods: `slowDown()` (static) → "Car slowing down...", and `speedUp()` (non-static) → "Car speeding up...".
    * Demonstrate method invocation and initialization rules from `main()`.

**Level 2**

* **Exercise 1 – Smartphone**

    * Create a Phone class with attributes `phoneBrand`, `phoneModel`, and method `ring(String phoneNumber)`.
    * Create interfaces `Camera` (with method `takePhoto()`) and `Clock` (with method `alarm()`).
    * Implement a Smartphone class extending Phone and implementing both interfaces.
    * Instantiate a Smartphone from `main()` and invoke all methods.

💻 **Technologies Used**

* Java
* Eclipse or IntelliJ IDEA
* GitHub
* (Optional) Maven or Gradle for build automation

📋 **Requirements**

* Java JDK 17 or later
* Git (to clone the repository)
* IntelliJ IDEA or Eclipse

🛠️ **Installation**

1. Clone the repository:

   ```bash
   git clone https://github.com/your-user/oop-java-exercises.git  
   ```
2. Open the project in your preferred IDE (Eclipse or IntelliJ).
3. If using Maven or Gradle, import it accordingly. Otherwise, set it up as a plain Java project.
4. Ensure your project SDK is set to Java 17+.

▶️ **Execution**

* Locate the class containing the `main()` method (typically `Main.java`).
* Run the file via the IDE or terminal:

  ```bash
  java Main
  ```
* Ensure the correct `main()` method is set as the entry point.

🌐 **Deployment**
This is an educational project and not intended for production deployment.
However, to package the application as a `.jar` file:

```bash
javac Main.java
jar cfe OOPExercises.jar Main *.class
java -jar OOPExercises.jar
```

🤝 **Contributions**
Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch:

   ```bash
   git checkout -b feature/NewFeature  
   ```
3. Commit your changes:

   ```bash
   git commit -m "Add NewFeature"  
   ```
4. Push the changes:

   ```bash
   git push origin feature/NewFeature  
   ```
5. Submit a pull request

✅ **Author Notes**
Feel free to fork or clone this project to build upon. These exercises are crafted as foundational steps to strengthen your Java OOP skills.
