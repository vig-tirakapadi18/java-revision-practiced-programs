class P05MultipleStaticBlocks {
    static {
        System.out.println("First Static Block!");
    }    

    static {
        System.out.println("Second Static Block!");
    }

    static {
        System.out.println("Third Static Block!");
    }

    public static void main(String[] args) {
        System.out.println("Main method Execution!");
    }
}
