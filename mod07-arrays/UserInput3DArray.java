import java.util.Scanner;

class UserInput3DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the block size: ");
        int block = s.nextInt();
        System.out.println("Enter the row size: ");
        int row = s.nextInt();
        System.out.println("Enter the col size: ");
        int col = s.nextInt();

        int arr[][][] = new int[block][row][col];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    arr[i][j][k] = s.nextInt();
                }
            }
        }

        System.out.println("The elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println(arr[i][j][k]+" ");
                }
            }
        }

        s.close();
    }    
}
