
import java.util.*;

public class Secondlargest {
    public static void main(String[] args) {
    int[] arr={12, 12, 1, 10, 34, 1};
    List<Integer> list = new java.util.ArrayList<>();
    for (int i : arr) {
        if (!list.contains(i)) {
            list.add(i);
        }
    }
    Collections.sort(list);
    if (list.size() < 2) {
        System.out.println("No second largest element");
    } else {
        System.out.println("Second largest element is: " + list.get(list.size() - 2));
    }
}
}
