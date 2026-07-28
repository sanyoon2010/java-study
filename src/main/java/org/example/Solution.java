package org.example;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> solution = new ArrayList<>();
        solution.add(2);
        solution.add(3);
        solution.add(8);
        solution.add(5);

        int maximum = 0;
        int index = -1;
        for (int i = 0; i < solution.size(); i++) {
            if (solution.get(i) > maximum) {
                maximum = solution.get(i);
                index = i;
            }
        }

        System.out.printf("%d %d \n%n", maximum, index);
    }
}