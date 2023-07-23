class Program1 {
    int x = 111;
    void display1() {
        System.out.println(x);
    }
}

class Program2 extends Program1 {
    int x = 222;
    void display2() {
        System.out.println(x);
    }
}

class Program3 extends Program2 {
    int x = 333;
    void display3() {
        System.out.println(x);
        System.out.println(super.x);
        // System.out.println(super.super.x);
    }
}

class P19SuperKeyword {
    public static void main(String[] args) {
        Program3 p = new Program3();
        p.display3();
    }
}
