class P04KodnestStudent {
    String id;
    String name;
    String courseName;
    double perc;
    static String instName;
    
    static {
        instName = "KodNest!";
    }

    void displayData() {
        System.out.println(id + " "+name+" "+courseName+" "+perc);
    }

    static void displayInst() {
        System.out.println(instName);
    }
}

class P04KodnestStudentApp {
    public static void main(String[] args) {
        P04KodnestStudent.displayInst();

        P04KodnestStudent ks = new P04KodnestStudent();
        ks.id = "S101";
        ks.name = "Vig!";
        ks.courseName = "Java Full-Stack";
        ks.perc = 90.95;

        ks.displayData();
    }
}
