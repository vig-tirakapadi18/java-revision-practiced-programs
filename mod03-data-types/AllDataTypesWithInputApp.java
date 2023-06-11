import java.util.Scanner;

class AllDataTypesWithInput {
    void byteType(byte b) {
        System.out.println("Byte Type: "+b);
    }

    void shortType(short s) {
        System.out.println("Short type: "+s);
    }

    void intType(int i) {
        System.out.println("Integer type: "+i);
    }

    void longType(long l) {
        System.out.println("Long type: "+l);
    }

    void doubleType(double d) {
        System.out.println("Double type: "+d);
    }

    void floatType(float f) {
        System.out.println("Float type: "+f);
    }

    void charType(char c) {
        System.out.println("Char type: "+c);
    }

    void boolType(boolean bool) {
        System.out.println("Boolean type: "+bool);
    }
}

class AllDataTypesWithInputApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AllDataTypesWithInput at = new AllDataTypesWithInput();
        System.out.println("Enter Byte type value: ");
        byte b = s.nextByte();
        at.byteType(b);

        System.out.println("Enter Short type value: ");
        short sh = s.nextShort();
        at.shortType(sh);

        System.out.println("Enter Byte type value: ");
        int i = s.nextInt();
        at.intType(i);

        System.out.println("Enter Byte type value: ");
        long l = s.nextLong();
        at.longType(l);
        
        System.out.println("Enter Byte type value: ");
        float f = s.nextFloat();
        at.floatType(f);

        System.out.println("Enter Byte type value: ");
        double d = s.nextDouble();
        at.doubleType(d);

        s.close();
    }
}
