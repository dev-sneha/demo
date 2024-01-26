package work;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String str= " my name is sneha ";
        String str= null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse("No value is present"));
    }
}
