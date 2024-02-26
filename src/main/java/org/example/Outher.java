package org.example;

public class Outher {
    int outher_x = 10;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display() {
            System.out.println(" outher_x = " + outher_x);
        }
    }
}
class Innerdemo {
    public static void main(String args[]) {
        Outher outher = new Outher();
        outher.test();
    }
}
