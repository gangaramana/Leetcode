//package problem_937;
//
//
//import java.util.Map;
//import java.util.TreeMap;
//
//public class WithTreeMap {
//    public static void main(String[] args) {
//        WithTreeMap w = new WithTreeMap();
//        w.reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "d4 act zerr"});
//
//    }
//
//    public String[] reorderLogFiles(String[] logs) {
//        TreeMap<String, String> treeMap = new TreeMap<String, String>();
//        TreeMap<String, String> anotherTreeMap = new TreeMap<String, String>();
//        TreeMap<String, String> noMap = new TreeMap<String, String>();
//
//        for (int i = 0; i < logs.length; i++) {
//            String[] x = logs[i].split(" ");
//            if (!isNumeric(x[1])) {
//                if (!treeMap.containsKey(x[1])) {
//                    treeMap.put(x[1], logs[i]);
//                } else {
//                    anotherTreeMap.put( x[0],logs[i]);
//                    anotherTreeMap.put( treeMap.get(x[1]).split(" ")[0],treeMap.get(x[1]));
//                }
//
//            } else {
//                noMap.put(x[1], logs[i]);
//            }
//        }
//        System.out.println(treeMap);
//        System.out.println();
//        System.out.println(anotherTreeMap);
//        System.out.println(noMap);
//
//        for (Map.Entry<String, String> k : treeMap.entrySet()) {
//            for ()
//            if (anotherTreeMap.containsKey(k.getValue())) {
//
//
//            }
//
//        }
//
//
//        return logs;
//    }
//
//    public boolean isNumeric(String val) {
//        try {
//            double d = Integer.valueOf(val);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
//
//}
