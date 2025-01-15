package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program2
{
    public static void main(String [] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee person = new Employee();

        System.out.print("Name: ");
        person.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        person.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        person.tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s\n", person);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        person.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated data: %s", person);

        sc.close();
    }
}
