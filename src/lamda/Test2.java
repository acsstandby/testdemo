package lamda;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
//       Test2:say();
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(7);
//        list.forEach(a-> System.out.println(a));
        Map<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        map.forEach((k,v)-> System.out.println(k+v));
        Set<String> set=map.keySet();
        for (String key:set
             ) {
            System.out.println(map.get(key));
        }
        Set<Map.Entry<String,String>> entry=map.entrySet();
        for (Map.Entry<String,String> en:entry
             ) {
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

    }
    public static void say(){
        System.out.println("hello");
    }
}
