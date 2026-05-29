class Prog1 {
    int a = 10;
    class Prog2 {
        int b = 20;
        void disp2() {

            System.out.println(b);
        }
    }
    void disp() {
        System.out.println(a);
    }
}

class Main {
    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.disp();
        Prog1.Prog2 p2 = p1.new Prog2();
        p2.disp2();
    }
}