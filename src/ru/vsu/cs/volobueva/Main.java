package ru.vsu.cs.volobueva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("enter a number n: ");
        int n = checkCorrectAndRead();

        System.out.print("enter a number a: ");
        int a = checkCorrectAndRead();

        System.out.print("enter a number b: ");
        int b = checkCorrectAndRead();

        System.out.printf("sum = %d", calculateSum(n, a, b));
    }

    static int checkCorrectAndRead() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("The entered number is incorrect. Read the condition again.");
            System.out.print("Try again: ");
            number = checkCorrectAndRead();
        }
        return number;
    }

    static int calculateSum(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (checkCorrectNumber(i, a, b)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean checkCorrectNumber(int i, int a, int b) {
        return (i % a == 0) && (i % b != 0);
    }
}
