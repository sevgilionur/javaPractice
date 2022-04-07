package day24_PracticeTask;

public class Contains {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        boolean result = contains(arr,8);
        System.out.println(result);
    }

    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {

            if(each==element){
                result=true;
            }else{
                result= false;
            }
        }
        return result;
    }

}
/*
9. Create a method named contains that passes one integer array and
one integer parameters, the method returns true if the given integer is
contained in the given array, otherwise returns false
Ex:
arr = {1,2,3,4,5,6,7};
num = 10;
contains(arr, num) ===>
false

 */