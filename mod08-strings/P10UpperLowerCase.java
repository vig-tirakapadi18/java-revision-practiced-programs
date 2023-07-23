import java.util.Scanner;

class P10UpperLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.next();

        String uc = str.toUpperCase();
        System.out.println(uc);

        String lc = str.toLowerCase();
        System.out.println(lc);

        s.close();
    }    
}
