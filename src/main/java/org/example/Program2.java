package org.example;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] s = input.split(" ");
//        String s1 = s[0];
//        int i = Integer.parseInt(s1);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
