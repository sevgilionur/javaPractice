package day38_PracticeTask.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, String companyName, int age, char gender, int id, double salary) {
        super(name, jobTitle, companyName, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code and fixing the bugs");
    }
}
