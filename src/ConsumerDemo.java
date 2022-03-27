import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {

        //Consumer and Supplier
        // Consumer<Integer>
        // Supplier<Integer>

        Consumer<Integer> displayFunction = a -> System.out.println(a);
        displayFunction.accept(10);

        Consumer<String> stringFunction = (a) -> {
            throw new RuntimeException(a);
            //System.out.println(a);
        };

        stringFunction.accept("hello");


        Consumer<List<Integer>> multiplyListByTwo = (list) -> {
            for(int i=0;i<list.size();i++) {
                list.set(i, list.get(i) *2);
            }
        };

        Consumer<List<Integer>> printTheList = (list) -> System.out.println(list);

        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);

        //multiplyListByTwo.accept(list);
        //printTheList.accept(list);

        multiplyListByTwo.andThen(printTheList).accept(list);

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        BiConsumer<Integer, Integer> sumFunction = (a,b) -> System.out.println(a+b);
        sumFunction.accept(2,3);
    }
}
