class P03UseOfStaticBlocks {
    static int x;

    static {
        x = 23;
    }

    void display() {
        System.out.println(x);
    }
}

class P03UseOfStaticBlocksApp {
    public static void main(String[] args) {
        P03UseOfStaticBlocks s = new P03UseOfStaticBlocks();
        s.display();
    }
}
