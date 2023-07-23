class P05ConstructorLaptop {
    private String brand;
    private String processor;
    private int price;

    public P05ConstructorLaptop(String brand, String processor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getPrice() {
        return price;
    }
}

class P05ConstructorLaptopApp {
    public static void main(String[] args) {
        P05ConstructorLaptop l1 = new P05ConstructorLaptop("HP", "i3", 42000);
        System.out.println(l1.getBrand());
        System.out.println(l1.getProcessor());
        System.out.println(l1.getPrice());
    }
}
