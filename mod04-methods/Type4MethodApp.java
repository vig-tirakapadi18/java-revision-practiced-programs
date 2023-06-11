class Type4Method {
    int add(int a, int b) {
        int res = a + b;
        return res;
    }
}

class Type4MethodApp {
    public static void main(String[] args) {
        Type4Method tm = new Type4Method();
        int res = tm.add(10, 20);
        System.out.println(res);
    }
}
