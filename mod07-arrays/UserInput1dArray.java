import java.util.Scanner;

class UserInput1dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an element: ");
            arr[i] = s.nextInt();
        }

        System.out.println("The elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]+" ");
        }

        s.close();
    }
}
