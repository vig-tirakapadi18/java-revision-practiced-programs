class MethodOverloadingImplicitTypeCasting2 {
    int add(int x, int y) {
        return x + y;
    }

    float add(float x, float y) {
        return x + y;
    }
}

class MethodOverloadingImplicitTypeCastingApp2 {
    public static void main(String[] args) {
        MethodOverloadingImplicitTypeCasting2 ic = new MethodOverloadingImplicitTypeCasting2();
        System.out.println(ic.add(10, 20.6f));
    }
}
