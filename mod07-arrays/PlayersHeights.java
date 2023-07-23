import java.util.Scanner;

class PlayersHeights {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double heights[][] = new double[3][7];

        System.out.println("Enter the heights: ");
        for(int i = 0; i <= heights.length - 1; i++) {
            for(int j = 0; j <= heights[i].length - 1; j++) {
                System.out.println("Enter the height at "+i+" "+j+" : ");
                heights[i][j] = s.nextDouble();
            }
        }

        System.out.println();

        System.out.println("The heights are: ");
        for(int i = 0; i <= heights.length - 1; i++){
            for(int j = 0; j <= heights[i].length - 1; j++) {
                System.out.print(heights[i][j]+" ");
            }
        }
        s.close();
    }    
}
