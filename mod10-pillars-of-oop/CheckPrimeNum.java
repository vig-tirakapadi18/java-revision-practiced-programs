import java.util.Scanner;

class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();

        if(num <= 0) {
            System.out.println("The number "+num+" is NOT Prime Number!");
        } else {
            for(int i = 1; i <= num; i++) {
                if(num * i != num && i * num == num) {
                    System.out.println("The number "+num+" is Prime Number!");
                    break;
                } else {
                    System.out.println("The number "+num+" is NOT Prime Number!");
                }
            }
        }

        s.close();
    }    
}
