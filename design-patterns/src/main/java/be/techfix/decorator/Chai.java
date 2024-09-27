package be.techfix.decorator;

public class Chai extends Beverage {

    @Override
    public String description() {
        return super.description() + " Chai";
    }
    @Override
    double cost() {
        return 50;
    }
}
