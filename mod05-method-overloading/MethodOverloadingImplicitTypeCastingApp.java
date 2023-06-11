class MethodOverloadingImplicitTypeCasting {
    int add(int x, int y) {
        return x + y;
    }

    float add(float x, float y) {
        return x + y;
    }
}

class MethodOverloadingImplicitTypeCastingApp {
    public static void main(String[] args) {
        MethodOverloadingImplicitTypeCasting ic = new MethodOverloadingImplicitTypeCasting();
        // System.out.println(ic.add(30.5, 10.6)); //Error
        System.out.println(ic.add(10, 10.6f));
    }
}
