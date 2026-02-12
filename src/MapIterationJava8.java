import java.util.HashMap;
import java.util.Map;

public class MapIterationJava8
{
    public static void main(String[] args)
    {
        Map<Integer,String> stringMap = new HashMap<>();
        stringMap.put(1,"Apple");
        stringMap.put(2,"Banana");
        stringMap.put(3,"Kiwi");
        stringMap.forEach((k,v)->System.out.println(k+ " - " + v));
    }
}
