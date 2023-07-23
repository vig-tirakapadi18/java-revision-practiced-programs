class P12HybridInheritence {
    void sleep() {
        System.out.println("Sleeping!");
    }    
}

class Carnivorous extends P12HybridInheritence {
    void food() {
        System.out.println("Eating Flesh!");
    }
}

class Omnivorous extends P12HybridInheritence {
    void food() {
        System.out.println("Eating both Flesh and Grass!");
    }
}

class Herbivorous extends P12HybridInheritence {
    void food() {
        System.out.println("Eating Grass!");
    }
}

class Tiger extends Carnivorous {
    void hunt() {
        System.out.println("Hunting!");
    }
}

class Dog extends Omnivorous {
    void bark() {
        System.out.println("Barking!");
    }
}

class Cow extends Herbivorous {
    void give() {
        System.out.println("Giving Milk!");
    }
}

class P12HybridInheritenceApp {
    public static void main(String[] args) {
        Carnivorous cr = new Carnivorous();
        Omnivorous om = new Omnivorous();
        Herbivorous hr = new Herbivorous();
        Tiger t = new Tiger();
        Dog d = new Dog();
        Cow c = new Cow();

        cr.sleep();
        cr.food();
        
        om.sleep();
        om.food();

        om.sleep();
        hr.food();

        t.sleep();
        t.food();
        t.hunt();

        d.sleep();
        d.food();
        d.bark();

        c.sleep();
        c.food();
        c.give();
    }
}