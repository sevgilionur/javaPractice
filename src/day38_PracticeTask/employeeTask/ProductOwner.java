package day38_PracticeTask.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String companyName, int age, char gender, int id, double salary) {
        super(name, "Product Owner", companyName, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " has a meeting with client");
    }
}
