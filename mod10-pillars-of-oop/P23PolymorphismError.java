class Teacher {
    void teach() {
        System.out.println("Teacher is teaching!");
    }

    void assignment(){
        System.out.println("teacher is giving assignment!");
    }
}

class JavaTeacher extends Teacher {
    void assignment(){
        System.out.println("Java assignment!");
    }

    void javaWork() {
        System.out.println("Java work!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("Python teacher!");
    }

    void pythonWork() {
        System.out.println("Python work!");
    }
}

class P23PolymorphismError {
    public static void main(String[] args) {
        Teacher t;
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        t = jt;
        t.teach();
        t.assignment();
        // t.javaWork();
        ((JavaTeacher)(t)).javaWork();

        t = pt;
        t.teach();
        t.assignment();
        // t.pythonWork();
        ((PythonTeacher)(t)).pythonWork();
    }
}
