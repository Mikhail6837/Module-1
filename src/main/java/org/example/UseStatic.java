package org.example;

public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println(" Статический блок инициализированн");
        b = a * 2;
    }
    public static void main(String args[]) {
        meth(43);
    }
}
