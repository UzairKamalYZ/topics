package be.techfix.decorator;

public class DodhPati extends BeverageDecorator {

    public DodhPati(Beverage beverageToBeDecorated) {
        this.beverage = beverageToBeDecorated;
    }

    @Override
    public String description() {
        return beverage.description() + " with extra Dodh & Pati";
    }

    @Override
    protected double cost() {
        return beverage.cost() + 10;
    }
}
