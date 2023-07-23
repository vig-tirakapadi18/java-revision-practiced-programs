class P18StringCapacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" is Awesome!");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" I love Java!");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" So I am learning Java!");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }    
}
