import java.util.Scanner;

class SquareOfNumWithInput {
    int sq;

    void square(int num) {
        sq = num * num;
        System.out.println("Square of "+num+" is: "+sq);
    }
}

class SquareOfNumWithInputApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a bumber to find Square: ");
        int num = s.nextInt();

        SquareOfNumWithInput sqnum = new SquareOfNumWithInput();
        sqnum.square(num);
        s.close();
    }
}
