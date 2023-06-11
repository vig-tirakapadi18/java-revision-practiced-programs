class Laptop {
    String brand;
    String processor;
    int cost;

    void switchOn() {
        System.out.println("Switching On!");
    }

    void work() {
        System.out.println("Working!");
    }

    void switchOff() {
        System.out.println("Switching Off!");
    }
}

class LaptopApp {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();

        l1.brand = "HP";
        l1.processor = "I5";
        l1.cost = 42000;

        l2.brand = "Dell";
        l2.processor = "I7";
        l2.cost = 61000;

        l1.switchOn();
        l1.switchOff();

        l2.switchOn();
        l2.work();
        l2.switchOff();
    }
}
