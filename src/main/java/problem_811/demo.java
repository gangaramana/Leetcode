package problem_811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        demo d=new demo();
        System.out.println(d.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }


    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        String key = "";

        for (String s : cpdomains) {
            String[] c = s.split(" ");
            int count = Integer.valueOf(c[0]);

            String[] z = c[1].split("\\.");
            for (int i = 0; i < z.length; i++) {
                int p=i;
                while (p<z.length-1){
                    key=key+z[p]+".";
                    p++;
                }
                key=key+z[p];


                if (map.get(key) == null) {
                    map.put(key, 0);
                }
                map.put(key, map.get(key) + count);
                key="";
            }


        }
//        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stringArrayList.add("\""+entry.getValue() + " " + entry.getKey()+"\"");
        }
//        System.out.println(stringArrayList);
        return stringArrayList;

    }
}
