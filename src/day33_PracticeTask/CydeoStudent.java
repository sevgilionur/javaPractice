package day33_PracticeTask;

public class CydeoStudent {

    public String name, batchNumber;
    public int age, groupNumber;
    public char gender, grade;
    public long ID;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, String batchNumber, int age, int groupNumber, char gender, char grade, long ID) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
        this.ID = ID;
    }

    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending class");
    }
    public static void printSchoolName(){
        System.out.println("school Name: " +schoolName);
    }
    public static void printProgLanguage(){
        System.out.println("programming Language: " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }
}
/*
1. CydeoStudent Task
1. Create a class named CydeoStudent:
    Attributes:
        instances: name, age, gender, id, grade, batchNumber, groupNumber
        statics: schoolName, programmingLanguage
    Add a constructor that can set All the
        fields (instances)
    Actions:
        study()
        attendClass()
        printSchoolName(): displays the school name
        printProgLanguage():
        displays the name of programming language
        toString()
 */