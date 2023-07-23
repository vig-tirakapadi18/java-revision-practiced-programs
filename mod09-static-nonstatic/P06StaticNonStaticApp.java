class P06StaticNonStatic {
    static int x, y, z;
    int a, b, c;
    
    static {
        System.out.println("Inside static block!");
        x = 11;
        y = 22;
        z = 33;
    }

    {
        System.out.println("Inside non-static block!");
        a = 44;
        b = 55;
        c = 66;
        x = 12;
        y = 34;
        z = 56;
    }

    static void display() {
        System.out.println("Inside static method!");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    void displayAgain() {
        System.out.println("Inside non-static method!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class P06StaticNonStaticApp {
    public static void main(String[] args) {
        P06StaticNonStatic.display();

        P06StaticNonStatic sn = new P06StaticNonStatic();
        sn.displayAgain();
    }
}
