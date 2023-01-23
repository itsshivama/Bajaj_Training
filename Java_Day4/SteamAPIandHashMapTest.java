package PehlaPackage;

import java.util.*;

public class SteamAPIandHashMapTest {
    public static void main(String args[])
    {
        Map<Integer, String> m = new HashMap<>();
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");
        m.put(4,"d");

        Set<Integer> s = m.keySet();

        for(Integer key: s)
        {
            System.out.println(key);
        }

        List<String> list = new ArrayList<>();

        list.add("Sumit");
        list.add("Shivam");
        list.add("Saurabh");
        list.add("Devansh");

        List<Integer> size = list.stream()
                .map(String::length)
                .filter(num -> num>5)
                .toList();

        list.stream()
                .map(String::length)
                .filter(num -> num>5)
                .forEach(System.out::println);
        System.out.println(size);
    }
}
