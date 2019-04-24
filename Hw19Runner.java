import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Hw19Runner {
    public static void main(String[] args) {


        Function<String, Integer> stringToInt = r -> r.length();
        int stringToIntResults = stringToInt.apply("sam");
        System.out.println(stringToIntResults);


        ;


        BiFunction<String, String, Integer> stringsToInt = (String r, String s) -> r.length() + s.length();
        int stringsToIntResult = stringsToInt.apply("John", "David");System.out.println(stringsToIntResult);

        Consumer<String> useString = (String s) -> {
            System.out.println(s);
        };

        useString.accept("Love");


        Supplier<String> makeString = () -> "Hello";
        String makeStringResult = makeString.get();
        System.out.println(makeStringResult);

    }

    ;


}




