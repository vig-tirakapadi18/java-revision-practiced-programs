package p1;

class PackageExample {
    public int a;
    protected int b;
    int c;
    private int d;
    
    void display1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Program2 extends PackageExample {
    void display2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d);
    }
}

class Program3 {
    void display3() {
        PackageExample p = new PackageExample();
        System.out.println(p.a);
        System.out.println(p.b);
        System.out.println(p.c);
        // System.out.println(p.d);
    }
}
