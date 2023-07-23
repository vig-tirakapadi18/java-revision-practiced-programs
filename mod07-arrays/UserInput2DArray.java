import java.util.Scanner;

class UserInput2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = s.nextInt();
        System.out.println("Enter the column size: ");
        int col = s.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("The entered elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println(arr[i][j]+" ");
            }
        }

        s.close();
    }    
}
