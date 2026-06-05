# 💼 Employee Payroll Management System

> Object-Oriented Payroll System built with Core Java — demonstrates Inheritance, Polymorphism & Constructor Chaining.

![Java](https://img.shields.io/badge/Java-JDK%208%2B-orange?style=flat-square&logo=java)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=flat-square)
![License](https://img.shields.io/badge/License-Academic-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=flat-square)

---

## 📌 About

An Employee Payroll Management System implemented using **Core Java** and **OOP concepts** as part of the *Object Oriented Programming with Java* course at **Rungta International Skills University**.

The system handles salary computation for two employee types — **Full-Time** and **Part-Time** — using a clean class hierarchy with polymorphic method dispatch.

---

## ✨ Features

- ✅ `Employee` base class with shared attributes
- ✅ `FullTimeEmployee` — salary = `baseSalary + bonus + allowances`
- ✅ `PartTimeEmployee` — salary = `hoursWorked × hourlyRate`
- ✅ Runtime polymorphism via `Employee` references
- ✅ Constructor chaining using `super()`
- ✅ Payroll summary report on console

---

## 🧱 OOP Concepts Demonstrated

| Concept | Where Used |
|---|---|
| **Inheritance** | `FullTimeEmployee` & `PartTimeEmployee` extend `Employee` |
| **Polymorphism** | `calculateSalary()` called via `Employee` reference |
| **Method Overriding** | Each subclass overrides `calculateSalary()` |
| **Constructor Chaining** | `super()` used in both subclasses |
| **Encapsulation** | Private fields with public getters |

---

## 🗂️ Project Structure

```
EmployeePayrollSystem/
│
├── Employee.java              # Base class
├── FullTimeEmployee.java      # Subclass — fixed salary + bonus
├── PartTimeEmployee.java      # Subclass — hourly rate
└── PayrollSystem.java         # Main class — entry point
```

---

## ▶️ How to Run

**Prerequisites:** JDK 8 or higher

```bash
# Clone the repo
git clone https://github.com/notash9/employee-payroll-system.git
cd employee-payroll-system

# Compile
javac *.java

# Run
java PayrollSystem
```

---

## 📤 Sample Output

```
=== Employee Payroll Management System ===
Full Time Employee Salary  :  50000.0
Part Time Employee Salary  :  12000.0
─────────────────── PAYROLL SUMMARY ──────────────────────
Total Employees   :  2
Total Payroll     :  62000.0
```

---

## 🧪 Test Cases

| Test | Scenario | Expected | Status |
|---|---|---|---|
| TC-001 | FullTime (40000 + 8000 + 2000) | 50000.0 | ✅ Pass |
| TC-002 | PartTime (160 hrs × ₹75/hr) | 12000.0 | ✅ Pass |
| TC-003 | Polymorphic call via Employee ref | Correct method invoked | ✅ Pass |
| TC-004 | FullTime with zero bonus | baseSalary + allowances | ✅ Pass |
| TC-005 | PartTime with zero hours | 0.0 | ✅ Pass |

---

## 🛣️ Future Roadmap

- [ ] Add `ContractEmployee` and `InternEmployee` types
- [ ] MySQL / SQLite database integration
- [ ] Tax slabs, PF & insurance deductions
- [ ] PDF payslip generation
- [ ] Spring Boot REST API + React frontend

---

## 👨‍💻 Author

**Aashish Raj** — `RU-25-10016`  
B.Tech CSE (in association with Google)  
Rungta International Skills University, Bhilai

[![GitHub](https://img.shields.io/badge/GitHub-aas1sh9-black?style=flat-square&logo=github)](https://github.com/aash1sh9)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-aashish--raj-blue?style=flat-square&logo=linkedin)](https://linkedin.com/in/aashish-raj-a27120362)

---

## 📚 Course Info

| Field | Details |
|---|---|
| Subject | Object Oriented Programming with Java |
| Subject Code | RU-100-01-00012 |
| Session | 2025–26 |
| Guide | Mr. Shivansh Mehta (Java Trainee) |
