package day36_PracticeTask.employee;

public class Driver extends Employee{

    public Driver(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void driving(){
        System.out.println(name + " is driving");
    }


}
/*
2.6 Create the sub class of Employee named Driver:
        variables:
        name, gender, age, id, jobTitle, salary
        Methods:
        setInfo()
        work()
        drivering()
        toString()

 */