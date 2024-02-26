package org.example;

public class TestTo {
    int a, b;
    TestTo (int i, int j ) {
        a = i;
        b = j;
    }

    boolean equalTo (TestTo o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main (String args[]) {
        TestTo ob1 = new TestTo (100,20);
        TestTo ob2 = new TestTo (100,20);
        TestTo ob3 = new TestTo(11,3);

        System.out.println("ob1==ob2" + ob1.equalTo(ob2));
        System.out.println("ob2==ob3" + ob2.equalTo(ob3));

    }
}