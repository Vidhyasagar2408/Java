package com.vidhya;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String Department = in.next();

        switch (EmpID){
            case 1:
                System.out.println("vidhyasagar");
                break;
            case 2:
                System.out.println("veeresh");
                break;
            case 3:
                System.out.println("surag");
                break;
            case 4:
                switch (Department){
                    case "IT":
                        System.out.println("ID Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("enter correct department");
                }
                break;
            default:
                System.out.println("enter valid EmpID");
        }
    }
}
