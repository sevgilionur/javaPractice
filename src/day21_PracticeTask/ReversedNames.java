package day21_PracticeTask;

public class ReversedNames {

    public static void main(String[] args) {


        String[] students = {"Java" , "Programming", "Language"};

        for (String each : students) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {

                reversed+= each.charAt(i);
            }
            System.out.println(reversed);
        }






    }
}
