package map;

import java.util.*;

public class LearningMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "陈");
        map.put("02", "李");
        map.put("03", "王");

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("Key集合中的元素: ");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("Values集合中的元素： ");
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
