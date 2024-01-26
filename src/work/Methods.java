package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //filter(predicate)
        // predicate means boolean valued function if yes then filter otherwise left
        List<String> names = Arrays.asList("Ankit" , "Amit","Arun", "Durgesh");
        List<String> list1=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);

        String s= names.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("sneha sharma "+ s);

        //map
        List<Integer> number = Arrays.asList(23,4,2,4,7,4);
        List<Integer> newNumber= number.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumber);

        number.stream().sorted().forEach(System.out::println);


        Integer integer= number.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(integer);
        Integer integer1= number.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println(integer1);
    }
}
