package demooooo;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet hashSet = new TreeSet();
        hashSet.add(1);
//        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);
        System.out.println(hashSet.ceiling(1.5));
        System.out.println(hashSet.floor(5));
    }
}
