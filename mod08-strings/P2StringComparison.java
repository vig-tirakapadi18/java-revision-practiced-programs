class P2StringComparison {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        if(str1 == str2) {
            System.out.println("Addresses are Equal!");
        } else {
            System.out.println("Addresses are not Equal!");
        }

        if(str1.equals(str2)) {
            System.out.println("Values are Equal!");
        } else {
            System.out.println("Values are not equal!");
        }
    }    
}
