import java.util.Scanner;

class IsPositiveNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        
        if(num >= 0) {
            System.out.println("Given number is POSITIVE!");
        } else {
            System.out.println("Given number is NEGATIVE!");
        } 
        s.close();
    }    
}
