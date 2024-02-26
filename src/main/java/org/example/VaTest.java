package org.example;

public class VaTest {
    static void vatest(int ... v) {
        System.out.print("Количество аргументов =" + v.length + "Содержимое = ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        vatest(22);
        vatest(3,4,6,7);
        vatest();
    }
}
