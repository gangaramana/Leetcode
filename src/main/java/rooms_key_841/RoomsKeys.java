//package rooms_key_841;
//
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Stack;
//
//public class RoomsKeys {
//    public static void main(String[] args) {
////        RoomsKeys roomsKeys = new RoomsKeys();
////        List<List<Integer>> k = new ArrayList<>();
////        List<Integer> l = new ArrayList<>();
////        l.add(2);
////        l.add(3);
////        List<Integer> l2 = new ArrayList<>();
//////        l2.add(2);
//////        l2.add(2);
//////        l2.add(1);
////        List<Integer> l3 = new ArrayList<>();
////        l3.add(2);
////        List<Integer> l4 = new ArrayList<>();
////        l4.add(1);
////        l4.add(3);
////        l4.add(1);
////        k.add(l);
////        k.add(l2);
////        k.add(l3);
////        k.add(l4);
////        System.out.println(roomsKeys.canVisitAllRooms(k));
//
//        System.out.println(Date.from(Instant.now()).compareTo(new Date(2022,5,1)));
//
//        System.out.println( new Date(2022,11,1).compareTo(Date.from(Instant.now())));
//        String kk="boot-"+Date.from(Instant.now()).toString().replaceAll("\\s+","-");
//        LocalDate localDate=LocalDate.now(ZoneId.of("UTC"));
//        System.out.println("Boot-"+localDate);
////        System.out.println(kk.substring(0,15));
////        System.out.println("boot-"+Date.from(Instant.now()).toString().replaceAll("\\s+","-"));
//    }
//
//    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        if (rooms.size() == 0) {
//            return true;
//        } else {
//            List<Integer> x = rooms.get(0);
//
//            Stack<Integer> stack = new Stack<>();
////            if (x.size() > 0) {
//                stack.add(0);
////            }
//            HashSet<Integer> visited = new HashSet<>();
//            visited.add(0);
//            while (!stack.isEmpty()) {
//                int k = stack.pop();
//                List<Integer> y = rooms.get(k);
//                visited.add(k);
//                for (int i = 0; i < y.size(); i++) {
//                    if (!visited.contains(y.get(i))) {
//                        stack.add(y.get(i));
//                    }
//                }
//
//            }
//            if (rooms.size() == visited.size()) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//    }
//}
