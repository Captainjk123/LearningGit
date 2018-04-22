package map;

import java.util.*;

public class Maptext {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Emp emp1 = new Emp("351", "张三");
        Emp emp2 = new Emp("444", "李四");
        Emp emp3 = new Emp("433","王五");
        Emp emp4 = new Emp("875", "赵六");
        Emp emp5 = new Emp("563", "陈七");

        map.put(emp4.getE_id(), emp4.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());
        map.put(emp1.getE_id(), emp1.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp5.getE_id(), emp5.getE_name());

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap实现的Map集合,无序：");
        while (it.hasNext()){
            String s = it.next();
            String name = map.get(s);
            System.out.println(s + " " + name);
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> iter = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合,键对象升序: ");
        while (iter.hasNext()){
            String s = iter.next();
            String name = treeMap.get(s);
            System.out.println(s + " " + name);
        }
    }
}
