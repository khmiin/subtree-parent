package com.atex.ace.parent;


import com.atex.ace.subproject.ApplicationConfig;
import com.atex.ace.subproject.ParentConfig;

public class HelloWorldMain {

    public static void main(String[] args) {
        System.out.println("*** " + HelloWorldMain.class.getName());
        System.out.println(ApplicationConfig.VERSION);
        System.out.println(ParentConfig.NAME);
    }

}
