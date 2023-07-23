class Program1 {
    protected void display() {
        System.out.println("Program 01");
    }
}

class Program2 extends Program1 {
    protected void display() {
        System.out.println("Program 02");
    }
}

class Program3 extends Program1 {
    public void display() {
        System.out.println("Program 03");
    }
}

class Program4 extends Program1 {
    // void display() {     //Visibility is decreasing so not allowed
    //     System.out.println("Program 04");
    // }
}

class P37MethodOverridingRule1 {
    public static void main(String[] args) {
        Program2 p2 = new Program2();
        p2.display();

        Program3 p3 = new Program3();
        p3.display();
    }
}
