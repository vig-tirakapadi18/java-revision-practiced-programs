import java.util.Scanner;

class EvenOddPositiveNegagative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num % 2 == 0) {
            if(num >= 0) {
                System.out.println(num+" is EVEN and POSITIVE!");
            } else {
                System.out.println(num+" is EVEN and NEGATIVE!");
            }
        } else {
            if(num < 0) {
                System.out.println(num+" is ODD and NEGATIVE!");
            } else {
                System.out.println(num+" is ODD and POSITIVE!");
            }
        }

        s.close();
    }
}
