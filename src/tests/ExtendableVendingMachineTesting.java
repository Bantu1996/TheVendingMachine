package tests;

import org.junit.Test;
import vending.ExtendableVendingMachine;
import vending.ExtendableProduct.Product;
import vending.ExtendableProduct.SoftDrinks;
import  vending.ExtendableProduct.SaltySnacks;
import  vending.ExtendableProduct.Chocolates;
import vending.ExtendableProduct.PurpleChoc;

import static org.junit.Assert.assertEquals;

public class ExtendableVendingMachineTesting {
    @Test
    public void ShouldBeAbleToBuySoftDrinks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
            SoftDrinks softDrinks = new SoftDrinks();
            machine.buy(softDrinks, 2);
            assertEquals(machine.getStock(softDrinks), 1);
    }
    @Test
    public void ShouldBeAbleToBuySaltySnacks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks, 2);
        assertEquals(machine.getStock(saltySnacks), 3);
    }
    @Test
    public void ShouldBeAbleToBuyChocolates(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        Chocolates chocolates = new Chocolates();
        machine.buy(chocolates, 2);
        assertEquals(machine.getStock(chocolates), 6);
    }
    @Test
    public void ShouldBeAbleToBuyPurpleChoc(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        PurpleChoc purpleChoc = new PurpleChoc();
        machine.buy(purpleChoc, 2);
        assertEquals(machine.getStock(purpleChoc), 23);
    }
    @Test
    public void ShouldBeAbleToAddSoftDrinks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        SoftDrinks softDrinks = new SoftDrinks();
        machine.addStock(softDrinks, 2);
        assertEquals(machine.getStock(softDrinks), 5);
    }
    @Test
    public void ShouldBeAbleToAddSaltySnacks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.addStock(saltySnacks, 2);
        assertEquals(machine.getStock(saltySnacks), 7);
    }
    @Test
    public void ShouldBeAbleToAddChocolates(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        Chocolates chocolates = new Chocolates();
        machine.addStock(chocolates, 2);
        assertEquals(machine.getStock(chocolates), 10);
    }
    @Test
    public void ShouldBeAbleToAddPurpleChoc(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        PurpleChoc purpleChoc = new PurpleChoc();
        machine.addStock(purpleChoc, 2);
        assertEquals(machine.getStock(purpleChoc), 27);
    }
    @Test
    public void ShouldBeAbleToBuyAndAddSoftDrinks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        SoftDrinks softDrinks = new SoftDrinks();
        machine.buy(softDrinks, 2);
        machine.addStock(softDrinks, 8);
        assertEquals(machine.getStock(softDrinks), 9);
    }
    @Test
    public void ShouldBeAbleToBuyAndAddSaltySnacks(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks, 2);
        machine.addStock(saltySnacks, 8);
        assertEquals(machine.getStock(saltySnacks), 11);
    }
    @Test
    public void ShouldBeAbleToBuyAndAddChocolates(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        Chocolates chocolates = new Chocolates();
        machine.buy(chocolates, 2);
        machine.addStock(chocolates, 8);
        assertEquals(machine.getStock(chocolates), 14);
    }
    @Test
    public void ShouldBeAbleToBuyAndAddPurpleChoc(){
        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
        PurpleChoc purpleChoc = new PurpleChoc();
        machine.buy(purpleChoc, 2);
        machine.addStock(purpleChoc, 8);
        assertEquals(machine.getStock(purpleChoc), 31);
    }
//    @Test
//    public void ShouldBeAbleToBuyAndAddProducts(){
//        ExtendableVendingMachine machine = new ExtendableVendingMachine(3, 5, 8, 25);
//        Product product = new Product();
//        machine.buy(product, 2);
////        machine.addStock(purpleChoc, 8);
//        assertEquals(machine.getStock(product), 31);
//    }
}
