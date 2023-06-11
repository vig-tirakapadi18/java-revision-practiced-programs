class Employee {
    String id;
    String name;
    int salary;

    void doProject() {
        System.out.println("Doing the Project!");
    }

    void attendClass() {
        System.out.println("Attending Classes!");
    }
}

class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = "E0001";
        e.name = "Vighnesh";
        e.salary = 45000;

        e.doProject();
        e.attendClass();
    }
}
