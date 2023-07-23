import java.util.Scanner;

class UserInput2DJagged {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = s.nextInt();
        int arr[][] = new int[row][];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter col at "+i+" row: ");
            int col = s.nextInt();
            arr[i] = new int[col];

            for(int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter element: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("The entered nums are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println(arr[i][j]+" ");
            }
        }

        s.close();
    }
}