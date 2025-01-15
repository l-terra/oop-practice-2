package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program3
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        st.name = sc.nextLine();
        st.grade1 = sc.nextDouble();
        st.grade2 = sc.nextDouble();
        st.grade3 = sc.nextDouble();

        double finalGrade = st.finalGrade();

        if(finalGrade >= 60.0)
        {
            System.out.println(st);
            System.out.println("PASS");
        }
        else
        {
            System.out.println(st);
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", st.missingPoints()) + " POINTS");
        }

        sc.close();
    }
}
