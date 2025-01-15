package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

        Rectangle x = new Rectangle();

        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", x.area());
        System.out.printf("PERIMETER = %.2f\n", x.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", x.diagonal());

        sc.close();
    }
}
