<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&pause=1000&color=CC0000&center=true&vCenter=true&width=600&lines=Employee+Payroll+Management+System;Built+with+Core+Java+%7C+OOP+Principles;Inheritance+%C2%B7+Polymorphism+%C2%B7+Abstraction" alt="Typing SVG" />

<br/>

![Java](https://img.shields.io/badge/Java-CC0000?style=flat-square&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-8B0000?style=flat-square)
![JDK](https://img.shields.io/badge/JDK-8+-007396?style=flat-square&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-2ea44f?style=flat-square)
![License](https://img.shields.io/badge/License-Academic-F5F0EB?style=flat-square)
![Views](https://komarev.com/ghpvc/?username=aash1sh9&label=project+views&style=flat-square&color=CC0000)

</div>

---

## `$ whoami`

A hands-on project built as part of **OOP with Java** coursework at Rungta International Skills University.
Demonstrates clean class hierarchy, runtime polymorphism, and input validation — nothing overcomplicated, everything purposeful.

> **Two employee types. One abstract base. Fully polymorphic salary dispatch.**

---

## class hierarchy

```
                    ┌─────────────────────────┐
                    │     Employee (abstract) │
                    │─────────────────────────│
                    │ - name : String         │
                    │ - id : int              │
                    │ # baseSalary : double   │
                    │─────────────────────────│
                    │ + calculateSalary()     │  ← abstract
                    │ + getEmployeeType()     │  ← abstract
                    │ + toString()            │
                    └────────────┬────────────┘
                                 │
               ┌─────────────────┴──────────────────┐
               │                                    │
   ┌───────────────────────┐          ┌──────────────────────────┐
   │   FullTimeEmployee    │          │    PartTimeEmployee      │
   │───────────────────────│          │──────────────────────────│
   │ - bonus : double      │          │ - hoursWorked : int      │
   │ - allowances : double │          │ - hourlyRate : double    │
   │───────────────────────│          │──────────────────────────│
   │ baseSalary            │          │ hoursWorked              │
   │ + bonus               │          │ × hourlyRate             │
   │ + allowances          │          │                          │
   └───────────────────────┘          └──────────────────────────┘
```

---

## oop concepts mapped

| concept | implementation | where |
|---|---|---|
| **Abstraction** | `Employee` is abstract — cannot be instantiated | `Employee.java` |
| **Inheritance** | Both subclasses extend `Employee` | `FullTimeEmployee`, `PartTimeEmployee` |
| **Polymorphism** | `calculateSalary()` resolved at runtime via `Employee` ref | `PayrollSystem.java` loop |
| **Method Overriding** | Each subclass defines its own salary logic | Both subclasses |
| **Constructor Chaining** | `super(name, id, baseSalary)` called in both | Both subclasses |
| **Encapsulation** | `private` fields, exposed via `public` getters | `Employee.java` |
| **Input Validation** | Guards in constructor — throws `IllegalArgumentException` | `Employee.java` |

---

## salary logic

```
FullTimeEmployee   →   baseSalary + bonus + allowances
                       40,000    + 8,000 + 2,000  =  ₹50,000

PartTimeEmployee   →   hoursWorked × hourlyRate
                       160 hrs    × ₹75/hr        =  ₹12,000
```

---

## project structure

```
EmployeePayrollSystem/
│
├── Employee.java              # abstract base — fields, getters, validation
├── FullTimeEmployee.java      # fixed salary + bonus + allowances
├── PartTimeEmployee.java      # hourly × hours model
└── PayrollSystem.java         # main entry — input, payroll loop, summary
```

---

## run it

```bash
# clone the repo
git clone https://github.com/aash1sh9/employee-payroll-system.git
cd employee-payroll-system

# compile all files
javac *.java

# run
java PayrollSystem
```

**Requirements:** Java 8+ · Any OS · No external dependencies

---

## sample output

```
=== Employee Payroll Management System ===

How many employees to add? 2

Employee 1
Name: Rahul  |  ID: 101  |  Type: FullTime
Base Salary: 40000 | Bonus: 8000 | Allowances: 2000

Employee 2
Name: Priya  |  ID: 102  |  Type: PartTime
Hours Worked: 160  |  Hourly Rate: 75

----------- PAYROLL DETAILS -----------
Name: Rahul      | ID: 101 | Type: Full-Time  | Salary: Rs.50000.00
Name: Priya      | ID: 102 | Type: Part-Time  | Salary: Rs.12000.00

----------- PAYROLL SUMMARY -----------
Total Employees  : 2
Total Payroll    : Rs.62000.00
Average Salary   : Rs.31000.00
Highest Paid     : Rahul (Rs.50000.00)
```

---

## test cases

| # | scenario | input | expected | status |
|---|---|---|---|---|
| TC-001 | FullTime standard | base=40000, bonus=8000, allow=2000 | `₹50,000.00` | ✅ |
| TC-002 | PartTime standard | 160hrs × ₹75/hr | `₹12,000.00` | ✅ |
| TC-003 | Polymorphic dispatch | `Employee` ref calls `calculateSalary()` | correct method invoked | ✅ |
| TC-004 | Zero bonus | base=35000, bonus=0, allow=1500 | `₹36,500.00` | ✅ |
| TC-005 | Zero hours | 0hrs × ₹100/hr | `₹0.00` | ✅ |
| TC-006 | Invalid name | `name = ""` | `IllegalArgumentException` thrown | ✅ |
| TC-007 | Negative salary | `baseSalary = -5000` | `IllegalArgumentException` thrown | ✅ |
| TC-008 | Negative ID | `id = -1` | `IllegalArgumentException` thrown | ✅ |

---

## what's next

```
v1.0  ✅  core payroll — FullTime + PartTime, polymorphic dispatch
v1.1  [ ]  ContractEmployee + InternEmployee types
v1.2  [ ]  tax slabs, PF deductions, insurance
v1.3  [ ]  file export — CSV payslip generation
v2.0  [ ]  SQLite/MySQL persistence layer
v3.0  [ ]  Spring Boot REST API + React frontend
```

---

## leave a remark

used it? spotted a bug? just exploring?

[![Leave a Remark](https://img.shields.io/badge/drop%20a%20remark-%E2%86%92-CC0000?style=for-the-badge)](https://github.com/aash1sh9/employee-payroll-system/issues/new?title=Remark&labels=remark&body=%F0%9F%91%8B+Hey+Ash%2C%0A%0A**What+brought+you+here%3F**%0A%0A**Your+thoughts%3A**%0A%0A**Suggestions+%2F+fixes%3A**%0A%0A---%0AThanks+for+stopping+by!)

> one click → github issue opens → drop your thoughts. 30 seconds, no friction.

---

<div align="center">

**built by**

**Aashish Raj** · `RU-25-10016`
B.Tech CSE · Rungta International Skills University, Bhilai

[![GitHub](https://img.shields.io/badge/GitHub-aash1sh9-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/aash1sh9)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-aashish--raj-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://linkedin.com/in/aashish-raj-a27120362)

---

| | |
|---|---|
| **Subject** | Object Oriented Programming with Java |
| **Code** | RU-100-01-00012 |
| **Session** | 2025–26 |
| **Guide** | Mr. Shivansh Mehta |

</div>
