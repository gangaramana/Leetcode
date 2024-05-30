package aaaDesignpatterns.openClosed;

public class Parent {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.setNumber(10);
        phone.setValue(11);
        System.out.println( phone.calculate());
    }
}
