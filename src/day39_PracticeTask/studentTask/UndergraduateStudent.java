package day39_PracticeTask.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying at the university");
    }
}
/*
2. UndergraduateStudent
Override the study method
add any
additional fields and methods if necessary
 */