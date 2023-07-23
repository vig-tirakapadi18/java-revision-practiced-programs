class Parent {
    int x, y;

    public Parent() {
        System.out.println("Parent 0-Para Constructor!");

        x = 10;
        y = 20;
    }

    public Parent(int x) {
        super();
        System.out.println("Parent 1-Para Constructor!");
        this.x = x;
        y = 25;
    }

    public Parent(int x, int y) {
        super();
        System.out.println("Parent 2-Para Constructor!");
        this.x = x;
        this.y = y;
    }
}

class Child extends Parent {
    int p, q;

    public Child() {
        super();
        System.out.println("Child 0-Para Constructor!");
        p = 111;
        q = 222;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}

class P16InheritanceExecutionOfConstructors {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
