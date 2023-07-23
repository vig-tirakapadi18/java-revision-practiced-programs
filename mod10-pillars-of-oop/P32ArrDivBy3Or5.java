import java.util.Scanner;

class P32ArrDivBy3Or5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The nums div by 3 or 5 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
        s.close();
    }    
}
