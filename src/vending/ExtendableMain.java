package vending;
import vending.ExtendableProduct.*;



class ExtendableMain {
    public static void main(String[] args) {


        ExtendableVendingMachine machine = new ExtendableVendingMachine(10, 20, 30, 15);
        SoftDrinks softDrinks = new SoftDrinks();
        SaltySnacks saltySnacks = new SaltySnacks();
        Chocolates chocolates = new Chocolates();
        PurpleChoc purpleChoc = new PurpleChoc();
        Product product = new Product();

        machine.buy(softDrinks, 2);
        machine.buy(saltySnacks, 2);
        machine.buy(chocolates, 4);
        machine.buy(purpleChoc, 3);
        machine.buy(product, 2);

        machine.addStock(softDrinks, 7);
        machine.addStock(saltySnacks, 3);
        machine.addStock(chocolates, 5);
        machine.addStock(purpleChoc, 8);

//        machine.buy(chocolates, 2);
        System.out.println(machine.getStock());
        System.out.println("SoftDrinks " + machine.getStock(softDrinks));
        System.out.println("SaltySnacks " + machine.getStock(saltySnacks));
        System.out.println("Chocolates " + machine.getStock(chocolates));
        System.out.println("PurpleChoc " + machine.getStock(purpleChoc));
//
    }
}
