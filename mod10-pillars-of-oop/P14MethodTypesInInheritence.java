class Teacher {
    void teach() {
        System.out.println("Teaching!");
    }

    void assignment() {
        System.out.println("Teacher is giving Assignment!");
    }
}

class JavaTeacher extends Teacher {
    void assignment() {
        System.out.println("Java Teacher is giving Assignment!");
    }

    void javaWork() {
        System.out.println("Working on Java!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("Python Teacher is giving Assignment!");
    }

    void pythonWork() {
        System.out.println("Working on Python!");
    }
}

class P14MethodTypesInInheritence {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        jt.teach();     //Inherited Method
        jt.assignment();       //Overridden method
        jt.javaWork();      //Specialized Method

        pt.teach();     //Inherited Method
        pt.assignment();    //Overridden Method
        pt.pythonWork();    //Specialized Method
    }
}
