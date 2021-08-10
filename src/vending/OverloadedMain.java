package vending;
import vending.OverloadedProduct.*;


public class OverloadedMain {
        public static void main(String[] args){
            OverloadedVendingMachine machine = new OverloadedVendingMachine(12, 25, 30);
            SoftDrinks softDrinks = new SoftDrinks();
            SaltySnacks saltySnacks = new SaltySnacks();
            Chocolates chocolates = new Chocolates();


        machine.buy(softDrinks, 2);
        machine.buy(saltySnacks, 3);
        machine.buy(chocolates, 4);

            machine.addStock(softDrinks, 7);
            machine.addStock(saltySnacks, 3);
            machine.addStock(chocolates, 5);

        System.out.println(machine.getStock());
        System.out.println("SoftDrinks " + machine.getStock(softDrinks));
        System.out.println("SaltySnacks " + machine.getStock(saltySnacks));
        System.out.println("Chocolates " + machine.getStock(chocolates));
    }
}
