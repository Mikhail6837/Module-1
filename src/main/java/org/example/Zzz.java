package org.example;

public class Zzz {
    int a, b ;
    Zzz (int a, int b){
        this.a = a;
        this.b = b;

    }
    public void meth (Zzz o ) {
        o.a *= 2 ;
        o.b /= 2;

    }
}
class zxz {
    public static void main (String args[]) {
        Zzz ob = new Zzz(15,20) ;

        System.out.println("do " + ob.a + ob.b );
         ob.meth(ob);
         System.out.println("posle" + ob.a + ob.b);
    }
}
