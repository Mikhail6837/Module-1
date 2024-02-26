package org.example;

public class A {
    void callme() {
        System.out.println("is klassa A");
    }
}
    class B extends A {
        void callme() {
            System.out.println("is klassa B");
        }
    }

        class C extends B {
            void callme() {
                System.out.println("is klassa C");
            }
        }
        class Dispatch  {
    public static void main(String args[]) {

        A a = new A();
        B b = new B();
        C c = new C();
B r;
r = b;
        r.callme();
        b.callme();
        c.callme();

    }
        }
