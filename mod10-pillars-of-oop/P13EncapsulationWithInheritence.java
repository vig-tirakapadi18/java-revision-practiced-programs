class Program1 {
    private int a = 10;

    void display1() {
        System.out.println(a);
    }
}

class Program2 extends Program1 {
    int b = 20;

    void display2() {
        // System.out.println(a);  //Compilation Error
        System.out.println(b);
    }
}

class P13EncapsulationWithInheritence {
    public static void main(String[] args) {
        Program2 pgm2 = new Program2();

        pgm2.display1();
        pgm2.display2();
    }
}