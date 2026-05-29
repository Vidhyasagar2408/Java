class p1 {
    int a = 10;
    void myMethod() {
        class p2 {
            int b = 20;
            void disp2() {
                System.out.println(b);
            }
        }
        p2 p2 = new p2();
        p2.disp2();
    }
    void disp1() {
        System.out.println(a);
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        p1 p1 = new p1();
        p1.myMethod();
        p1.disp1();
    }
}
