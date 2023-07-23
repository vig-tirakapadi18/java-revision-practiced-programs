import java.util.Scanner;

class P34ArrIndexMulOf2And4 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The indexes mul of 2 and 4 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(i % 2 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
        s.close();
    }    
}
