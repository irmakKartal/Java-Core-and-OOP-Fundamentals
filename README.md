# Java Core & OOP Fundamentals 🚀

A comprehensive, structured collection of core Java applications, interactive console projects, and Object-Oriented Programming (OOP) design patterns.

![Java](https://img.shields.io/badge/Language-Java_8+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📌 Overview

This repository demonstrates practical Java development skills ranging from algorithm fundamentals and control flow to object-oriented architecture and realistic console applications. It serves as both a personal portfolio and a reference guide for clean Java practices.

---

## 📂 Repository Structure

```tree
Java-Core-and-OOP-Fundamentals/
├── 01-Basics-and-Logic/
│   ├── Calculator.java             # Console arithmetic calculator (+, -, *, /)
│   ├── CoordinateSystem.java       # 2D Cartesian plane quadrant detector
│   ├── Factorial.java              # Factorial computation using loops
│   ├── NumberGuessingGame.java     # Interactive random number guessing game
│   ├── NumberOperations.java       # Parity, sign check, and number comparisons
│   ├── SpeedRadar.java             # Highway speed radar and penalty evaluator
│   └── WeatherAdvisor.java         # Temperature-based clothing and activity advisor
│
├── 02-Console-Mini-Projects/
│   ├── 01-Hospital-Appointment-System/
│   │   └── HospitalAppointment.java    # Clinic branch, department & slot reservation
│   ├── 02-Ticket-Booking-System/
│   │   └── TicketBooking.java          # Event booking with tiered age discounts
│   ├── 03-Student-Grading-System/
│   │   └── StudentGradeSystem.java     # Weighted exam scoring & letter grade evaluator
│   └── 04-Lottery-Game/
│       └── LotteryGame.java            # Multi-stage lucky number matching game
│
└── 03-OOP-Principles/
    ├── 01-Encapsulation/
    │   ├── Person.java             # Data hiding, validation guards & static methods
    │   └── EncapsulationDemo.java  # Test harness demonstrating encapsulation
    └── 02-Inheritance-and-Polymorphism/
        ├── Employee.java           # Base corporate entity
        ├── Manager.java            # Single inheritance extending department info
        ├── Director.java           # Multi-level inheritance with executive allowances
        └── InheritanceDemo.java    # Polymorphic execution over class hierarchy
```

---

## 🧩 Modules & Key Features

### 1. `01-Basics-and-Logic`
Foundational programming constructs:
* **Control Structures**: `if-else` branches, nested conditionals, and `switch-case`.
* **Iteration**: `while` and `for` loops for arithmetic accumulation and game loops.
* **Input Validation & Geometry**: 2D coordinate plane quadrant and axis logic.

### 2. `02-Console-Mini-Projects`
Standalone interactive console applications modeling real-world workflows:
* 🏥 **Hospital Appointment Booking**: Allows users to select hospitals (West/East), clinical departments (Neurology, Orthopedics, Dermatology), and time slots, generating a confirmed booking slip.
* 🎟️ **Event Ticket Booking**: Evaluates ticket pricing across Cinema, Theater, and Concert categories, applying custom pricing policies and discounts based on age brackets.
* 🎓 **University Grade System**: Computes a weighted overall average (40% Midterm + 60% Final) and translates scores to standard academic letter grades (`AA` to `FF`).
* 🎰 **3-Stage Lottery Game**: Generates randomized multi-stage lucky numbers and tracks player matches.

### 3. `03-OOP-Principles`
Enterprise design practices demonstrating core object-oriented principles:
* 🔒 **Encapsulation (`01-Encapsulation`)**:
  * Private instance variables ensuring robust data protection.
  * Public getter/setter pairs with business validation logic (e.g. guarding against negative ages).
  * Constructor overloading (`Person()`, `Person(name)`, `Person(name, age)`).
  * Use of `this` keyword and static utility methods.
* 🏢 **Inheritance & Polymorphism (`02-Inheritance-and-Polymorphism`)**:
  * Corporate hierarchy: `Employee` $\rightarrow$ `Manager` $\rightarrow$ `Director`.
  * Multi-level inheritance and re-use of superclass initialization (`super(...)`).
  * Method overriding (`@Override getDetails()`) dynamically resolved at runtime through a polymorphic `Employee[]` array.

---

## 🛠️ How to Compile & Run

### Prerequisites
* **Java Development Kit (JDK) 8+** installed.
* Verify your Java setup:
  ```bash
  java -version
  javac -version
  ```

### Running Any Program
Navigate to the directory of the program and compile it using `javac`, then run with `java`:

#### Example: Run Hospital Appointment System
```bash
cd "02-Console-Mini-Projects/01-Hospital-Appointment-System"
javac HospitalAppointment.java
java HospitalAppointment
```

#### Example: Run OOP Inheritance Demo
```bash
cd "03-OOP-Principles/02-Inheritance-and-Polymorphism"
javac *.java
java InheritanceDemo
```

---

## 💡 Concepts Demonstrated

| Category | Topics Covered |
| :--- | :--- |
| **Language Fundamentals** | Data types, operators, Scanner I/O, formatting |
| **Control Flow** | Conditionals, branching, loops, sentinel values |
| **Mathematical Logic** | Randomization, cartesian coordinates, factorials |
| **Object-Oriented Design** | Classes, Objects, Constructors, Encapsulation |
| **Inheritance** | Single & Multi-level inheritance, `super` keyword |
| **Polymorphism** | Method overriding, runtime dynamic method dispatch |

---

## 📄 License
This repository is open source and available under the [MIT License](LICENSE).
