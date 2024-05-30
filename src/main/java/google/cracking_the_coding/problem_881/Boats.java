package google.cracking_the_coding.problem_881;

import java.util.Arrays;
import java.util.Date;

public class Boats {
    public static void main(String[] args) {
        Boats boats=new Boats();
//        System.out.println(boats.numRescueBoats(new int[]{2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10},50));


        long timestamp = 1645257600000L; // Replace this with your long timestamp

        // Convert long timestamp to Date object
        Date date = new Date(timestamp);
        String s="fsdfsdfsdfr";

        System.out.println("Timestamp: " + timestamp);
        System.out.println("Date: " + date);
    }

        public int numRescueBoats(int[] people, int limit) {
            int i=0,j=people.length-1,boats=0;
            Arrays.sort(people);
            while(i<=j){
                int sum=0;
                if(sum+people[j]<=limit){
                    sum+=people[j];
                    j--;

                }
                while(i<=j){
                    if(sum+people[i]<=limit){
                        sum+=people[i];
                        i++;
                    }
                    else{
                        break;
                    }
                }
                boats++;
            }
            return boats;

        }
    }
