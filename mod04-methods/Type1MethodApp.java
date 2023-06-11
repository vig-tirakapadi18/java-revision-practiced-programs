class Type1Method {
    void add() {
        int a = 10, b = 20, res;
        res = a +b;
        System.out.println(res);
    }
}

class Type1MethodApp {
    public static void main(String[] args) {
        Type1Method tm = new Type1Method();
        tm.add();
    }
}