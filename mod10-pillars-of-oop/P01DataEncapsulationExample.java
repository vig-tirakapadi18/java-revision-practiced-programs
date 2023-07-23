class P01DataEncapsulation {
    private int count;

    public void setCount(int x) {
        if(x > 0) {
            count = x;
            System.out.println(count);
        } else {
            System.out.println("Invalid!");
        }
    }

    int getCount() {
        return count;
    }
}

class P01DataEncapsulationExample {
    public static void main(String[] args) {
        P01DataEncapsulation de = new P01DataEncapsulation();

        // de.count = 1000;   //Direct access is not possible

        de.setCount(1000);
        de.getCount();
    }
}