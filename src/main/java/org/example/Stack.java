package org.example;

public class Stack {
    int stc [];
    private int tos;
    Stack(int size) {
        stc = new int [size];
        tos = -1;
    }
    void push(int item) {
        if(tos==stc.length-1)
            System.out.println("Стек заполнен");
        else
            stc[++tos] = item;
    }
    int pop() {
        if(tos<0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stc[tos--];
    }
}
