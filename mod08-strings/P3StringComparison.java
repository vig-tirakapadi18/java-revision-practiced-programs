class P3StringComparison {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if(s1 == s2) {
            System.out.println("Addresses are Equal!");
        } else {
            System.out.println("Addresses are not Equal!");
        }

        if(s1.equals(s2)) {
            System.out.println("Values are Equal!");
        } else {
            System.out.println("Values are not Equal!");
        }
    }    
}
