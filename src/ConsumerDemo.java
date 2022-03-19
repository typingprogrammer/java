import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> displayFunction = a -> System.out.println(a);

        displayFunction.accept(10);

        Consumer<String> stringFunction = (a) -> {
            //this.getClass() - this does not work
            //throw new RuntimeException(a);
        };

        stringFunction.accept("hello");


        Consumer<List<Integer>> multiplyByTwo = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);

        multiplyByTwo.accept(list);

        dispList.accept(list);

        System.out.println();
        multiplyByTwo.andThen(dispList).accept(list);

        System.out.println();
        BiConsumer<Integer, Integer> sumFunction = (a,b) -> System.out.println(a+b);
        sumFunction.accept(1,2);

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());

    }
}
