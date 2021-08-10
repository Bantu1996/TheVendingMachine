package tests;

import org.junit.Assert;
import org.junit.Test;
import vending.OverloadedVendingMachine;
import vending.OverloadedProduct.Chocolates;
import vending.OverloadedProduct.Product;
import vending.OverloadedProduct.SaltySnacks;
import vending.OverloadedProduct.SoftDrinks;

    import static org.junit.Assert.assertEquals;

public class OverloadedVendingMachineTesting {
    @Test
    public void givenWhenInstanceOfSofDrinksIsCorrect_thenReturnTrue() {
        SoftDrinks softDrinks = new SoftDrinks();
        Assert.assertTrue(softDrinks instanceof Product);
    }
    @Test
    public void givenWhenInstanceOfSaltySnacksIsCorrect_thenReturnTrue() {
        SaltySnacks saltySnacks = new SaltySnacks();
        Assert.assertTrue(saltySnacks instanceof Product);
    }
    @Test
    public void givenWhenInstanceOfChocolatesIsCorrect_thenReturnTrue() {
        Chocolates chocolates = new Chocolates();
        Assert.assertTrue(chocolates instanceof Product);
    }

@Test
        public void shouldBeAbleToBuySoftDrinks(){
    OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
    SoftDrinks softDrinks = new SoftDrinks();
    machine.buy(softDrinks, 1);
    assertEquals(machine.getStock(softDrinks),2);

}
@Test
    public void shouldBeAbleToBuySoftDrinkTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SoftDrinks softDrinks = new SoftDrinks();
        machine.buy(softDrinks, 1);
        machine.buy(softDrinks, 1);
        assertEquals(machine.getStock(softDrinks),1);

    }

    @Test
    public void shouldBeAbleToBuySoftDrinksThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        SoftDrinks softDrinks = new SoftDrinks();
        machine.buy(softDrinks, 1);
        machine.buy(softDrinks, 1);
        machine.buy(softDrinks, 1);
        assertEquals(machine.getStock(softDrinks),1);

    }

    @Test
    public void shouldBeAbleToBuySaltySnacks(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks, 1);
        assertEquals(machine.getStock(saltySnacks),4);

    }
    @Test
    public void shouldBeAbleToBuySaltySnacksTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks, 1);
        machine.buy(saltySnacks, 1);
        assertEquals(machine.getStock(saltySnacks),3);

    }

    @Test
    public void shouldBeAbleToBuySaltySnacksThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks, 1);
        machine.buy(saltySnacks, 1);
        machine.buy(saltySnacks, 1);
        assertEquals(machine.getStock(saltySnacks),2);

    }

    @Test
    public void shouldBeAbleToBuyChocolate(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        Chocolates chocolates = new Chocolates();
        machine.buy(chocolates, 1);
        assertEquals(machine.getStock(chocolates), 7);

    }
    @Test
    public void shouldBeAbleToBuyChocolateTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        Chocolates chocolate = new Chocolates();
        machine.buy(chocolate, 1);
        machine.buy(chocolate, 1);
        assertEquals(machine.getStock(chocolate),6);

    }

    @Test
    public void shouldBeAbleToBuyChocolateThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        Chocolates chocolate = new Chocolates();
        machine.buy(chocolate, 3);
        assertEquals(machine.getStock(chocolate),5);

    }


    @Test
    public void shouldBeAbleToTestAllThreeProducts(){
    OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
            Product product = new Product();
        SoftDrinks softDrinks = new SoftDrinks();
        SaltySnacks saltySnacks = new SaltySnacks();
        Chocolates chocolates = new Chocolates();
        machine.buy(softDrinks, 2);
        machine.buy(saltySnacks, 3);
        machine.buy(chocolates, 7);

        assertEquals(machine.getStock(softDrinks),2);
        assertEquals(machine.getStock(saltySnacks),2);
        assertEquals(machine.getStock(chocolates),1);

    }
}
