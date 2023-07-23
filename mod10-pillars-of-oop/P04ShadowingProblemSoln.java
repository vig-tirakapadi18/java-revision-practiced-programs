class P04ShadowingProblem {
    private String name;
    private int salary;
    
    public void setData(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(this);
    }
}

class P04ShadowingProblemSoln {
    public static void main(String[] args) {
        P04ShadowingProblem sp = new P04ShadowingProblem();

        sp.setData("Vig", 40000);
    }
}
