import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    int marks;

    public void study() {
        System.out.println("Student is studying!");
    }
}

class StudentApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num of Objects: ");
        int obj = s.nextInt();

        Student stu[] = new Student[obj];

        for(int i = 0; i <= stu.length - 1; i++){
            stu[i] = new Student();
        }

        for(int i = 0; i <= stu.length - 1; i++) {
            System.out.println("Enter ID of student "+i+" : ");
            stu[i].id = s.nextInt();

            System.out.println("Enter age of student "+i+" : ");
            stu[i].age = s.nextInt();

            System.out.println("Enter name of student "+i+" : ");
            stu[i].name = s.next();

            System.out.println("Enter marks of student "+i+" : ");
            stu[i].marks = s.nextInt();
        }

        for(int i = 0; i <= stu.length - 1; i++) {
            System.out.println(stu[i].id+", "+stu[i].name+", "+stu[i].age+", "+stu[i].marks);
        }

        s.close();
    }
}