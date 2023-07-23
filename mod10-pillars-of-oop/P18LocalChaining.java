class Parent {
    int x,  y;

    public Parent() {
        super();
        System.out.println("Parent 0-Para Constructor!");
        x = 10;
        y = 20;
    }

    public Parent(int x) {
        this();
        System.out.println("Parent 1-Para Constructor!");
        this.x = x;
        y = 22;
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
        this(55, 66);
        System.out.println("Child 0-Para Constructor!");
        p = 77;
        q = 88;
    }

    public Child(int p, int q) {
        super(99);
        System.out.println("Child 2-Para Constructor!");
        this.p = p;
        this.q = q;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}

class P18LocalChaining {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
