package problem_1834;

import java.util.Comparator;
import java.util.PriorityQueue;

class CPUThread {
    int availableTime;
    int finishTime;
    int index;

    public CPUThread(int availableTime, int finishTime, int index) {
        this.availableTime = availableTime;
        this.finishTime = finishTime;
        this.index = index;
    }
}

class MyComparator implements Comparator<CPUThread> {
    public int compare(CPUThread x, CPUThread y) {
        if (x.availableTime == y.availableTime) {
            return Integer.compare(y.finishTime, x.finishTime);
        }

        return Integer.compare(x.availableTime, y.availableTime);
    }
}

class MyComparator2 implements Comparator<CPUThread> {
    public int compare(CPUThread x, CPUThread y) {
        if (x.finishTime == y.finishTime) {
            return Integer.compare(y.availableTime, x.availableTime);
        }

        return Integer.compare(x.finishTime, y.finishTime);
    }
}

public class SingleThreadCPU {
    public static void main(String[] args) {
        SingleThreadCPU singleThreadCPU=new SingleThreadCPU();
       int[] res= singleThreadCPU.getOrder(new int[][]{{23,40},{10,32},{12,18},{10,39},{25,4},{18,12},{38,18},{36,1},{26,5},{45,35},{5,43},{19,19},{46,41},{25,22},{29,17},{26,33},{49,45},{43,44},{50,2}});
       for (int c:res){
           System.out.print(c+"   ");
       }

    }

    public int[] getOrder(int[][] tasks) {
        if (tasks.length <= 1) {
            return new int[0];
        }
        PriorityQueue<CPUThread> cpuThreads = new PriorityQueue<>(new MyComparator());
        for (int i = 0; i < tasks.length; i++) {
            cpuThreads.add(new CPUThread(tasks[i][0], tasks[i][1], i));
        }
        int[] result = new int[tasks.length];
        CPUThread obj = cpuThreads.poll();
        int i = 0;
        result[i] = obj.index;

        int finishTime = obj.availableTime+obj.finishTime;
        PriorityQueue<CPUThread> p2 = new PriorityQueue<>(new MyComparator2());
        while (i < tasks.length-1) {
            while (!cpuThreads.isEmpty() && finishTime >= cpuThreads.peek().availableTime ) {
                p2.add(cpuThreads.poll());
            }
            i++;
            CPUThread c = p2.isEmpty()? cpuThreads.poll():p2.poll();
            System.out.println(i);
            result[i] = c.index;
            finishTime = finishTime + c.finishTime;

        }
        while (!p2.isEmpty()){
            i++;
            result[i] = p2.poll().index;
        }
        return result;
    }

}
