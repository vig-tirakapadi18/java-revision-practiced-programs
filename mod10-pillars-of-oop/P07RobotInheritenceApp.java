class P07Robot {
    String processor;
    String name;
    
    void meeting() {
        System.out.println("Attending Metting!");
    }
}

class TeacherRobot extends P07Robot {
    String subject;

    void teach() {
        System.out.println("Teacher is teaching!");
    }
}

class CleanerRobot extends P07Robot {
    String items;

    void clean() {
        System.out.println("Cleaner is cleaning!");
    }
}

class P07RobotInheritenceApp {
    public static void main(String[] args) {
        TeacherRobot tr = new TeacherRobot();
        CleanerRobot cr = new CleanerRobot();

        tr.name = "abc";
        tr.processor = "i6";
        tr.subject = "JavaScript";
        tr.teach();
        tr.meeting();

        cr.name = "xyz";
        cr.processor = "i7";
        cr.items = "Jaadu(Broom)";
        cr.clean();
        cr.meeting();
    }
}
