import java.util.Scanner;

class ReadAndDisplayFullname {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter yout First Name: ");
        String fn = s.next();
        System.out.println("Enter your Last Name: ");
        String ln = s.next();

        System.out.println("Full Name is: "+fn+" "+ln);
        s.close();
    }    
}
