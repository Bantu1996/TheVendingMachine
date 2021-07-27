package vending;
import vending.product.*;


public class Main {
    public static void main(String[] args){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(12, 25, 30);
        SoftDrink softDrink = new SoftDrink();
        SaltySnacks saltySnacks = new SaltySnacks();
        Chocolate chocolates = new Chocolate();


        machine.buy(softDrink);
        machine.buy(saltySnacks);
        machine.buy(chocolates);
        System.out.println(machine.getStock(softDrink));
        System.out.println(machine.getStock(saltySnacks));
        System.out.println(machine.getStock(chocolates));
    }
}
