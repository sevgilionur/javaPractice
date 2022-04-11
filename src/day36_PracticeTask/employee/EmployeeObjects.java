package day36_PracticeTask.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Onur", "SDET", 'M',30,16,100000);
        Developer developer = new Developer("Hakan", "Developer", 'M', 35,20,120000);
        Driver driver = new Driver("Veli","Bus Driver",'M', 40,30,80000);
        Teacher teacher = new Teacher("Fatma","Math Teacher",'F', 25,42,90000);

        tester.testing();
        developer.fixingBugs();
        driver.work();
        teacher.teaching();

        System.out.println(tester.name + " : $" + tester.salary);
        System.out.println(developer.name + " : $" + developer.salary);
        System.out.println(driver.name + " : $" + driver.salary);
        System.out.println(teacher.name + " : $" + teacher.salary);






    }
}
