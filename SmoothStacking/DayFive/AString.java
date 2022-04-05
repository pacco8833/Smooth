import java.util.Arrays;
import java.util.List;

interface SmallA {

    public abstract Boolean smallStr(String a); 
    // take in a String to return a Boolean

}

public class AString {

    public AString(List<String> strs) {
        // set the method -> first char is lowecase a , length must be 3 characters
        SmallA asOnly = (str) -> (str.charAt(0) == 'a') && (str.length() == 3);
        strs.stream().forEach((x) -> {
            if (asOnly.smallStr(x))
                System.out.println(x);// print out each String which returns true to the condition
        });

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amanda", "Armando", "amy", "Terrence", "tom");
        // only 'amy' should be returned
        new AString(list);
    }
}