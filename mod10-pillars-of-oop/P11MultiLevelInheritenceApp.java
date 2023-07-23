class P11MultiLevelInheritence {
    void sleep() {
        System.out.println("Sleeping!");
    }
}

class Carnivorous extends P11MultiLevelInheritence {
    void food() {
        System.out.println("Eating Flesh!");
    }
}

class Tiger extends Carnivorous {
    void hunt() {
        System.out.println("Hunting!");
    }
}

class P11MultiLevelInheritenceApp {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        t.sleep();
        t.food();
        t.hunt();
    }
}
