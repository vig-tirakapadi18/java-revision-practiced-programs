class Parent {
    int x, y;

    public Parent() {
        super();
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
        super(77,88);
        System.out.println("Child 0-Para Constructor!");
        p = 44;
        q = 55;
    }

    public Child(int p, int q) {
        super(77);
        System.out.println("Child 1-Para Constructor!");
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

class P17ConstructorOverloading {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();

        Child c2 = new Child();
        c2.display();
    }
}
