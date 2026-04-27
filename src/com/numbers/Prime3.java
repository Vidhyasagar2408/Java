package com.numbers;

import java.util.Scanner;

public class Prime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number: ");
        int end = sc.nextInt();
        System.out.println("Prime number between " + start + " and " + end + " are:");
        if (start == 1){
            start++;
        }
        for (int i = start; i <= end ; i++) {
            if (findPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean findPrime(int n){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
