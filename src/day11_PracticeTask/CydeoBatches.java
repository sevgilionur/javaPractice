package day11_PracticeTask;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "US evening";

        String result ="";

        if(batchType == "EU" || batchType == "US morning" || batchType == "US evening"){

            switch (batchType){
                case "EU":
                    result = "Class times are 10-5 EST. M, T, W, Th, F.";
                    break;
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
            }

        }else{

            result = "Not valid batch type";

        }
        System.out.println(result);
        System.out.println("-----------------------------------------------------------");

        String batchType1 = "EU";
        String result1 = "";

        switch (batchType1){
            case "EU":
                result1 = "Class times are 10-5 EST. M, T, W, Th, F.";
                break;
            case "US morning":
                result1 = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result1 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            default:
                result1 = "Invalid Batch Type";

        }
        System.out.println(result1);













    }
}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch
types: US morning, US evening, EU.
Depending on a batch type (String) print information about the
batch.
If batch type is US morning ==> print "Class times are
10-5 EST. M, T, Th, F."
If batch type is US evening ==> print "Class times are 7-
10 EST. M, T, W, Th, S, S"
If batch type is EU ==> print "Class times are  10-5 EST.
M, T, W, Th, F."
If batch type is invalid, print "Invalid Btach"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
 */