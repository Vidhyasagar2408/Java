class Program1 {
    int a = 10;
    static class Prog2 {
        static int b = 20;
        static void disp2() {
            System.out.println(b);
        }
    }
    void disp1() {
        System.out.println(a);
        Prog2.disp2();
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.disp1();
        Program1.Prog2.disp2();
    }
}
