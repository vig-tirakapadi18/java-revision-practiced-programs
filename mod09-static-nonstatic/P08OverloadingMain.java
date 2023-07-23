class P08OverloadingMain {
    public static void main() {
        System.out.println("Inside first main method!");
    }    

    public static void main(int a) {
        System.out.println("Inside second main method!");
    }

    public static void main(String[] args) {
        System.out.println("Inside third main method!");
        P08OverloadingMain.main(10);
        P08OverloadingMain.main();
    }

    public static void main(int[] args) {
        System.out.println("Inside fourth main method!");
    }
}
