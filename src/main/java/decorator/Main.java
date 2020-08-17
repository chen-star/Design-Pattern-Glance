package decorator;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-16 23:51
 */
public class Main {

    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.getClass() + " cost:" + espresso.getCost());
        Coffee icedCoffee = new IcedCoffee();
        System.out.println(icedCoffee.getClass() + " cost:" + icedCoffee.getCost());

        // add 1 milk
        Coffee espressoWithMilk1 = new AddMilkDecorator(new Espresso());
        System.out.println(espressoWithMilk1.getClass() + " cost:" + espressoWithMilk1.getCost());

        // add 2 milk
        Coffee original = new Espresso();
        Coffee espressoWithMilk2 = new AddMilkDecorator(original);
        espressoWithMilk2 = new AddMilkDecorator(espressoWithMilk2);
        System.out.println(espressoWithMilk2.getClass() + " cost:" + espressoWithMilk2.getCost());
    }
}
