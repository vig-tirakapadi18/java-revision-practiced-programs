import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums[] = new int[5];

        System.out.println("Enter 5 nums..(Person 1).");
        for(int i = 0; i <= nums.length - 1; i++) {
            System.out.println("Enter a num: ");
            nums[i] = s.nextInt();
        }

        boolean isWon = false;

        System.out.println("Guess a num(Person 2): ");
        int guessedNum = s.nextInt();

        for(int i = 0; i <= nums.length -1; i++) {
            if(guessedNum == nums[i]) {
                isWon = true;
            } else {
                isWon = false;
            }
        }

        if(isWon) {
            System.out.println("Person 1 Won!");
        } else {
            System.out.println("Person 2 Won!");
        }

        s.close();
    }    
}
