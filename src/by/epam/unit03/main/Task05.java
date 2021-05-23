package by.epam.unit03.main;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter h: ");
        double h = sc.nextDouble();
        double f;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|\t\t%2s\t\t|\t%6s\t\t|\n", "x", "f(x)");

        for (double x = a; x <= b; x += h) {

            f = 2 * Math.tan(x / 2) + 1;
            System.out.println(" -------------------------------");
            System.out.printf("|\t\t%-4.1f\t|\t%-10f\t|\n", x, f);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
