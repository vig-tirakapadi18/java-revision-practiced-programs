import java.util.Scanner;

class IsEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        if(num % 2 == 0) {
            System.out.println("Given number is EVEN!");
        }

        s.close();
    }    

}
