package problem_1104;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PathInBinaryTree {
    public static void main(String[] args) {
        PathInBinaryTree pathInBinaryTree = new PathInBinaryTree();
        pathInBinaryTree.pathInZigZagTree(0);
    }

    public List<Integer> pathInZigZagTree(int label) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (label < 1) {
            return arrayList;
        }
        int no = label;

        while (label != 1) {
            arrayList.add(0, label);
            no = label / 2;
            int k = (int) (Math.log(no) / Math.log(2));
            label = mirror(no, k);

        }
        arrayList.add(0, 1);
//        System.out.println(arrayList);
        return arrayList;


    }

    private int mirror(int label, int power) {
        if (label == Math.pow(2, label + 1) - 1) {
            return (int) Math.pow(2, label);
        } else {
            int n = (int) (label - Math.pow(2, power));
            return (int) (Math.pow(2, power + 1) - 1 - n);
        }
    }
}
