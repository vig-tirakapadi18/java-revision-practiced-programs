class P1StaticNonStatic {
    static int x, y, z;

    static {
        x = 10;
        y = 20;
        z = 35;
    }

    static void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    int a, b, c;
    
    {
        a = 26;
        b = 45;
        c = 67;
    }

    void displayAgain() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}