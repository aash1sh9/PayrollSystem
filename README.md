# Employee Payroll Management System

> built with core java. oop under the hood — inheritance, polymorphism, constructor chaining.

![Java](https://img.shields.io/badge/Java-JDK%208%2B-black?style=flat-square&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-black?style=flat-square)
![Status](https://img.shields.io/badge/Status-Completed-black?style=flat-square)
![License](https://img.shields.io/badge/License-Academic-black?style=flat-square)
![Views](https://komarev.com/ghpvc/?username=aash1sh9&label=project+views&style=flat-square&color=grey)

---

## about

payroll system for two employee types — full-time and part-time.
built as part of OOP with Java coursework at Rungta International Skills University.
clean class hierarchy, polymorphic dispatch, nothing overcomplicated.

---

## what it does

| employee type | salary logic |
|---|---|
| `FullTimeEmployee` | `baseSalary + bonus + allowances` |
| `PartTimeEmployee` | `hoursWorked × hourlyRate` |

---

## oop concepts used

| concept | where |
|---|---|
| Inheritance | `FullTimeEmployee` & `PartTimeEmployee` extend `Employee` |
| Polymorphism | `calculateSalary()` called via `Employee` reference |
| Method Overriding | each subclass overrides `calculateSalary()` |
| Constructor Chaining | `super()` in both subclasses |
| Encapsulation | private fields, public getters |

---

## structure

```
EmployeePayrollSystem/
├── Employee.java           # base class
├── FullTimeEmployee.java   # fixed salary + bonus
├── PartTimeEmployee.java   # hourly rate
└── PayrollSystem.java      # entry point
```

---

## run it

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
Full Time Employee Salary  :  50000.0
Part Time Employee Salary  :  12000.0
────────────── PAYROLL SUMMARY ──────────────
Total Employees   :  2
Total Payroll     :  62000.0
```

---

## test cases

| # | scenario | expected | status |
|---|---|---|---|
| TC-001 | FullTime (40000 + 8000 + 2000) | 50000.0 | ✅ |
| TC-002 | PartTime (160 hrs × ₹75/hr) | 12000.0 | ✅ |
| TC-003 | polymorphic call via Employee ref | correct method invoked | ✅ |
| TC-004 | FullTime with zero bonus | baseSalary + allowances | ✅ |
| TC-005 | PartTime with zero hours | 0.0 | ✅ |

---

## what's next

- [ ] `ContractEmployee` and `InternEmployee` types
- [ ] database integration (MySQL / SQLite)
- [ ] tax slabs, PF & insurance deductions
- [ ] PDF payslip generation
- [ ] Spring Boot REST API + React frontend

---

## leave a remark

used this? found a bug? just vibing?

[![Leave a Remark](https://img.shields.io/badge/leave%20a%20remark-%E2%86%92-black?style=flat-square)](https://github.com/aash1sh9/employee-payroll-system/issues/new?title=Remark&labels=remark&body=%F0%9F%91%8B+Hey+Ash%2C%0A%0A**What+brought+you+here%3F**%0A%0A**Your+thoughts+on+the+project%3A**%0A%0A**Suggestions+%2F+feedback%3A**%0A%0A---%0AThanks+for+stopping+by!)

> click the badge → GitHub issue opens → drop your thoughts. takes 30 seconds.

---

## built by

**Aashish Raj** · `RU-25-10016`
B.Tech CSE · Rungta International Skills University, Bhilai

[![GitHub](https://img.shields.io/badge/GitHub-aash1sh9-black?style=flat-square&logo=github&logoColor=white)](https://github.com/aash1sh9)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-aashish--raj-black?style=flat-square&logo=linkedin&logoColor=white)](https://linkedin.com/in/aashish-raj-a27120362)

---

## course info

| | |
|---|---|
| Subject | Object Oriented Programming with Java |
| Code | RU-100-01-00012 |
| Session | 2025–26 |
| Guide | Mr. Shivansh Mehta |
