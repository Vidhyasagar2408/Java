package com.objects;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id=1;
        e1.name="vidhya";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2 = new Employee();
        e2.id=2;
        e2.name="sagar";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
    }
}
