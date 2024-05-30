package problem_118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

        PascalTriangle pascalTriangle=new PascalTriangle();
        System.out.println(pascalTriangle.generate(4));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>(numRows);
        for (int i=1;i<=numRows;i++){
            List<Integer> list=new ArrayList<>(i);
            result.add(list);
            list.add(0,1);
            if (i==1){
                continue;
            }
            list.add(list.size()-1,1);
            if (i>2){
                for (int j=1;j<i-2;j++){
                    int value=result.get(j-1).get(j-1)+result.get(j-1).get(j);
                    list.add(j,value);
                }
            }
        }
return result;
    }
}
