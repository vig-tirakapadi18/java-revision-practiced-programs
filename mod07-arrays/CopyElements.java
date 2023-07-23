import java.util.Scanner;

class CopyElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int originalEls[] = new int[5];
        int copiedEls[] = new int[5];

        System.out.println("Enter elements: ");
        for(int i = 0; i <=originalEls.length - 1; i++) {
            System.out.println("Enter an el: ");
            originalEls[i] = s.nextInt();
        }

        for(int j = 0; j <= copiedEls.length - 1; j++) {
            for(int i = 0; i <= originalEls.length -1; i++) {
                copiedEls[j] = originalEls[i];
            }
        }

        System.out.println("Original Array elements are: ");
        for(int i = 0; i <= originalEls.length - 1; i++) {
            System.out.print(originalEls[i]+" ");
        }

        System.out.println();

        System.out.println("Copied array elements are: ");
        for(int i = 0; i <= copiedEls.length - 1; i++) {
            System.out.println(copiedEls[i]+" ");
        }

        s.close();
    }    
}
