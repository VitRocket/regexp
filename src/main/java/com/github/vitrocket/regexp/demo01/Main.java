package com.github.vitrocket.regexp.demo01;

public class Main {
    public static void main(String[] args) {
        /*

        \\d - one number

        + - 1 or more более
        * - 0 or more более
        ? - 0 or 1 symbols before

        (x|y|x) - one string from a lot of strings

         */

        System.out.println("\n--------------- 01 ---------------");
        String str01 = "Hello";
        System.out.println(str01);
        System.out.println("regexp: \"Hello\"");
        System.out.println(str01.matches("Hello"));
        System.out.println("--------------- 01 ---------------\n");

        System.out.println("\n--------------- 02 ---------------");
        String str02 = "Hello 2";
        System.out.println(str02);
        System.out.println("regexp: \"Hello \\\\d\"");
        System.out.println(str02.matches("Hello \\d"));
        System.out.println("--------------- 02 ---------------\n");

        System.out.println("\n--------------- 03 ---------------");
        String str03 = "Hello 123";
        System.out.println(str03);
        System.out.println("regexp: \"Hello \\\\d+\"");
        System.out.println(str03.matches("Hello \\d+"));
        System.out.println("--------------- 03 ---------------\n");

        System.out.println("\n--------------- 04 ---------------");
        String str04 = "Hello ";
        System.out.println(str04);
        System.out.println("regexp: \"Hello \\\\d*\"");
        System.out.println(str04.matches("Hello \\d*"));
        System.out.println("--------------- 04 ---------------\n");

        System.out.println("\n--------------- 05 ---------------");
        String str05 = "Hello -5";
        System.out.println(str05);
        System.out.println("regexp: \"Hello -\\\\d\"");
        System.out.println(str05.matches("Hello -\\d*"));
        System.out.println("--------------- 05 ---------------\n");

        System.out.println("\n--------------- 06 ---------------");
        String str06 = "Hello 5";
        System.out.println(str05 + "\n" + str06);
        System.out.println("regexp: \"Hello -?\\\\d\"");
        System.out.println(str05.matches("Hello -?\\d*"));
        System.out.println(str06.matches("Hello -?\\d*"));
        System.out.println("--------------- 06 ---------------\n");

        System.out.println("\n--------------- 07 ---------------");
        String str07 = "Hello +5";
        System.out.println(str05 + "\n" + str06 + "\n" + str07);
        System.out.println("regexp: \"Hello (-|\\+)?\\\\d\"");
        System.out.println(str05.matches("Hello (-|\\+)?\\d*"));
        System.out.println(str06.matches("Hello (-|\\+)?\\d*"));
        System.out.println(str07.matches("Hello (-|\\+)?\\d*"));
        System.out.println("--------------- 07 ---------------\n");


    }
}
