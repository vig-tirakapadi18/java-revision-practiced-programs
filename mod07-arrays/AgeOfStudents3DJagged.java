import java.util.Scanner;

class AgeOfStudents3DJagged {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ages[][][] = new int[2][][];
        ages[0] = new int[2][];
        ages[1] = new int[3][];
        ages[0][0] = new int[2];
        ages[0][1] = new int[4];
        ages[1][0] = new int[3];
        ages[1][1] = new int[2];
        ages[1][2] = new int[4];
        
        System.out.println("Enter the ages: ");
        for(int i = 0; i <= ages.length - 1; i++) {
            for(int j = 0; j <= ages[i].length - 1; j++) {
                for(int k = 0; k <= ages[i][j].length - 1; k++) {
                    ages[i][j][k] = s.nextInt();
                }
            }
        }

        System.out.println("The ages are: ");
        for(int i = 0; i <= args.length - 1; i++) {
            for(int j = 0; j <= ages[i].length -1; j++) {
                for(int k = 0; k <= ages[i][j].length - 1; k++) {
                    System.out.print(ages[i][j][k]+" ");
                }
            }
        }

        s.close();
    }    
}
