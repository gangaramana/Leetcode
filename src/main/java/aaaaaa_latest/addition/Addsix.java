package aaaaaa_latest.addition;

public class Addsix {
    public static void main(String[] args) {
        Addsix a=   new Addsix();
        int k=a.getBalance(123434);
        System.out.println(k);
        int second= a.getBalance(123);
        System.out.println(second);
        System.out.println( second-10);

    }
public void addMethod(int a,int b){
    System.out.println(a+b);
}

public int getBalance(int accountNumber){
//        /sachiabdca
    return accountNumber-1;
}

//public int addAmount(){
//
//}
}
