import java.util.Scanner;

class P26ArrInputDisplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter teh size of an array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The entrered elements are ");
        int i = 0;
        while(i <= arr.length -1) {
            System.out.println(arr[i]);
            i++;
        }

        s.close();
    }    
}
