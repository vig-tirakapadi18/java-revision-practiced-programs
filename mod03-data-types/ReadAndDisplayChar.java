import java.util.Scanner;

class ReadAndDisplayChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char c = s.next().charAt(0);

        System.out.println("The entered char is: "+c);
        s.close();
    }    
}
