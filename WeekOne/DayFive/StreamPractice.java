import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {

    StreamPractice() {
        // the 'old' 'entry-level' ferrari (458)
        Integer[] ferrari = { 114, 35, 98 };
        String[] words = { "next", "last", "extreme", "exellence" };
        
        doubledList(Arrays.asList(ferrari));
        removeXs(Arrays.asList(words));
        groupTarget(ferrari, 10);
    }

    public void groupTarget(Integer[] a, int target) {

        Stream<Integer> list = Arrays.asList(a).stream().sorted();
        list.forEach(System.out::println);

    }

    public void removeXs(List<String> a) {
        a.stream().forEach((x) -> {
            String str = x.replaceAll("x", "");
            System.out.println(str);
        });
    }

    public List<Integer> rightDigit(List<Integer> a) {
//% 10 of any number returns the final digit in the number
        a.stream().forEach((x) -> {
            System.out.println(x % 10);
        });

        return a;
    }

    public List<Integer> doubledList(List<Integer> a) {

        a.stream().forEach((x) -> {
            System.out.println(x * 2);
        });

        return a;
    }

    public static void main(String[] args) {
        new StreamPractice();
    }
}