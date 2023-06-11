import java.util.Scanner;

class CalcWithInput {
    int res;

    void add(int num1, int num2) {
        res = num1 + num2;
        System.out.println("Addition of "+num1+" and "+num2+" is: "+res);
    }

    void sub(int num1, int num2) {
        res = num1 - num2;
        System.out.println("Subtraction of "+num1+" and "+num2+" is: "+res);
    }

    void mul(int num1, int num2) {
        res = num1 * num2;
        System.out.println("Multiplication of "+num1+" and "+num2+" is: "+res);
    }

    void div(int num1, int num2) {
        res = num1 / num2;
        System.out.println("Division of "+num1+" and "+num2+" is: "+res);
    }
}

class CalcWithInputApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a First num: ");
        int num1 = s.nextInt();
        System.out.println("Enter a second num: ");
        int num2 = s.nextInt();
        
        CalcWithInput c = new CalcWithInput();
        c.add(num1, num2);
        c.sub(num1, num2);
        c.mul(num1, num2);
        c.div(num1, num2);

        s.close();
    }
}
