class P17StringBufferExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Lenevo");
        System.out.println(s);
        System.out.println(s.length());
        s.append("Dell");
        System.out.println(s);
        System.out.println(s.length());
    }    
}
