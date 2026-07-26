package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartLocker {
    String id;
    int capacity;
    boolean available;

    public SmartLocker(String id, int capacity, boolean available) {
        this.id = id;
        this.capacity = capacity;
        this.available = available;
    }

    public static void main(String[] args) {
        Map<String, Integer> smartLocker = new HashMap<>();
        smartLocker.put("L1", 3);
        smartLocker.put("L2", 5);
        Map<String, Boolean> smartLocker2 = new HashMap<>();
        smartLocker2.put("L1", true);
        smartLocker2.put("L2", false);
        SmartLocker L1 = new SmartLocker("L1", smartLocker.get("L1"), smartLocker2.get("L1"));
        SmartLocker L2 = new SmartLocker("L2", smartLocker.get("L2"), smartLocker2.get("L2"));

        for (SmartLocker s: List.of(L1, L2)) {
            s.printCapacity();
            s.printAvailable();
        }
    }

    public void printCapacity() {
        System.out.println(id + " capacity:" + capacity);
    }

    public void printAvailable() {
        System.out.println(id + " available: " + available);
    }


}
