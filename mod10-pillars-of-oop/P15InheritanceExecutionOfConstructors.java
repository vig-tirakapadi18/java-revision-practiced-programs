class Program1 {
    int x = 10;

    void display1() {
        System.out.println("Program 1");
    }
}

class Program2 extends Program1 {
    int y;

    public Program2() {
        super();
        y = 20;
    }

    void display2() {
        System.out.println("Program 2");
    }
}

class P15InheritanceExecutionOfConstructors {
    public static void main(String[] args) {
        Program2 p2 = new Program2();
        p2.display2();
    }   
}
