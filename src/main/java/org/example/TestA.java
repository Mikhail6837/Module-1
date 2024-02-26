package org.example;

public class TestA {
    int a,b ;

    TestA (int i, int j) {
        a = i;
        b = j;
    }

    void meth (TestA c) {
        c.a *=2;
        c.b /=2;

    }
}
class PassObjRe  {
    public static void main (String args[]) {
        TestA ob = new TestA (10,20);
        System.out.println ("ob.a i ob.b  do" + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println ("ob.a i ob.b  posle" + ob.a + " " + ob.b);
    }
}
