package day39_PracticeTask.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy,
                        char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, "Cydeo", grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<= 0){
            System.out.println("Invalid Batch NUmber " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<= 0 ){
            System.out.println("Invalid group number: " + groupNumber );
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.isEmpty()){
            System.out.println("Invalid Entry");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getSchoolName() + " student " + getName() + " never eats only studies for " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getSchoolName() + " student " + getName() + " never drinks only studies for " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getSchoolName() + " student " + getName() + " never sleeps only studies for " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", gender=" + getGender() + '\'' +
                ", studentId=" + getStudentId() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() + '\'' +
                ", batchNumber=" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}
/*
3. CydeoStudent:
Extra Variables:
batchNumber, groupNumber, programmingLanguage
Encapsulate all the fields
Add a constructor that can set all the fields
Condition:
1. batchNumber and groupNumber should not be set to zero or
negative
2. programmingLanguage should not be set to null
3. programmingLanguage should not empty
Override the eat, drink and sleep methods (programmingLanguage need to be included)
Override the toString method:
name, age, gender, studentId, fieldOfStudy, grade, schoolName,
batchNumber, groupNumber, programmingLanguage should be included
 */