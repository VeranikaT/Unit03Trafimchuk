package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sign;
        int x, y;
        int z = 0;

        while (true) {
            System.out.println("Enter X: ");
            if (sc.hasNext("#")) {
                System.out.print("The program is finished");
                break;
            }
            x = sc.nextInt();

            System.out.println("Enter Y: ");
            if (sc.hasNext("#")) {
                System.out.print("The program is finished");
                break;
            }
            y = sc.nextInt();

            System.out.println("Enter the arithmetic sign: ");
            if (sc.hasNext("#")) {
                System.out.print("The program is finished");
                break;
            }
            sign = sc.next();
            if (sign.equals("+")) {
                z = x + y;
            } else if (sign.equals("-")) {
                z = x - y;
            } else if (sign.equals("*")) {
                z = x * y;
            } else if (sign.equals("/") && y == 0) {
                System.out.println("Cannot divide by zerro");
            } else if (sign.equals("/")) {
                z = x / y;
            } else {
                System.out.println("There is no such arithmetic sign. Please use '*' '/' '+' '-'");
            }
            System.out.println("Result: " + z);
        }
    }// Молодец. Зачтено.
}
