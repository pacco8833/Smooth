import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringOrders {

    StringOrders(String[] arr) {

        List<String> strList = Arrays.asList(arr);
        nameOrder(strList);
        lengthOrder(strList);

    }

    public void nameOrder(List<String> list) {
        
        List<String> abcString = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Here is your array in alphabetical order");
        abcString.forEach(System.out::println);
    }

    public void lengthOrder(List<String> list) {

        List<String> strSize = list.stream().sorted((o1 , o2) -> 
        { 
            return (o2.length() > o1.length()) ? o2 :  o1;
            
        }).collect(Collectors.toList());
        System.out.println("Here is your array in character Length order");
        strSize.forEach(System.out::println);
    }

    // -> x.charAt(0)).forEach(System.out::println));
    // strList.stream().sorted().forEach(System.out::println);
    // strList.stream().sorted().forEach(System.out::println);
    // System.out.println("Here is your array in non-alphabetical order");
    // cbaString.forEach(System.out::println);

    public static void main(String[] args) {

        String[] arr = { "breakfast", "lunch", "dinner", "snack" };
        new StringOrders(arr);

    }
}
