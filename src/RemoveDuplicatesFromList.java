import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1,2,2,3,4,4,5,5,6,7,8,9,10);
        integerList.stream().distinct().forEach(System.out::println);
    }
}
