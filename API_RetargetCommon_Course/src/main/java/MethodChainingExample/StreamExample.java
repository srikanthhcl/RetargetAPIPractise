package MethodChainingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("Apple", "Mango", "Orange", "Banana","Pomo");

//        Stream<String> nameStream = fruits.stream();
//        Stream<String> nameMapStream = nameStream.map(anything->anything + " Fruit");
//        List<String>  newame = nameMapStream.collect(Collectors.toList());

//        Stream<String> nameStream = fruits.stream();
//        Stream<String> nameMapStream = fruits.stream().map(anything->anything+ "Fruit");
        List<String> neNameList = fruits.stream().map(anything->anything+ "  Fruit").collect(Collectors.toList());

        System.out.println(neNameList);
//        List<String> customFruitName = new ArrayList<>();
//        for(String SS : fruits)
//        {
//            String newName = SS+" Fruit";
//            customFruitName.add(newName);
//        }
//
//        System.out.println("Before--->"+ fruits);
//        System.out.println("After---->"+customFruitName);

    }

}
