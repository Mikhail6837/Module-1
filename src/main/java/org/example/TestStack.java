package org.example;

public class TestStack {
    public static void main (String args[]) {
        Stack mystack1 = new Stack(4);
        Stack mystack2 = new Stack(6);

        for(int i = 0; i<4; i++) mystack1.push(i);
        for(int i = 10; i<16; i++) mystack2.push(i);

        System.out.println(" Содерджимое стека 1 ");
        for(int i=0; i<4; i++)
            System.out.print(mystack1.pop());

        System.out.println("Содержимое стека 2 ");
        for(int i = 0; i<6; i++)
            System.out.println(mystack2.pop());


    }
}
