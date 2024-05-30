package problem_451;

import javax.xml.soap.Node;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


class Nodemap {
    int count;
    char c;

    public Nodemap(char c, int count) {
        this.c = c;
        this.count = count;

    }
}

public class SortCharacterFrequency {
    public static void main(String[] args) {
        SortCharacterFrequency sortCharacterFrequency=new SortCharacterFrequency();
        sortCharacterFrequency.frequencySort("tree");
    }

    public class MyComparator implements Comparator<Nodemap> {
        public int compare(Nodemap x, Nodemap y) {
            return Integer.compare(y.count, x.count);
        }
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Nodemap> nodemaps = new PriorityQueue<>(new MyComparator());
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            nodemaps.add(new Nodemap(entry.getKey(), entry.getValue()));
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!nodemaps.isEmpty()){
            Nodemap nodemap=nodemaps.poll();
            for (int i=0;i<nodemap.count;i++)
            stringBuilder.append(nodemap.c);
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();

    }
}
