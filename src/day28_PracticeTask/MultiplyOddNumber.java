package day28_PracticeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(each % 2 != 0){
                result.add(each*2);
            }else{
                result.add(each);
            }
        }

        System.out.println(result);



    }
}
/*
3. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */