package com.object;

public class PersonApplication {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=12;
        p1.name="Raja";
        System.out.println(p1.age);
        System.out.println(p1.name);

        p1.work();
        p1.sleep();
    }
}
