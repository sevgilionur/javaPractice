package day11_PracticeTask;

public class NumberOfDaysWithSwitch {
    public static void main(String[] args) {

        int year = 2001;
        int n = 2;

        switch (n){
            case 2:
            if(year%4 == 0){
                System.out.println("has 29 days");
            }else{
                System.out.println("has 28 days");
            }
            break;

            case 4: case 6: case 9: case 11:
                System.out.println("has 30 days");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("has 31 days");
                break;

            default:
                System.out.println("Invalid");


        }


    }
}
