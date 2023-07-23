class Parent {
    static void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child");
    }
}

class P25MethodHidingEx2 {
    public static void main(String[] args) {
        Parent.display();
        Child.display();
        Parent.display();
    }
}
