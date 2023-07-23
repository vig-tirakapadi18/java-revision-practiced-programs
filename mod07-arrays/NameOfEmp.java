import java.util.Scanner;

class NameOfEmp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name[] = new String[7];

        System.out.println("Enter names: ");
        for(int i =0; i <= name.length - 1; i++){
            System.out.println("Enter name at "+i+" : ");
            name[i] = s.nextLine();
        }

        for(int i = 0; i <= name.length - 1; i++) {
            System.out.println(name[i]);
        }

        s.close();
    }    
}
