package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String [] args){
        //create a list and filter all even number of list
        List<Integer> list = Arrays.asList(1,2,5,6,3,7,8,10,67,50);
        Stream<Integer> stream =list.stream();
        List<Integer> list1=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
