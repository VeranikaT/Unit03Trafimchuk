package by.epam.unit03.main;

public class Task03 {
    public static void main(String[] args) {
        int sum = 3;
        long mult = sum;
        int x;
        for (x = 3; x <= 10; x++) {
            sum += x;
            mult *= sum;
        }
        System.out.println("Multiplication of (1+2)*(1+2+3)*...*(1+2+...+10)=" + mult);
    }
}
