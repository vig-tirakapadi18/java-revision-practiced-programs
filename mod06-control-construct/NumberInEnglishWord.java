import java.util.Scanner;

class NumberInEnglishWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 9: ");
        int num = s.nextInt();

        switch(num) {
            case 1: System.out.println("ONE!");
                break;

            case 2: System.out.println("TWO!");
                break;

            case 3: System.out.println("THREE!");
                break;

            case 4: System.out.println("FOUR!");
                break;

            case 5: System.out.println("FIVE!");
                break;

            case 6: System.out.println("SIX!");
                break;

            case 7: System.out.println("SEVEN!");
                break;

            case 8: System.out.println("EIGHT!");
                break;

            case 9: System.out.println("NINE!");
                break;

            default: System.out.println("Only number between 0 to 9!");
        }

        s.close();
    }    
}
