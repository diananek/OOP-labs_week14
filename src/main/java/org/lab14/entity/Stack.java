package org.lab14.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Stack<T> {
    void push(T value);

    T pop();

    T peek();

    Integer getSize();
}
