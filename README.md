# ☕ Java Core & Object-Oriented Programming (OOP) Fundamentals

[![Java](https://img.shields.io/badge/Java-8%20--%2021+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Object-Oriented Programming](https://img.shields.io/badge/Architecture-OOP_Design_Patterns-blue?style=for-the-badge)](https://github.com/irmakKartal/Java-Core-and-OOP-Fundamentals)
[![Author](https://img.shields.io/badge/Author-Irmak_Kartalkayası-blueviolet?style=for-the-badge)](https://github.com/irmakKartal)
[![License: MIT](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

A structured, production-grade portfolio demonstrating core Java software engineering principles, algorithm design, control flow patterns, clean code practices, and robust Object-Oriented Programming (OOP) architecture.

> 👤 **Author & Copyright:** [Irmak Kartalkayası](https://github.com/irmakKartal)  
> 💻 **Tech Stack:** Java SE (Standard Edition), OOP Design Principles, Console Application Architecture  
> 📄 **License:** MIT License  

---

## 📌 Repository Overview

This repository demonstrates essential software engineering competencies in Java, bridging algorithmic problem-solving with enterprise-grade Object-Oriented design. The codebase is organized into three progressive architectural tiers:

1. **`01-Basics-and-Logic/`**: Algorithmic problem solving, mathematical modeling, and control flow optimization.
2. **`02-Console-Mini-Projects/`**: Complete domain-specific console applications modeling real-world business workflows.
3. **`03-OOP-Principles/`**: Enterprise design patterns emphasizing Encapsulation, Multi-level Inheritance, and Polymorphism.

---

## 📂 Architecture & Directory Structure

```text
Java-Core-and-OOP-Fundamentals/
├── 01-Basics-and-Logic/
│   ├── Calculator.java             # Menu-driven arithmetic calculator with input guards
│   ├── CoordinateSystem.java       # 2D Cartesian plane quadrant and axis detector
│   ├── Factorial.java              # Iterative computation using loop invariants
│   ├── NumberGuessingGame.java     # Pseudo-random generation with game loop state
│   ├── NumberOperations.java       # Parity validation and magnitude comparison
│   ├── SpeedRadar.java             # Automated speed radar penalty & threshold evaluator
│   └── WeatherAdvisor.java         # Multi-branch temperature & activity recommendation
│
├── 02-Console-Mini-Projects/
│   ├── 01-Hospital-Appointment-System/
│   │   └── HospitalAppointment.java    # Multi-branch clinic, department & appointment slip booking
│   ├── 02-Ticket-Booking-System/
│   │   └── TicketBooking.java          # Multi-event pricing engine with tiered demographic discounts
│   ├── 03-Student-Grading-System/
│   │   └── StudentGradeSystem.java     # Weighted exam computation (40/60) with letter grade mapping
│   └── 04-Lottery-Game/
│       └── LotteryGame.java            # Multi-stage randomized lottery game with state tracking
│
└── 03-OOP-Principles/
    ├── 01-Encapsulation/
    │   ├── Person.java             # Data hiding, defensive validation, and constructor overloading
    │   └── EncapsulationDemo.java  # Test harness demonstrating safe mutator state validation
    └── 02-Inheritance-and-Polymorphism/
        ├── Employee.java           # Abstract base corporate entity with encapsulated attributes
        ├── Manager.java            # Single inheritance extending departmental responsibilities
        ├── Director.java           # Multi-level inheritance introducing executive bonus structures
        └── InheritanceDemo.java    # Dynamic method dispatch and runtime polymorphism via Employee[]
```

---

## 🧩 Architectural Highlights & Key Modules

### 1. ⚙️ Core Logic & Algorithms (`01-Basics-and-Logic`)
* **Structured Control Flow:** Clean implementation of conditional branching (`if-else-if`, `switch-case`) and iterative loops (`while`, `for`).
* **Input Validation & Boundary Handling:** Interactive CLI reading using `java.util.Scanner` with defensive range checking.
* **Algorithmic Computations:** 2D geometric coordinate evaluation, factorial calculation, and randomized game loops.

### 2. 🏢 Interactive Business Applications (`02-Console-Mini-Projects`)
* 🏥 **Hospital Appointment Reservation:** Models real-world clinic operations (branch selection, multi-specialty routing between Neurology, Orthopedics, and Dermatology, and time-slot booking with confirmed appointment vouchers).
* 🎟️ **Event Ticketing Engine:** Implements commercial pricing policies across Cinema, Theater, and Concert venues with dynamic age-tier discount matrices.
* 🎓 **Academic Grade Evaluation System:** Computes weighted academic performance (40% Midterm + 60% Final) and generates letter grade conversions (`AA` through `FF`).
* 🎰 **Multi-Stage Lottery Game:** Utilizes pseudo-random number generation (`Math.random()`) to evaluate matching stages and prize tiers.

### 3. 🏛️ Enterprise Object-Oriented Design (`03-OOP-Principles`)
* 🔒 **Encapsulation & Defensive Programming:**
  * Strict access modification (`private` fields, `public` getters/setters).
  * Mutator validation guards preventing illegal object states (e.g., negative ages).
  * Constructor chaining and overloading (`Person()`, `Person(name)`, `Person(name, age)`).
* 🌲 **Inheritance & Polymorphism:**
  * Clean corporate hierarchy: `Employee` $\rightarrow$ `Manager` $\rightarrow$ `Director`.
  * Proper superclass delegation via `super(...)` constructors and method overrides (`@Override getDetails()`).
  * Dynamic method dispatch: Iterating over heterogeneous `Employee[]` arrays where runtime polymorphism automatically executes the specialized subclass logic.

---

## 🛠️ How to Compile & Run

### Prerequisites
* **Java Development Kit (JDK 8 or newer)** installed on your machine.
* Verify your environment:
  ```bash
  java -version
  javac -version
  ```

### Execution Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/irmakKartal/Java-Core-and-OOP-Fundamentals.git
   cd Java-Core-and-OOP-Fundamentals
   ```

2. **Run a Mini-Project (e.g., Hospital Appointment System):**
   ```bash
   cd "02-Console-Mini-Projects/01-Hospital-Appointment-System"
   javac HospitalAppointment.java
   java HospitalAppointment
   ```

3. **Run OOP Inheritance & Polymorphism Demo:**
   ```bash
   cd "03-OOP-Principles/02-Inheritance-and-Polymorphism"
   javac *.java
   java InheritanceDemo
   ```

---

## 📄 License & Copyright

This project is open-source and licensed under the **MIT License**.  
Copyright © 2026 **[Irmak Kartalkayası](https://github.com/irmakKartal)**. All rights reserved.
