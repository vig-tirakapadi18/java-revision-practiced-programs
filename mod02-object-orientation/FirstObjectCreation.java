class FirstObjectCreation {
    String brand;
    String color;
    int cost;

    void start() {
        System.out.println("Bike is Started!");
    }

    void move() {
        System.out.println("Bike is moving!");
    }

    void stop() {
        System.out.println("Bike is Stopped!");
    }

    public static void main(String[] args) {
        FirstObjectCreation fo = new FirstObjectCreation();
        fo.brand = "Honda";
        fo.color ="Blue";
        fo.cost = 75000;

        fo.start();
        fo.move();
        fo.stop();
    }
}