import java.util.Arrays;
import java.util.List;

public class SortList
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("Banana","Apple","Orange","Pineapple","Melon");
        System.out.println("Ascending order:");
        stringList.stream().sorted().forEach(System.out::println);
        System.out.println("Descending order:");
        stringList.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);
    }
}
