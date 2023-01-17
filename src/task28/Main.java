package task28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n < 10) return n % 10;
        return n % 10 + sumDigits(n / 10);
    }
}
