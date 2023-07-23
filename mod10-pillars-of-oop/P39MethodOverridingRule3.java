class Teacher {}

class MathTeacher extends Teacher{}

class Program1 {
    Teacher display() {
        Teacher t = new Teacher();
        return t;
    }
}

class Program2 extends Program1 {
    MathTeacher display() {
        MathTeacher mt = new MathTeacher();
        return mt;
    }
}

class P39MethodOverridingRule3 {
    
}
