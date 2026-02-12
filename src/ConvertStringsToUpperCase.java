import java.util.Arrays;
import java.util.List;

public class ConvertStringsToUpperCase
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("lilly","vinoth","diyaa","shayann");
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("First element : " + stringList.stream().findFirst().get());

    }
}
