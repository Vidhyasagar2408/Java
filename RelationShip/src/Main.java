class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOS();
        Charger c = new Charger();
        m.hasA(c);
        c.getCharger();
    }
}

class Mobile {
    OS o = new OS();
    Mobile() {
        System.out.println("Mobile created with OS");
    }

    void hasA(Charger ref) {
        System.out.println("Charger acquired and used for charging");
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

class Charger {
    Charger() {
        System.out.println("Charger created");
    }

    void getCharger() {
        System.out.println("Charger is still used for charging");
    }
}