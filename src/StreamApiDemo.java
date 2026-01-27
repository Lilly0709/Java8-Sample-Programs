import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args)
    {
        List<Integer> numList = Arrays.asList(1,2,3,4);
        List<String> fruits = Arrays.asList("Apple","Banana","Jack","Mango");
        fruits.stream().filter(str->str.startsWith("A")).forEach(System.out::println);
        fruits.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        fruits.stream().distinct().forEach(System.out::println);
        fruits.stream().sorted().forEach(System.out::println);
        System.out.println("Skip & Limit");
        fruits.stream().skip(2).limit(3).forEach(System.out::println);
        List<String> terminalString = fruits.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
        terminalString.stream().forEach(System.out::println);
        try {
            Map<String, Integer> fruitMap = fruits.stream().collect(Collectors.toMap(fruit -> fruit,
                    fruit -> fruit.length()));
            System.out.println(fruits.stream().distinct().count());

        }
        catch(IllegalStateException e)
        {
            System.out.println(e.toString());
        }
        numList.stream().map(n->n*2).forEach(n-> System.out.println(n));
    }
}