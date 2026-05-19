class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOS();

    }
}

class Mobile {
    OS o = new OS();
    Mobile() {
        System.out.println("Mobile created with OS");
    }
}

class OS {

    OS(){
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS is still executing");
    }
}