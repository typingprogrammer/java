import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {
        //repetition allowed
        // null allowed
        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(1);
        integerList.add(0);
        integerList.add(6);
        Collections.sort(integerList);
        System.out.println(integerList);



        //normal for loop
        for(int i=0;i<integerList.size();i++) {
            System.out.println(integerList.get(i));
        }


        List<String> stringList = new ArrayList<>();
        stringList.add("222");
        stringList.add("333");

        List<Integer> outputList = new ArrayList<>();
        for(String s: stringList) {
            outputList.add(integerToString(s));
        }

        System.out.println(stringList.stream().map(str -> integerToString(str)).collect(Collectors.toList()));

    }

    public static Integer integerToString(String s) {
        return Integer.valueOf(s);
    }

    public static List<Integer> getInputList() {
        return new ArrayList<>();
    }

}


