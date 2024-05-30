package google.cracking_the_coding.problem_1482;

public class Boquet {
    public static void main(String[] args) {
        Boquet boquet=new Boquet();

        System.out.println(boquet.minDays(new int[]{1,10,2,9,3,8,4,7,5,6},89945,32127));
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length<m*k || m*k <0){
            return -1;
        }
        int L=Integer.MAX_VALUE,R=Integer.MIN_VALUE;
        for(int i:bloomDay){

            if(L>i){
                L=i;
            }
            if(R<i){
                R=i;
            }
        }

        while(L<R){

            int pivot=L+(R-L)/2;

            if(condition(bloomDay,m,k,pivot)){
                R=pivot;
            }
            else{
                L=pivot+1;
            }

        }
        return L;
    }


    public boolean condition(int[] bloomDay,int boqueCount, int flowerCount, int targetDay){

        int sum=0,boque=0;

        for(int I: bloomDay){

            if(I>targetDay){
                sum=0;
            }
            else if(sum+1 == flowerCount){
                sum=0;
                boque++;

            }
            else{
                sum+=1;
            }


        }

        return boque>= boqueCount ? true:false;

    }
}

