import java.util.Scanner;

class P11StringToCharArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        char arr[] = str.toCharArray();

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]+" ");
        }

        s.close();
    }
}
