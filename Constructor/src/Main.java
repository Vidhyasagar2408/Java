public  class Main {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display1();
        ch.display2();
        ch.display3();
    }
}

class Child extends Parent {
    void display2(){
        System.out.println("Inside child display2");
    }
    void display3(){
        System.out.println("Indside child display3");
    }
}

class Parent {
    void display1(){
        System.out.println("This is Parent display1");
    }
    void display2(){
        System.out.println("This is Parent display2");
    }
}