package com.vidhya;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
//        String messsage = greet();
//        System.out.println(messsage);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }
    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }
}
