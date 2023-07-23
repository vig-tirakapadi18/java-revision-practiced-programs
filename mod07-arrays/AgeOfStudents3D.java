import java.util.Scanner;

class AgeOfStudents3D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ages[][][] = new int[2][2][3];

        System.out.println("Enter the ages: ");
        for(int i = 0; i <= ages.length - 1; i++) {
            for(int j = 0; j<= ages[i].length - 1; j++) {
                for(int k = 0; k <= ages[i][j].length - 1; k++) {
                    ages[i][j][k] = s.nextInt();
                } 
            }
        }

        System.out.println("The ages are: ");
        for(int i = 0; i <= ages.length - 1; i++) {
            for(int j = 0; j <= ages[i].length - 1; j++) {
                for(int k = 0; k<= ages[i][j].length - 1; k++) {
                    System.out.println(ages[i][j][k]+" ");
                }
            }
        }
        s.close();
    }    
}
