package com.numbers;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n == 1){
            System.out.println("Not a Prime Number");
        } else {
            findPrime(n);
        }
    }
    static void findPrime(int n){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
