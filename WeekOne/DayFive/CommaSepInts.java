import java.util.List;
import java.util.Arrays;

public class CommaSepInts {

    CommaSepInts(List<Integer> list) {

        //if the number divided by 2 has no remainder...(it's Even)
        EvenOdd num = (x) -> x % 2 == 0;

        list.stream().forEach(q -> {
            if (num.evenOrOdd(q)) // abstract method takes an int, returns a boolean
                System.out.print("e"); //put an 'e' in front of all Evens
            System.out.print(q + " "); // regardless of even or odd print the number
        });
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(341, 22, 3, 76, 77);
        //Expected : 341 , e22 , 3 , e76 ,77
        new CommaSepInts(myList);
    }

}
