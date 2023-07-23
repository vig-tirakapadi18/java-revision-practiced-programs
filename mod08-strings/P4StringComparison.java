class P4StringComparison {
    public static void main(String[] args) {
        String s1 = new String("Mango");
        String s2 = new String("MANGO");

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

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Values are equal ignoring case!");
        } else {
            System.out.println("Values are not equal ignoring case!");
        }
    }    
}
