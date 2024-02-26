package org.example;

public class Command {
    public static void main(@org.jetbrains.annotations.NotNull String args[]) {
        for(int i=0; i<args.length; i++)
            System.out.println("args["+ i +"]:" + args [i]);
    }
}
