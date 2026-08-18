abstract class Parent {
    abstract void disp1();//incomplete method
    abstract void disp2();//incomplete method
}
class Child1 extends Parent{
    void disp1(){
        System.out.println("Inside child1 disp1");
    }
    void disp2(){
        System.out.println("Inside child1 disp2");
    }
}
class Child2 extends Parent{
    void disp1(){
        System.out.println("Inside child2 disp1");
    }
    void disp2(){
        System.out.println("Inside child2 disp2");
    }
}
class Main {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        access(ch1);
        access(ch2);
    }
    public static void access(Parent parent){
        parent.disp1();
        parent.disp2();
    }
}