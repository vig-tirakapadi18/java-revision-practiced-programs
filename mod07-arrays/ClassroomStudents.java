import java.util.Scanner;

class ClassroomStudents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stus[][] = new int[3][4];

        System.out.println("Enter ages of students: ");
        for(int i = 0; i <= stus.length - 1; i++) {
            for(int j = 0; j <= stus[i].length -1; j++) {
                System.out.println("Enter age at "+i+ " "+j+ " : ");
                stus[i][j] = s.nextInt();
            }
        }

        System.out.println("The ages are: ");
        for(int i = 0; i <= stus.length - 1; i++) {
            for(int j = 0; j <= stus[i].length -1; j++) {
                System.out.print(stus[i][j]+" ");
            }
        }

        s.close();
    }    
}
