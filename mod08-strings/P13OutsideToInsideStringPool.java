import java.util.Scanner;

class P13OutsideToInsideStringPool {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a first string: ");
        String str1 = s.nextLine();
        System.out.println("Enter a second string: ");
        String str2 = s.nextLine();
        System.out.println("Enter a third string: ");
        // String str3 = s.nextLine();

        String s1 = str1.intern();
        String s2 = str2.intern();
        // String s3 = str3.intern();

        if(s1 == s2) {
            System.out.println("Addresses are equal!");
        } else {
            System.out.println("Addresses are not equal!");
        }

        s.close();
    }    
}
