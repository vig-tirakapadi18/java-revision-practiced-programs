class Vehicle {
    void carry() {
        System.out.println("Carrying Vehicle!");
    }

    void speed() {
        System.out.println("Vehicle is speeding!");
    }
}

class Bike extends Vehicle {
    void carry() {
        System.out.println("Bike is Carrying!");
    }

    void speed() {
        System.out.println("Bike is speeding!");
    }
}

class Car extends Vehicle {
    void carry() {
        System.out.println("Car is Carrying!");
    }

    void speed() {
        System.out.println("Car is speeding!");
    }
}

class Bus extends Vehicle {
    void carry() {
        System.out.println("Bus is carrying!");
    }

    void speed() {
        System.out.println("Bus is speeding!");
    }
}

class P20NonPolymorphicExample {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Car cr = new Car();
        Bus bs = new Bus();

        bk.carry();
        bk.speed();

        cr.carry();
        cr.speed();

        bs.carry();
        bs.speed();
    }
}
