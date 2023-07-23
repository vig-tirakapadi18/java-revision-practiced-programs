class P08Developer {
    String name;
    String team;    
}

class FrontEndDeveloper extends P08Developer {
    String webTechName;

    void work() {
        System.out.println("Working!");
    }
}

class BackEndDeveloper extends P08Developer {
    String progLangName;

    void attendMeting() {
        System.out.println("Attending meeting!");
    }
}

class JavaDeveloper extends BackEndDeveloper {
    void javaProject() {
        System.out.println("Doing Java Project!");
    }
}

class PythonDeveloper extends BackEndDeveloper {
    void pythonProject() {
        System.out.println("Doing Python Project!");
    }
}

class P08DeveloperApp {
    public static void main(String[] args) {
        FrontEndDeveloper fd = new FrontEndDeveloper();
        BackEndDeveloper bd = new BackEndDeveloper();
        JavaDeveloper jd = new JavaDeveloper();
        PythonDeveloper py = new PythonDeveloper();

        fd.name = "abc";
        fd.team = "Alpha";
        fd.webTechName = "ReactJS";
        fd.work();

        bd.name = "xyz";
        bd.team = "Beta";
        bd.progLangName = "Python";
        bd.attendMeting();

        jd.name = "wer";
        jd.team = "Delta";
        jd.progLangName = "Java";
        jd.javaProject();

        py.name = "fgd";
        py.team = "Gamma";        
        py.progLangName = "Python";
        py.pythonProject();
    }
}
