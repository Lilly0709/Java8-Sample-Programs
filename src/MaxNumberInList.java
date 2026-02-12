import java.util.Arrays;
import java.util.List;

public class MaxNumberInList
{
    public static void main(String[] args)
    {
        List<Integer> maxList = Arrays.asList(21,67,89,20,45,78);
        int maxNumber = maxList.stream().max(Integer::compare).get();
        System.out.println("Greatest Number is : "+ maxNumber);
        System.out.println("Are there numbers greater than 100:" + maxList.stream().anyMatch(num->num>100));
        System.out.println(maxList.stream().mapToInt(Integer::intValue).sum());
    }
}
