class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
}

class P24MethodHidingEx4 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();

        Child c = new Child();
        c.display();

        Parent p2 = new Parent();
        p2.display();
    }
}
