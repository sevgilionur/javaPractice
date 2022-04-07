package day11_PracticeTask;


public class ExamResult {
    public static void main(String[] args) {

        char ch = 'G';

        //boolean examResult = ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F';

        //if (examResult) {

            switch (ch) {

                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Great Job");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                case 'D':
                    System.out.println("Passed");
                    break;
                case 'F':
                    System.out.println("Failed");
                    break;
                default:
                    System.out.println("Invalid");

            }

        //} else {

            //System.out.println("Invalid");
        //}

    }
}
/*

3. a char variable named grade is given. use switch statement to
print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
 */