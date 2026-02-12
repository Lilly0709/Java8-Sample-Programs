import java.util.Arrays;
import java.util.List;

public class ComparatorUsingLambda
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("AAAA","AAA","A");
        stringList.stream().sorted((a,b)->a.length() - b.length()).forEach(System.out::println);
    }
}
