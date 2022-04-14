package day39_PracticeTask.studentTask;

public class StudentObjects {

    public static void main(String[] args) {

        Student student = new Student("David Daniel",40, 'M', 101,"Java","DevIT",'B' );
        GraduateStudent graduateStudent = new GraduateStudent("Hakan",34,'M',1001,"Math","METU",'B');
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Aaron",29,'M',1201,"Chemistry","Harvard",'A');
        CydeoStudent cydeoStudent = new CydeoStudent("Onur",31,'M',04027,"SDET",'A', 8,27,"Java");

        System.out.println(student);
        System.out.println(graduateStudent);
        System.out.println(undergraduateStudent);
        System.out.println(cydeoStudent);

        System.out.println("-------------------------------------------------");

        student.study();
        graduateStudent.study();
        undergraduateStudent.study();
        cydeoStudent.study();

        System.out.println("-------------------------------------------------");

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();







    }
}
/*
4. Create a class named StudentObjects:

Create the objects of each subclasses test all the functions of each objects
Analyze the relationships between the classes
 */