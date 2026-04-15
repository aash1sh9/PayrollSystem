// Employee Payroll Management System
// Demonstrates Inheritance, Polymorphism, Method Overriding

abstract class Employee {
    private String name;
    private int id;
    protected double baseSalary;

    // Constructor
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract Method (Polymorphism)
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Name: " + name + " | ID: " + id;
    }
}


// Full-Time Employee Class
class FullTimeEmployee extends Employee {
    private double bonus;
    private double allowances;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus, double allowances) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.allowances = allowances;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus + allowances;
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: Full-Time | Salary: " + calculateSalary();
    }
}


// Part-Time Employee Class
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: Part-Time | Salary: " + calculateSalary();
    }
}


// Main Class
public class PayrollSystem {
    public static void main(String[] args) {

        System.out.println("=== Employee Payroll Management System ===\n");

        // Creating Employees (Polymorphism)
        Employee e1 = new FullTimeEmployee("Rahul", 101, 40000, 8000, 2000);
        Employee e2 = new PartTimeEmployee("Priya", 102, 160, 75);

        double totalPayroll = 0;

        // Display Details
        System.out.println(e1);
        System.out.println(e2);

        totalPayroll += e1.calculateSalary();
        totalPayroll += e2.calculateSalary();

        // Summary
        System.out.println("\n----- PAYROLL SUMMARY -----");
        System.out.println("Total Employees : 2");
        System.out.println("Total Payroll   : " + totalPayroll);
    }
}
