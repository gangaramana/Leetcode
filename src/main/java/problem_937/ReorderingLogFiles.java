package problem_937;


import java.util.*;

//Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//        Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
public class ReorderingLogFiles {
    public static void main(String[] args) {
        ReorderingLogFiles r = new ReorderingLogFiles();
       String [] logs= r.reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"});
        for(String k:logs){
            System.out.println(k);
        }

    }

    public String[] reorderLogFiles(String[] logs) {
        String[] result=new String[logs.length];
        ArrayList<String> numbers=new ArrayList<>();
        ArrayList<String> letters=new ArrayList<>();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            char secondWord=logs[i].split(" ")[1].charAt(0);
            if(secondWord>='0' && secondWord<='9'){
                numbers.add(logs[i]);
            }else{

                String words=logs[i].split(" ",2)[1];
                if(map.containsKey(words)){
                    String a=map.get(words);
                    String b=logs[i];
                    map.remove(words);
                    letters.remove(words);
                    map.put(words+a,a);
                    map.put(words+b,b);
                    letters.add(words+a);
                    letters.add(words+b);
                }else{
                    map.put(words,logs[i]);
                    letters.add(words);
                }
            }

        }
        Collections.sort(letters);
        int j=0;
        for(int i=0;i<result.length;i++){
            if(i<letters.size()){
                result[i]=map.get(letters.get(i));
            }
            else{
                result[i]=numbers.get(j);
                j++;
            }
        }
        return result;
    }
}
