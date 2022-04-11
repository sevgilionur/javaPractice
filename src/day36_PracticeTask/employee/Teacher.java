package day36_PracticeTask.employee;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void teaching(){
        System.out.println(name + " is teaching");
    }

}
/*
2.5 Create the sub class of Employee named Teacher:
        variables:
        name, gender, age, id, jobTitle, salary
        Methods:
        setInfo()
        work()
        teaching()
        toString()

 */