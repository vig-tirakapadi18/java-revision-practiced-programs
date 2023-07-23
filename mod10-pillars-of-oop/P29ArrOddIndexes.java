import java.util.Scanner;

class P29ArrOddIndexes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <=arr.length -1 ; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The odd indexes are: ");
        for(int i = 0; i <= arr.length -1; i++) {
            if(i % 2 != 1) {
                System.out.println(i);
            }
        }

        s.close();
    }    
}
