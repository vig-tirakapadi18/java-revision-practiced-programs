import java.util.Scanner;

class ReadAndDisplayNameApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.next();

        System.out.println("The name is: "+name);
        s.close();
    }    
}
