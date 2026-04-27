package com.vidhya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10,29);
        System.out.println(ans);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1:");
        int num1= in.nextInt();
        System.out.print("enter number 2:");
        int num2= in.nextInt();
        int sum = num1+num2;
        System.out.println("the sum = " + sum);
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1:");
        int num1= in.nextInt();
        System.out.print("enter number 2:");
        int num2= in.nextInt();
        int sum = num1+num2;
        return sum;
    }

    //passing value as parameters
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }
}
