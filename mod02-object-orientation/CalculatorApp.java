class Calculator {
    int n1 = 10, n2 = 20, res;

    void add() {
        res = n1 + n2;
        System.out.println("Addition is: "+res);
    }

    void sub() {
        res = n1 - n2;
        System.out.println("Subtraction is: "+res);
    }

    void mul() {
        res = n1 * n2;
        System.out.println("Multiplication is: "+res);
    }

    void div() {
        res = n1 / n2;
        System.out.println("Division is: "+res);
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
