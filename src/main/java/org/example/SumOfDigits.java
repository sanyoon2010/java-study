package org.example;

import java.util.Scanner;

public class SumOfDigits {


//    static int n;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = n / 1000;
//            int b = (n % 1000) / 100;
//            int c = (n % 100) / 10;
//            int d = (n % 10);
//            System.out.println(a + b + c + d);
//
//    }
    public static int sumOfDigits(int n) {
        int total = 0;
        while(n>0) {
            total += n % 10;
            n = n / 10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(SumOfDigits.sumOfDigits(n));
    }
}
