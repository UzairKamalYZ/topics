package be.techfix.decorator;

public class Main {
    public static void main(String[] args) {

        // We have chai the basic option.
        Beverage chai = new Chai();


        System.out.println(chai.description());
        System.out.println(chai.cost());

        //lets spice it up and make it dodh pati which has extra cost.
        Beverage dodhPatiChai = new DodhPati(chai);

        System.out.println(dodhPatiChai.description());
        System.out.println(dodhPatiChai.cost());


        //In our country there is concept of double dodh pati as well
        Beverage doubleDodhPatiChai = new DoubleDhodhPati(dodhPatiChai);

        System.out.println(doubleDodhPatiChai.description());
        System.out.println(doubleDodhPatiChai.cost());
    }
}
