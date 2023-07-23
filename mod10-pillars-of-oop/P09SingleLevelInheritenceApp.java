class P09SingleLevelInheritence {
    String name;

    void work() {
        System.out.println("Working!");
    }
}

class SmartPhone extends P09SingleLevelInheritence {

}

class P09SingleLevelInheritenceApp {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.name = "MI";
        sp.work();
    }
}
