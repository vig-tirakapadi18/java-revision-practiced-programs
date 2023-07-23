class P10HirerchicalInheritence {
    void attack() {
        System.out.println("Attacking!");
    }    
}

class Army extends P10HirerchicalInheritence {
    void secureLand() {
        System.out.println("Securing Land!");
    }
}

class AirForce extends P10HirerchicalInheritence {
    void secureAir() {
        System.out.println("Securing Air!");
    }
}

class Navy extends P10HirerchicalInheritence {
    void secureWater() {
        System.out.println("Securing Water!");
    }
}

class P10HirerchicalInheritenceApp {
    public static void main(String[] args) {
        Army a = new Army();
        AirForce af = new AirForce();
        Navy n = new Navy();

        a.attack();
        a.secureLand();

        af.attack();
        af.secureAir();

        n.attack();
        n.secureWater();
    }
}
