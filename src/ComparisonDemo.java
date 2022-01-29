import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class WithComparisonSupport implements Comparable<WithComparisonSupport> {

    private int value;

    public WithComparisonSupport(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(WithComparisonSupport o) {
        return Integer.compare(value, o.getValue());
    }

    @Override
    public String toString() {
        return "WithComparisonSupport{" +
                "value=" + value +
                '}';
    }
}

class WithoutComparisonSupport {
    private int value;
    public WithoutComparisonSupport(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "WithoutComparisonSupport{" +
                "value=" + value +
                '}';
    }
}

class MyComparator implements Comparator<WithoutComparisonSupport> {

    @Override
    public int compare(WithoutComparisonSupport o1, WithoutComparisonSupport o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

public class ComparisonDemo {
    public static void main(String[] args) {
        // 1. implementing Comparable interface


        WithComparisonSupport withComparisonSupportObj1 = new WithComparisonSupport(2);
        WithComparisonSupport withComparisonSupportObj2 = new WithComparisonSupport(1);
        WithComparisonSupport withComparisonSupportObj3 = new WithComparisonSupport(3);

        List<WithComparisonSupport> withComparisonSupportList = new ArrayList<>();
        withComparisonSupportList.add(withComparisonSupportObj1);
        withComparisonSupportList.add(withComparisonSupportObj2);
        withComparisonSupportList.add(withComparisonSupportObj3);


        //System.out.println(withComparisonSupportList);
        Collections.sort(withComparisonSupportList);
        //System.out.println(withComparisonSupportList);

        // 2. implementing Comparator.

        WithoutComparisonSupport withoutComparisonSupportObj1 = new WithoutComparisonSupport(1);
        WithoutComparisonSupport withoutComparisonSupportObj3 = new WithoutComparisonSupport(3);
        WithoutComparisonSupport withoutComparisonSupportObj2 = new WithoutComparisonSupport(2);

        List<WithoutComparisonSupport> withoutComparisonSupportList = new ArrayList<>();
        withoutComparisonSupportList.add(withoutComparisonSupportObj1);
        withoutComparisonSupportList.add(withoutComparisonSupportObj3);
        withoutComparisonSupportList.add(withoutComparisonSupportObj2);

        System.out.println(withoutComparisonSupportList);
        Collections.sort(withoutComparisonSupportList, new MyComparator());
        System.out.println(withoutComparisonSupportList);
    }
}
