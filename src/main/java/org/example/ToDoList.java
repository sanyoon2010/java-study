package org.example;

import java.util.*;

public class ToDoList
{
    public static void main(String[] args)
    {
        // Rewrite this code to use an ArrayList instead of an array
        ArrayList<String> toDoList = new ArrayList<String>();
        toDoList.add(0, "Do homework");
        toDoList.add(1, "Help make dinner");
        toDoList.add(2, "Call grandma");


        // changing element 1
        toDoList.set(1, "Order pizza");

        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList.get(0));

//        // remove item 0 and move everything down
//        //  (this can be done in one method call with ArrayList)
//        toDoList.set(0, toDoList.get(1));
//        toDoList.set(1, toDoList.get(2));
//        toDoList.set(2, "");
//
//        System.out.println("Here's the next thing to do: " + toDoList.get(0));

        // Why is an ArrayList better than an array for a toDoList?
        // Answer:
    }
}
