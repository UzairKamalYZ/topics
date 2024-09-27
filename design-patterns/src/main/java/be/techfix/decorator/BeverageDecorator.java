package be.techfix.decorator;

public abstract class BeverageDecorator extends Beverage {

    Beverage beverage;
    public abstract String description();
}
