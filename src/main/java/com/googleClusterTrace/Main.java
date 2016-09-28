package com.googleClusterTrace;

/**
 * Created by nouman on 9/27/16.
 */
public class Main {
    public static void main(String[] args) {
        ConcatJobEvents cje = new ConcatJobEvents();
        cje.run();
        System.out.println("Job successfully completed!");
    }
}
