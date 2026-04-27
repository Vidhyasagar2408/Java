package com.vidhya;

import java.util.Scanner;

public class Largest {
    public static void main() {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q. find the largest of 3 number
        //1....
//        int max = a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        //2....
//        int max = Math.max(c,(Math.max(a,b)));
//        System.out.println(max);

        //3...
        int max = 0;
        if (a>max){
            max=a;
        }else{
            max=b;
        }

        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
