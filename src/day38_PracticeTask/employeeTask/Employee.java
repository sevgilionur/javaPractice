package day38_PracticeTask.employeeTask;

public class Employee {

    private String name, jobTitle, companyName;
    private int age;
    private char gender;
    private int id;
    private double salary;

    public Employee(String name, String jobTitle, String companyName, int age, char gender, int id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setGender(gender);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.out.println("Invalid job title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName==null || companyName.isEmpty() || companyName.isBlank()){
            System.out.println("Invalid company name");
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender: " + gender );
        }
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            System.out.println("Invalid id: " + id);
            System.exit(1);
        }
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            System.out.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", salary= $" + salary +
                '}';
    }
}
/*
Employee Task:
1. Create a class named Employee
Variables:
name, age, gender, id, jobTitle, salary, companyName
Add a constructor to set all the fields
Methods:
work()
toString()
2. Create ethe following subclasses and override the work method in
each subclass:
1. Tester
2. Developer
3. ProductOwner
4. BusinessAnalyst
5. ScrumMaster
6. Teacher
7. Driver
9. Pilot
if any additional field or methods needed, please add
them
 */