package javatest;
import java.util.Scanner;


public class qn4oops {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) 
        {
            System.out.println("details of  Employee " + (i + 1));
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            
            System.out.print("Basic Salary: ");
            double basic = scanner.nextDouble();
            
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();
            
            System.out.print("DA: ");
            double da = scanner.nextDouble();
            
            System.out.print("Special Allowance : ");
            double specialAllowance = scanner.nextDouble();

            if (specialAllowance == 0) 
            {
                employees[i] = new Employee(name, age, basic, hra, da);
            } else {
                employees[i] = new Employee(name, age, basic, hra, da, specialAllowance);
            }

 

            scanner.nextLine(); 
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Details:");
            employees[i].displayDetails();
        }
    }
}
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double basic, double hra, double da, double specialAllowance) {
        this.name = name;
        this.age = age;
        this.salary = calculateSalary(basic, hra, da, specialAllowance);
    }


    public Employee(String name, int age, double basic, double hra, double da) {
        this(name, age, basic, hra, da, 0.0);
    }


    private double calculateSalary(double basic, double hra, double da, double specialAllowance) {
        return basic + hra + da + specialAllowance;
    }


    private double calculateSalary(double basic, double hra, double da) {
        return basic + hra + da;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

 
