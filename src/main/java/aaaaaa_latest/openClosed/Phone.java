package aaaDesignpatterns.openClosed;

public class Phone extends Subscriber{


    @Override
    public int calculate() {
        return this.getNumber()+this.getValue();
    }
}
