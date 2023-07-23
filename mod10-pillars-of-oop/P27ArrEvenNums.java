import java.util.Scanner;

class P27ArrEvenNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.err.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Even nums are: ");
        int i = 0;
        while(i <= arr.length - 1){
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
            i++;
        }

        s.close();
    }    
}
