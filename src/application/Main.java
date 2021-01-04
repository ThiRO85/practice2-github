package application;

import entities.Practice;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Practice thiago = new Practice();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Grade 01: ");
        double grade1 = sc.nextDouble();
        System.out.print("Grade 02: ");
        double grade2 = sc.nextDouble();
        System.out.print("Grade 03: ");
        double grade3 = sc.nextDouble();
        System.out.println();

        double fG = finalGrade(grade1, grade2, grade3);

        System.out.println("Final grade = " + fG);
        leftPoints(fG);

        sc.close();
    }

    public static double finalGrade(double grade1, double grade2, double grade3) {
        return grade1 + grade2 + grade3;
    }

    public static void leftPoints(double finalGrade) {
        if (finalGrade < 60.0) {
            System.out.println("Failed");
            double leftPoints = 60.0 - finalGrade;
            System.out.println("Missing " + leftPoints + " points");
        }
        else {
            System.out.println("Pass");
        }

    }
}
