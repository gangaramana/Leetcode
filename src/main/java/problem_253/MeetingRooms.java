package problem_253;

import javafx.util.Pair;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

class MyComparator implements Comparator<Pair<Integer,Integer>> {


    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return Integer.compare(o1.getKey(),o2.getKey());
    }
}
public class MeetingRooms {
    public static void main(String[] args) throws IOException {
//        MeetingRooms meetingRooms=new MeetingRooms();
//       int res= meetingRooms.minMeetingRooms(new int[][]{{7,10},{2,4}});
        File file = new File("./dssdf");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("dcs");
        bufferedWriter.close();
        Path currentDirectoryPath = FileSystems.getDefault().getPath("");
        String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
        System.out.println("Current Directory = \"" + currentDirectoryName + "\"");
        URL location = MeetingRooms.class.getProtectionDomain().getCodeSource().getLocation();
//        System.out.println(location.getPath());
        System.out.println(MeetingRooms.class.getResource("").getPath());
    }
//        String routePath = this.getClass().getClassLoader().getResource(File.separator).getPath();




    public int minMeetingRooms(int[][] intervals) {
        String routePath = this.getClass().getClassLoader().getResource(File.separator).getPath();
        System.out.println(routePath);

        PriorityQueue<Pair<Integer, Integer>> pairPriorityQueue = new PriorityQueue<>(new MyComparator());
        for (int [] interval:intervals){
            pairPriorityQueue.add(new Pair<Integer,Integer>(interval[0],interval[1]));
        }
        PriorityQueue<Integer> stack=new PriorityQueue<>();

        while (!pairPriorityQueue.isEmpty()){
            if (stack.isEmpty()){
               stack.add( pairPriorityQueue.poll().getValue());
            }
            else {
                if (stack.peek()>pairPriorityQueue.peek().getKey()){
                    stack.add(pairPriorityQueue.poll().getValue());
                }
                else {
                    stack.poll();
                    stack.add(pairPriorityQueue.poll().getValue());
                }

            }
        }
        return stack.size();

    }
}
