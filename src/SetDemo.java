import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> hashSetString = new HashSet<>();

        hashSetString.add("i");
        hashSetString.add("am");
        hashSetString.add("iron");
        hashSetString.add("man");

        Set<String> treeSetString = new TreeSet<>();
        treeSetString.add("i");
        treeSetString.add("am");
        treeSetString.add("iron");
        treeSetString.add("man");

        Set<String> linkedHashSetString = new LinkedHashSet<>();
        linkedHashSetString.add("i");
        linkedHashSetString.add("am");
        linkedHashSetString.add("iron");
        linkedHashSetString.add("man");

        System.out.println("hashSetString " + hashSetString);
        System.out.println("treeSetString " + treeSetString);
        System.out.println("linkedHashSetString " + linkedHashSetString);

        for(String s: hashSetString) {
            System.out.println(s);
        }

        Iterator<String> iterator = hashSetString.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(hashSetString.contains("ironman"));

    }

}
