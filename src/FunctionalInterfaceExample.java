@FunctionalInterface
interface MyInterface
{
    void showMessage(String str1, String str2);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyInterface myInterface = (str1,str2) ->  System.out.println(str1 + " - " + str2 );
        myInterface.showMessage("Hello from ","from functional interface");
    }
}
