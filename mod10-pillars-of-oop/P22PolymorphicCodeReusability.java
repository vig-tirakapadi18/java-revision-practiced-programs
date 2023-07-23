class Vehicle {
    void carry() {
        System.out.println("Vehicle is carrying!");
    }

    void speed() {
        System.out.println("Vehicle is speeding!");
    }
}

class Bike extends Vehicle {
    void carry() {
        System.out.println("Bike is carrying!");
    }

    void speed() {
        System.out.println("Bike is speeding!");
    }
}

class Car extends Vehicle {
    void carry() {
        System.out.println("Car is carrying!");
    }

    void speed() {
        System.out.println("Car is speeding!");
    }
}

class Train extends Vehicle {
    void carry() {
        System.out.println("Train is carrying!");
    }

    void speed() {
        System.out.println("Train is speeding!");
    }
}

class Transport {
    void activity(Vehicle ref){
        ref.carry();
        ref.speed();
    }
}

class P22PolymorphicCodeReusability {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Car cr = new Car();
        Train tr = new Train();

        Transport tp = new Transport();

        tp.activity(bk);
        tp.activity(cr);
        tp.activity(tr);
    }
}
