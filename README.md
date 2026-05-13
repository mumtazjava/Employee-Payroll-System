# Employee-Payroll-System
# Payroll Management System

## Project Overview
This is a Java console-based Payroll Management System developed using Object-Oriented Programming (OOP) concepts.

The project manages:
- Full-Time Employees
- Part-Time Employees
- Salary Calculation
- Employee Records

This project demonstrates the use of:
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- ArrayList Collection

---

## Technologies Used
- Java
- OOP Concepts
- Collections Framework
- ArrayList

---

## Features
- Add Employee
- Remove Employee
- Display Employee Details
- Calculate Salary

---

## OOP Concepts Used

### Encapsulation
Used private variables with getter methods.

### Abstraction
Created abstract class `Employee` with abstract method `calculateSalary()`.

### Inheritance
`FullTimeEmployee` and `PartTimeEmployee` inherit from `Employee`.

### Polymorphism
Implemented method overriding for salary calculation.

---

## Project Structure

```text
PayrollManagementSystem/
│
├── src/
│   ├── Employee.java
│   ├── FullTimeEmployee.java
│   ├── PartTimeEmployee.java
│   ├── PayrollSystem.java
│   └── Main.java
│
└── README.md
```

---

## Sample Output

```text
Initial Employee Details:

Employee{name='Mumtaz', Id=1, Salary=70000}
Employee{name='AmanLalawani', Id=2, Salary=15000}

Removing Employee

After Removing:

Employee{name='AmanLalawani', Id=2, Salary=15000}
```

---

## Future Improvements
- Add Database Integration using MySQL
- Add JDBC Connectivity
- Convert into Spring Boot REST API
- Add Employee Search Feature
- Add Update Employee Feature
- Add Exception Handling

---

## Author
Mumtaz Alam

Java Backend Developer Fresher
