import java.util.List;
import java.util.*;

class WordOccurence implements Comparable<WordOccurence> {
    String word;
    int occurrence;

    public WordOccurence(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public void increment() {
        this.occurrence++;
    }

    @Override
    public String toString() {
        return String.format("%s-%d\n", word, occurrence);
    }

    @Override
    public int compareTo(WordOccurence o) {
        return Integer.compare(this.occurrence, o.occurrence);
    }
}

public class FindKMostOccurredWords {
    private static final List<String> list = formList();
    private static final Random random = new Random();

    public static void main(String[] args) {
        Map<String, WordOccurence> map = new HashMap<>();
        for(int i=0;i<1000;i++) {
            String word = getWord();
            if(map.containsKey(word)) {
                map.get(word).increment();
            } else {
                WordOccurence wordOccurence = new WordOccurence(word);
                map.put(word, wordOccurence);
            }
        }

        PriorityQueue<WordOccurence> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(Map.Entry<String, WordOccurence> entry: map.entrySet()) {
            heap.add(entry.getValue());
        }

        System.out.println(map);

        int k =0;
        while(!heap.isEmpty() && k<3) {
            System.out.println(heap.poll());
            k++;
        }


    }

    private static String getWord() {
        return list.get(random.nextInt(list.size()));
    }

    private static List<String> formList() {
        return List.of("ability","able","about","above","accept","according",
                "account","across","act","action","activity","actually",
                "add","address","administration","admit","adult","affect","after",
                "again","against","age","agency","agent","ago","agree","agreement",
                "ahead","air","all","allow","almost","alone","along","already",
                "also","although","always","American","among","amount",
                "analysis","and","animal","another","answer","any","anyone",
                "anything","appear","apply","approach","area","argue","arm","around");
    }

}
