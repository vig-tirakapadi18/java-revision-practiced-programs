class MethodOverloading1 {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    float add(int a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(int a, float b, float c) {
        return a + b + c;
    }

    float add(float a, int b, float c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

class MethodOverloading1App {
    public static void main(String[] args) {
        MethodOverloading1 mo = new MethodOverloading1();
        int a = 10, b = 20, c = 30;
        float l = 1.2f, m = 2.3f, n = 3.4f;
        double x = 100.65, y = 200.87, z = 366.87;

        System.out.println(mo.add(a, b));
        System.out.println(mo.add(b, l));
        System.out.println(mo.add(a, m, n));
    }
}