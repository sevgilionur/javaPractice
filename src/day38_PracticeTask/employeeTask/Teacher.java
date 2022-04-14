package day38_PracticeTask.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, String companyName, int age, char gender, int id, double salary) {
        super(name, jobTitle, companyName, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getAge() + " is teaching");
    }
}
