class P05Constructor {
    private String name;
    private int salary;

    public P05Constructor(String name, int salary) {
        this.name = name;
        this.salary = salary;

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

class P05ConstructorApp {
    public static void main(String[] args) {
        P05Constructor c1 = new P05Constructor("Vig",40000);
        c1.getName();
        c1.getSalary();

        P05Constructor c2 = new P05Constructor("Vis", 50000);
        c2.getName();
        c2.getSalary();
    }
}
