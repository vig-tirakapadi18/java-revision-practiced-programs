class InstanceVariables {
    int i;
    byte b;
    float f;
    String s;
    boolean bool;    
}

class InstanceVariablesApp {
    public static void main(String[] args) {
        InstanceVariables iv = new InstanceVariables();
        System.out.println(iv.i);
        System.out.println(iv.b);
        System.out.println(iv.f);
        System.out.println(iv.s);
        System.out.println(iv.bool);
    }
}
