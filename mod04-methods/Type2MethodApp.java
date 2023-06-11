class Type2Method {
    void add(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}

class Type2MethodApp {
    public static void main(String[] args) {
        Type2Method tm = new Type2Method();
        tm.add(10, 20);
    }
}
