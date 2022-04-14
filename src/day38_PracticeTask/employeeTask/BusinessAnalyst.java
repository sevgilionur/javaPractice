package day38_PracticeTask.employeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String companyName, int age, char gender, int id, double salary) {
        super(name, "Business Analyst", companyName, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " has meeting with scrum team");
    }
}
