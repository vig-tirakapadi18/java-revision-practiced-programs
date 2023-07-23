class P36ArrGreatestNum {
    public static void main(String[] args) {
        int arr[] = {20, 567, 10, 34, 27, 1023};

        int greatest = arr[0];
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        System.out.println("Greatest of all elements is: "+ greatest);
    }
}
