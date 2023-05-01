import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreams {


    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list = Arrays.asList("Hi", "Hllo", "lo");


        list.stream().forEach(value -> System.out.println(value));
        System.out.println("    ");
        list.stream().filter(val -> val.length()>2).collect(Collectors.toList()).forEach(vle -> System.out.println(vle));



    }
}
