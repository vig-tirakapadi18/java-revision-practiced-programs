class P35ArrSmallestNum {
    public static void main(String[] args) {
       int arr[] = {20, 1, 34, 10};

        int smallest = arr[0];
        System.out.println("The smallest number is: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest num is "+smallest);
    }
}