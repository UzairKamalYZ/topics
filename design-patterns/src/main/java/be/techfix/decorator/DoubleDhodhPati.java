package be.techfix.decorator;

public class DoubleDhodhPati extends BeverageDecorator {

    DoubleDhodhPati(Beverage beverageToBeDecorated) {

        this.beverage = beverageToBeDecorated;
    }

    @Override
    public String description() {
        return beverage.description() + " twice  extra Dodh & Pati";
    }

    @Override
    protected double cost() {
        return beverage.cost() + 10;
    }
}
