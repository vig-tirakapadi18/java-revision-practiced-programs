class MethodOverloading2 {
    int add(int x, int y) {
        return x + y;
    }    

    float add(float x, float y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }
}

class MethodOverloading2App {
    public static void main(String[] args) {
        MethodOverloading2 mo = new MethodOverloading2();
        int a = 10, b = 20;
        float l = 10.4f, m = 20.5f;
        double x = 100.456, y = 200.654;

        System.out.println(mo.add(a, b));
        System.out.println(mo.add(l, m));
        System.out.println(mo.add(x, y));
    }
}