import java.util.Scanner;

class NumberInEnglishWord2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 0 t0 9: ");
        int num = s.nextInt();

        if(num >=1 && num <=9) {
            if(num == 1) {
                System.out.println("ONE!");
            } else if(num == 2) {
                System.out.println("TWO!");
            } else if(num == 3) {
                System.out.println("THREE!");
            } else if(num == 4) {
                System.out.println("FOUR!");
            } else if (num == 5){
                System.out.println("FIVE!");
            } else if(num == 6) {
                System.out.println("SIX!");
            } else if(num == 7) {
                System.out.println("SEVEN!");
            } else if(num == 8) {
                System.out.println("EIGHT!");
            } else if(num == 9) {
                System.out.println("NINE!");
            } else {
                System.out.println("Only enter number between 0 to 9!");
            }
        }

        s.close();
    }    
}
