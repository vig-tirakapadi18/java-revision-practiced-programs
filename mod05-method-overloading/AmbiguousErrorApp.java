class AmbiguousError {
    double add(float a, double b) {
        return a + b;
    }

    double add(double a, float b) {
        return a + b;
    }
}

class AmbiguousErrorApp {
    public static void main(String[] args) {
        AmbiguousError ae = new AmbiguousError();
        // System.out.println(ae.add(10, 20));  //Ambiguous Error
    }
}
