package problem_811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainCount {
    public static void main(String[] args) {
//        Map m = new HashMap<String, Integer>();
//        if (m.get("val.com") == null) {
//            m.put("val.com", 0);
//        }
//        m.put("val", (Integer) m.get("val.com") + 30);
//        System.out.println(m.get("val"));

        SubdomainCount subdomainCount = new SubdomainCount();
        subdomainCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});


    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> stringArrayList=new ArrayList<String>();

        for (String s : cpdomains) {
            String[] c = s.split(" ");
            int count = Integer.valueOf(c[0]);
            String key = "";
            String[] z = c[1].split("\\.");
            for (int i = z.length - 1; i >= 0; i--) {
                if (i == 0) {
                    key = key + z[i];

                } else {
                    key = key + z[i] + ".";
                }

                if (map.get(key) == null) {
                    map.put(key, 0);
                }
                map.put(key, map.get(key) + count);
            }

        }
        System.out.println(map);
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            stringArrayList.add(entry.getValue()+" "+entry.getKey() );
        }
        System.out.println(stringArrayList);
        return new ArrayList<String>();

    }
}
