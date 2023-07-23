import java.util.Scanner;

class ElevatorProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float w[] = new float[10];
        
        System.out.println("Enter the weights: ");
        
        for(int i = 0; i <= w.length - 1; i++) {
            int pos = i+1;
            System.out.println("Enter the weight of person "+pos+" : ");
            w[i] = s.nextFloat();
        }
       
        float sum = 0.0f;

        for(int i = 0; i <= w.length - 1; i++) {
            sum = sum + w[i];
        }

        System.out.println("The total weight is: "+sum);

        if(sum <= 500) {
            System.out.println("Lift is working!");
        } else {
            System.out.println("Lift is overloaded!");
        }

        s.close();
    }    
}
