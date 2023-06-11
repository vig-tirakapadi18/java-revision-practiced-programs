class Type3Method {
    int add() {
        int a = 10, b = 20, res;
        res = a + b;
        return res;
    }
}

class Type3MethodApp {
    public static void main(String[] args) {
        Type3Method tm = new Type3Method();
        int res = tm.add();
        System.out.println(res);
    }
}
