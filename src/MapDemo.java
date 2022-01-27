import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(4, "Ross");
        idToName.put(1, "John");
        idToName.put(11, "Alex");
        idToName.put(3, "Joe");
        idToName.putIfAbsent(5, "Monica");
        idToName.put(0, "Rachel");

        System.out.println(idToName.get(1));
        System.out.println(idToName.getOrDefault(100, "Unknown"));
        System.out.println(idToName.containsKey(1));
        System.out.println(idToName.containsKey(200));

        for(Map.Entry<Integer, String> entry: idToName.entrySet()) {
            System.out.println("key =" + entry.getKey() +" value = " +entry.getValue());
        }

        System.out.println(idToName);



        // hashcode -> identifies bucket -> separate chaining -> list
        // equals



    }
}