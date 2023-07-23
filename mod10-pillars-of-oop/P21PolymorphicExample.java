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

// class P21PolymorphicExample {
//     public static void main(String[] args) {
//         Vehicle ref;
//         Bike bk = new Bike();
//         Car cr = new Car();
//         Train tr = new Train();

//         ref = bk;
//         ref.carry();
//         ref.speed();

//         ref = cr;
//         ref.carry();
//         ref.speed();

//         ref = tr;
//         ref.carry();
//         ref.speed();
//     }
// }

class P21PolymorphicExample {
    public static void main(String[] args) {
        Vehicle ref;

        ref = new Bike();
        ref.carry();
        ref.speed();

        ref = new Car();
        ref.carry();
        ref.speed();

        ref = new Train();
        ref.carry();
        ref.speed();
    }
}
