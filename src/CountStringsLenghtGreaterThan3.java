import java.util.Arrays;
import java.util.List;

public class CountStringsLenghtGreaterThan3
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("Banana","Apple","Orange","Kiw","or");
        stringList.stream().filter(str->str.length()<=3).forEach(System.out::println);
    }
}
