package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    private static Stack miPila = new Stack();

    public static Stack<String> createStack() {
        miPila.push("Smith");
        miPila.push("Montessori");
        miPila.push("Peralta");
        miPila.push("House");
        return miPila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!miPila.isEmpty()) {
            System.out.println(miPila.get((miPila.size()-1)));
            miPila.pop();
        }
    }

    public static void main(String[] args) {

        miPila = createStack();

        printAndEmptyStack(miPila);

    }



}
