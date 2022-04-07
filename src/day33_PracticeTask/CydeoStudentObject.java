package day33_PracticeTask;

public class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Onur", "EU8", 31,27,'M','A',43534343);

        System.out.println(cydeoStudent1);

        cydeoStudent1.attendClass();
        cydeoStudent1.printProgLanguage();
        cydeoStudent1.printSchoolName();


    }

}
