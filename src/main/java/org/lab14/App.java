package org.lab14;

import org.lab14.entity.Stack;
import org.lab14.entity.StackImpl;


public class App {
    public static void main(String[] args) {
        Stack<Double> numbers = new StackImpl<>(10);
        double item = 1.0;

        for(int i = 0; i < 10; i++) {
            item += 2;
            numbers.push(item);
        }
        for(int i = 0; i < 11; i++) {
            Double value = numbers.pop();
            if (value != null) {
                System.out.println("Pop value:" + value);
            }
        }
    }
}
