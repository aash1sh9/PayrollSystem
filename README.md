<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=700&size=24&pause=1000&color=CC0000&center=true&vCenter=true&width=700&lines=Employee+Payroll+Management+System;Core+Java+%7C+OOP+Under+the+Hood" alt="Typing SVG" />

<br/>

![Java](https://img.shields.io/badge/Java-CC0000?style=flat-square&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Paradigm-8B0000?style=flat-square)
![JDK](https://img.shields.io/badge/JDK-8+-555?style=flat-square&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-2ea44f?style=flat-square)
![Views](https://komarev.com/ghpvc/?username=aash1sh9&label=views&style=flat-square&color=CC0000)

</div>

<br/>

> payroll system for two employee types — full-time and part-time.
> built for OOP with Java coursework · Rungta International Skills University.
> clean hierarchy, runtime polymorphism, input validation. nothing over-engineered.

---

## architecture

```
╔══════════════════════════════════════╗
║         Employee  (abstract)        ║
║  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  ║
║  - name        String               ║
║  - id          int                  ║
║  # baseSalary  double               ║
║  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  ║
║  + calculateSalary()   ← abstract   ║
║  + getEmployeeType()   ← abstract   ║
║  + toString()                       ║
╚═════════════╤════════════════════════╝
              │  extends
    ┌──────────┴──────────┐
    ▼                     ▼
╔══════════════╗    ╔═══════════════╗
║  FullTime    ║    ║   PartTime    ║
║ ──────────── ║    ║ ───────────── ║
║ - bonus      ║    ║ - hoursWorked ║
║ - allowances ║    ║ - hourlyRate  ║
║ ──────────── ║    ║ ───────────── ║
║  base+bonus  ║    ║  hours×rate   ║
║  +allowances ║    ║               ║
╚══════════════╝    ╚═══════════════╝
```

---

## salary logic

```
FullTimeEmployee  →  baseSalary + bonus + allowances
                     40,000    + 8,000 + 2,000  =  ₹ 50,000.00

PartTimeEmployee  →  hoursWorked × hourlyRate
                     160 hrs    × ₹ 75/hr       =  ₹ 12,000.00
                                                   ───────────
                                    Total Payroll  ₹ 62,000.00
```

---

## oop concepts

| concept | where |
|---|---|
| Abstraction | `Employee` is abstract — no direct instantiation |
| Inheritance | both subclasses `extend Employee` |
| Polymorphism | `calculateSalary()` resolved at runtime via `Employee` ref |
| Method Overriding | each subclass defines its own salary formula |
| Constructor Chaining | `super(name, id, baseSalary)` in both subclasses |
| Encapsulation | `private` fields · `public` getters |
| Input Validation | constructor throws `IllegalArgumentException` on bad input |

---

## structure

```
EmployeePayrollSystem/
├── Employee.java           # abstract base
├── FullTimeEmployee.java   # fixed salary model
├── PartTimeEmployee.java   # hourly model
└── PayrollSystem.java      # entry point + summary
```

---

## run

```bash
git clone https://github.com/aash1sh9/employee-payroll-system.git
cd employee-payroll-system
javac *.java
java PayrollSystem
```

---

## output

```
=== Employee Payroll Management System ===

How many employees to add? 2

Employee 1
Name: Rahul  |  Type: FullTime
Base Salary: 40000 | Bonus: 8000 | Allowances: 2000

Employee 2
Name: Priya  |  Type: PartTime
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

| # | input | expected | status |
|---|---|---|---|
| TC-001 | base=40000, bonus=8000, allow=2000 | `₹50,000.00` | ✅ |
| TC-002 | 160hrs × ₹75/hr | `₹12,000.00` | ✅ |
| TC-003 | `Employee` ref → `calculateSalary()` | correct dispatch | ✅ |
| TC-004 | bonus=0, allow=1500 | `₹36,500.00` | ✅ |
| TC-005 | 0hrs × ₹100/hr | `₹0.00` | ✅ |
| TC-006 | `name = ""` | `IllegalArgumentException` | ✅ |
| TC-007 | `baseSalary = -5000` | `IllegalArgumentException` | ✅ |
| TC-008 | `id = -1` | `IllegalArgumentException` | ✅ |

---

## roadmap

```
v1.0  ✅  FullTime + PartTime · polymorphic dispatch · validation
v1.1  ○   ContractEmployee · InternEmployee types
v1.2  ○   tax slabs · PF · insurance deductions
v1.3  ○   CSV payslip export
v2.0  ○   SQLite / MySQL persistence
v3.0  ○   Spring Boot API + React dashboard
```

---

## leave a remark

[![remark →](https://img.shields.io/badge/drop%20a%20remark-%E2%86%92-CC0000?style=for-the-badge)](https://github.com/aash1sh9/employee-payroll-system/issues/new?title=Remark&labels=remark&body=%F0%9F%91%8B+Hey+Ash%2C%0A%0A**What+brought+you+here%3F**%0A%0A**Thoughts%3A**%0A%0A**Suggestions%3A**%0A%0A---%0AThanks!)

> one click → github issue → drop your thoughts.

---

<div align="center">

**Aashish Raj** · `RU-25-10016` · B.Tech CSE · Rungta International Skills University, Bhilai

[![GitHub](https://img.shields.io/badge/aash1sh9-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/aash1sh9)
[![LinkedIn](https://img.shields.io/badge/aashish--raj-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://linkedin.com/in/aashish-raj-a27120362)

<br/>

| Subject | OOP with Java · `RU-100-01-00012` |
|---|---|
| Session | 2025–26 |
| Guide | Mr. Shivansh Mehta |

</div>
