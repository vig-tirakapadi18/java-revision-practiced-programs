import java.util.Scanner;

class P02AreaOfCircle {
    static double pi;
    double r;
    double area;
    Scanner s = new Scanner(System.in);

    static {
        pi = 3.142;
    }

    void takeInput() {
        System.out.println("Enter radius: ");
        r = s.nextDouble();
    }
        
    void calculate() {
        area = pi * r * r;
    }

    void display() {
        System.out.println("The area of circle is: "+area);
    }
}


class P02AreaOfCircleApp {
    public static void main(String[] args) {
        P02AreaOfCircle a1 = new P02AreaOfCircle();
        P02AreaOfCircle a2 = new P02AreaOfCircle();

        a1.takeInput();
        a2.takeInput();

        a1.calculate();
        a2.calculate();

        a1.display();
        a2.display();
    }
}