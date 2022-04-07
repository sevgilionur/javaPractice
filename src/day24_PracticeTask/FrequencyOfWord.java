package day24_PracticeTask;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str1 = "Java java java python python";

        int result =frequencyOfWord(str1, "java");

        System.out.println(result);

    }

    public static int frequencyOfWord(String sentence, String word){

        int count = 0;

        String[] split =sentence.split(" ");

        for (String each : split) {

            if(each.equalsIgnoreCase(word)){

                count++;
            }
        }
        return count;
    }


}
/*
1.  create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
 */