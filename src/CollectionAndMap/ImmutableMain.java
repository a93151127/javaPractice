package CollectionAndMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7);
        List<Integer> unModifiedList = Collections.unmodifiableList(list);
        System.out.println("inside home");
        unModifiedList.forEach(System.out::println);
    }
}
