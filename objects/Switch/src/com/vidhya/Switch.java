package com.vidhya;

import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("red fruit");
//                break;
//            case "orange":
//                System.out.println("orange fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("enter a valid fruit");
//        }
        int Day = in.nextInt();
        switch (Day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please enter number between 1-7");
        }
    }
}