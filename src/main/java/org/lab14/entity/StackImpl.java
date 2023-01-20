package org.lab14.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack <T>{
    private final List<T> stackItems = new ArrayList<>();
    private final Integer stackSize;
    public StackImpl(Integer size) {
        this.stackSize = size;
    }
    @Override
    public void push(T value) {
        this.stackItems.add(value);
    }

    @Override
    public T pop() {
        if (this.stackItems.size() == 0) {
            System.out.println("The stack is empty");
            return null;
        }

        T value = this.stackItems.get(this.stackItems.size() - 1);
        this.stackItems.remove(value);
        return value;
    }

    @Override
    public T peek() {
        if (this.stackItems.size() == 0) {
            System.out.println("The stack is empty");
            return null;
        }
        T value = this.stackItems.get(this.stackItems.size() - 1);
        return value;
    }

    @Override
    public Integer getSize() {
        return this.stackItems.size();
    }

}
