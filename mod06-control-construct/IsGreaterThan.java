import java.util.Scanner;

class IsGreaterThan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = s.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = s.nextInt();

        if(num1 > num2) {
            System.out.println(num1+" is greater than "+num2+" !");
        } else {
            System.out.println(num2+" is greater than "+num1+" !");
        }
        s.close();
    }    
}
