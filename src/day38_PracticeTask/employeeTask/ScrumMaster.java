package day38_PracticeTask.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name,String companyName, int age, char gender, int id, double salary) {
        super(name, "Scrum Master", companyName, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " has meeting with developers and testers");
    }
}
