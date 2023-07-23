class P02DataEncapsulation {
    private String name;
    private int salary;
    
    public void setName(String x, int y) {
        name = x;
        salary = y;
        System.out.println(name);
        System.out.println(salary);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class P02DataEncapsulationEx {
    public static void main(String[] args) {
        P02DataEncapsulation de1 = new P02DataEncapsulation();
        de1.setName("Vig", 40000);
        de1.getName();
        de1.getSalary();

        P02DataEncapsulation de2 = new P02DataEncapsulation();
        de2.setName("Vis",50000);
        de2.getName();
        de2.getSalary();
    }
}
