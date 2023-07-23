import java.util.Scanner;

class ClassesStudentsJagged {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jag[][] = new int[3][];
        jag[0] = new int[2];
        jag[1] = new int[4];
        jag[2] = new int[3];

        System.out.println("Enter the elements: ");
        for(int i = 0; i <= jag.length - 1; i++) {
            for(int j = 0; j <= jag[i].length - 1; j++) {
                jag[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i <= jag.length - 1; i++) {
            for(int j = 0; j <= jag[i].length - 1; j++) {
                System.out.print(jag[i][j]+" ");
            }
        }
        s.close();
    }    
}
