package be.techfix.decorator;

public abstract class Beverage {
    public String description() {
        return "The Beverage is ::";
    }

    abstract double cost();
}
