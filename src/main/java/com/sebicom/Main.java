package com.sebicom;

import com.sebicom.llama.Example;

public class Main {

    public static void main(String[] args) {
        try {
            Example example = new Example();
            example.printSystemInfo();
            example.initModel();
        }catch(Throwable t) {
            p("ERROR: " + t);
        }
    }

    public static void p(String s) {
        System.out.println(s);
    }
}