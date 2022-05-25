package avengers_Week02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamplesWithMethods {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        System.out.println(cities);

        //add(index, Object)   -----> adds the element to the given index
        cities.add(1,"Istanbul");

        System.out.println(cities);

        //get(index)-----> returns the element at given index
        String myCity = cities.get(1);

        //set(index, Object)-------> reolaces the old element at the given index
        cities.set(0,"New York");

        //index0f(Object) ------> returns the first matching index with the given element
        int indexOfParis = cities.indexOf("Paris");
        System.out.println("indexOfParis = " + indexOfParis);

        //size();  -------> returns the total number of element
        int sizeOfCities = cities.size();
        System.out.println(sizeOfCities);

        //contains(); ----->  returns boolean
        System.out.println(cities.contains("Denver"));

        //remove(index) -----> the element will be deleted at the given index
        System.out.println(cities.remove(1));

        //remove(Object) -----> removes the matching object
        System.out.println(cities.remove("Denver"));

        System.out.println(cities.remove("Paris"));

        System.out.println(cities);

        System.out.println("---------------------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();

        //Bulk Operations

        //addAll
        arrayList.addAll(Arrays.asList(12,23,34,45,56,67));

        //removeAll
        arrayList.removeAll(Arrays.asList(12,23,45));

        System.out.println(arrayList);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Serdar", "Ceyhun", "Ahmet", "Can", "Metin"));

        System.out.println(cities.retainAll(Arrays.asList("Ahmet", "Can")));

        System.out.println(names);



    }
}
