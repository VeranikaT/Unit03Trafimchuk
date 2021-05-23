package by.epam.unit03.main;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(1000000);
        int y = random.nextInt(1000000);
        String first = Integer.toString(x);
        String second = Integer.toString(y);
        char numfirst, numsecond;
        System.out.println("The first number is " + x);
        for (int a = 0; a < first.length(); a++) {
            numfirst = first.charAt(a);
            int v = a + 1;
            System.out.println("Digit N " + v + " of first number is " + numfirst);
        }
        System.out.println("The second number is " + y);
        for (int b = 0; b < second.length(); b++) {
            numsecond = second.charAt(b);
            int w = b + 1;
            System.out.println("Digit N " + w + " of second number is " + numsecond);
        }
    }
}
