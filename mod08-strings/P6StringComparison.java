class P6StringComparison {
    public static void main(String[] args) {
        String s1 = "VIGH!";
        String s2 = "VIGHNESH!";

        if(s1.compareTo(s2) > 0) {
            System.out.println("s1 is greater than s2!");
        } else if(s1.compareTo(s2) < 0) {
            System.out.println("s1 is lesser than s2!");
        } else {
            System.out.println("s1 is equals to s2!");
        }
    }    
}
