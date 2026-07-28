package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        while(true) {
            System.out.println("Menu input(0: view word, 1: create a word, 2: exit");
            String s = scanner.nextLine();
            int input = Integer.parseInt(s);

            if (input == 0) {
                System.out.println(words);
            } else if (input == 1) {
                String userInput = scanner.nextLine();
                words.add(userInput);
            } else if (input == 2) {
                break;
            }
        }
    }
}
