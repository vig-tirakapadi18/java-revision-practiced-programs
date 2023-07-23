import java.util.Scanner;

class LargestOf3Nums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Fisrt number: ");
        int num1 = s.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = s.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = s.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1+" is Largest!");
        }else if(num2 > num1 && num2 > num3) {
            System.out.println(num2+" is Largest!");
        } else {
            System.out.println(num3+" is Largest!");
        }
        s.close();
    }    
}
