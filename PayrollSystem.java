// Employee Payroll Management System
// Updated: June 2026 | Demonstrates Inheritance, Polymorphism, Collections, Validation

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract Base Class
abstract class Employee {
    private String name;
    private int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (baseSalary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();
    public abstract String getEmployeeType();

    @Override
    public String toString() {
        return String.format("Name: %-10s | ID: %03d | Type: %-10s | Salary: Rs.%.2f",
            name, id, getEmployeeType(), calculateSalary());
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    private double bonus;
    private double allowances;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus, double allowances) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.allowances = allowances;
    }

    @Override
    public double calculateSalary() { return baseSalary + bonus + allowances; }
    // Example: baseSalary=40000, bonus=8000, allowances=2000 → 40000 + 8000 + 2000 = 50000.00

    @Override
    public String getEmployeeType() { return "Full-Time"; }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() { return hoursWorked * hourlyRate; }
    // Example: hoursWorked=160, hourlyRate=75.0 → 160 * 75 = 12000.00

    @Override
    public String getEmployeeType() { return "Part-Time"; }
}

// Main Class
public class PayrollSystem {

    public static Employee getHighestPaid(List<Employee> employees) {
        Employee highest = employees.get(0);
        for (Employee e : employees) {
            if (e.calculateSalary() > highest.calculateSalary()) highest = e;
        }
        return highest;
    }
    // Example: compares 50000.00 vs 12000.00 → returns Rahul

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // OUTPUT:
        // === Employee Payroll Management System ===

        System.out.println("=== Employee Payroll Management System ===\n");

        // OUTPUT:
        // How many employees to add?
        // User types: 2

        System.out.print("How many employees to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // OUTPUT (i=0):
            // Employee 1
            // Name: Rahul
            // ID: 101
            // Type (1=FullTime, 2=PartTime): 1
            // Base Salary: 40000
            // Bonus: 8000
            // Allowances: 2000

            // OUTPUT (i=1):
            // Employee 2
            // Name: Priya
            // ID: 102
            // Type (1=FullTime, 2=PartTime): 2
            // Hours Worked: 160
            // Hourly Rate: 75

            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Type (1=FullTime, 2=PartTime): ");
            int type = sc.nextInt();

            if (type == 1) {
                System.out.print("Base Salary: ");
                double base = sc.nextDouble();
                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();
                System.out.print("Allowances: ");
                double allowances = sc.nextDouble();
                employees.add(new FullTimeEmployee(name, id, base, bonus, allowances));
            } else {
                System.out.print("Hours Worked: ");
                int hours = sc.nextInt();
                System.out.print("Hourly Rate: ");
                double rate = sc.nextDouble();
                employees.add(new PartTimeEmployee(name, id, hours, rate));
            }
        }

        // OUTPUT:
        // ----------- PAYROLL DETAILS -----------

        System.out.println("\n----------- PAYROLL DETAILS -----------");

        double totalPayroll = 0;
        for (Employee e : employees) {

            // OUTPUT (e1 - FullTimeEmployee):
            // Name: Rahul     | ID: 101 | Type: Full-Time  | Salary: Rs.50000.00

            // OUTPUT (e2 - PartTimeEmployee):
            // Name: Priya     | ID: 102 | Type: Part-Time  | Salary: Rs.12000.00

            System.out.println(e);
            totalPayroll += e.calculateSalary();
        }

        // OUTPUT:
        // ----------- PAYROLL SUMMARY -----------
        // Total Employees  : 2
        // Total Payroll    : Rs.62000.00
        // Average Salary   : Rs.31000.00
        // Highest Paid     : Rahul (Rs.50000.00)

        System.out.println("\n----------- PAYROLL SUMMARY -----------");
        System.out.println("Total Employees  : " + employees.size());
        System.out.printf("Total Payroll    : Rs.%.2f%n", totalPayroll);
        System.out.printf("Average Salary   : Rs.%.2f%n", totalPayroll / employees.size());
        System.out.println("Highest Paid     : " + getHighestPaid(employees).getName()
            + " (Rs." + String.format("%.2f", getHighestPaid(employees).calculateSalary()) + ")");

        sc.close();
    }
}
