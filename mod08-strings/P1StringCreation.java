class P1StringCreation {
    public static void main(String[] args) {
        // Approach 1
        String str1 = new String("Vighnesh!");
        System.out.println(str1);

        // Approach 2
        char arr[] = {'J', 'A', 'V', 'A'};
        String str2 = new String(arr);
        System.out.println(str2);

        // Approach 3
        String str3 = "Kodnest";
        System.out.println(str3);
    }
}