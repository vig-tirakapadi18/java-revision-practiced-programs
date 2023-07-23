import java.util.Scanner;

class OrganizationEmployees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String names[][] = new String[4][5];

        System.out.println("Enter the names: ");
        for(int i = 0; i <= names.length - 1; i++) {
            for(int j = 0; j <=names[i].length - 1; j++) {
                System.out.println("Enter a name at "+i+" "+j+" : ");
                names[i][j] = s.nextLine();
            }
        }

        System.out.println("Names are: ");
        for(int i = 0; i <= names.length - 1; i++) {
            for(int j = 0; j <= names[i].length - 1; j++) {
                System.out.print(names[i][j]+" ");
            }
        }

        s.close();
    }    
}
