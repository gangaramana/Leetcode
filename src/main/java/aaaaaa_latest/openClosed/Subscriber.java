package aaaDesignpatterns.openClosed;

public abstract class Subscriber {
   private int number;
   private int value;

   public abstract int calculate();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
