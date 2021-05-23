package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        do {
            x = x + 2;
            sum = sum + x;
        } while (x < 99);
        System.out.println("Sum of all odd numbers is " + sum);
    }
}
