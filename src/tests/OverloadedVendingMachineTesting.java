package tests;

import org.junit.Test;
import vending.OverloadedVendingMachine;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrink;

import static org.junit.Assert.assertEquals;

public class OverloadedVendingMachineTesting {
@Test
        public void shouldBeAbleToBuySoftDrink(){
    OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
    SoftDrink softDrink = new SoftDrink();
    machine.buy(softDrink);
    assertEquals(machine.getStock(softDrink),2);

}
@Test
    public void shouldBeAbleToBuySoftDrinkTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SoftDrink softDrink = new SoftDrink();
        machine.buy(softDrink);
        machine.buy(softDrink);
        assertEquals(machine.getStock(softDrink),1);

    }

    @Test
    public void shouldBeAbleToBuySoftDrinkThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        SoftDrink softDrink = new SoftDrink();
        machine.buy(softDrink);
        machine.buy(softDrink);
        machine.buy(softDrink);

        assertEquals(machine.getStock(softDrink),1);

    }

    @Test
    public void shouldBeAbleToBuySaltySnacks(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks);
        assertEquals(machine.getStock(saltySnacks),4);

    }
    @Test
    public void shouldBeAbleToBuySaltySnacksTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks);
        machine.buy(saltySnacks);
        assertEquals(machine.getStock(saltySnacks),3);

    }

    @Test
    public void shouldBeAbleToBuySaltySnacksThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        SaltySnacks saltySnacks = new SaltySnacks();
        machine.buy(saltySnacks);
        machine.buy(saltySnacks);
        machine.buy(saltySnacks);

        assertEquals(machine.getStock(saltySnacks),2);

    }

    @Test
    public void shouldBeAbleToBuyChocolate(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        Chocolate chocolate = new Chocolate();
        machine.buy(chocolate);
        assertEquals(machine.getStock(chocolate), 7);

    }
    @Test
    public void shouldBeAbleToBuyChocolateTwice(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(3, 5, 8);
        Chocolate chocolate = new Chocolate();
        machine.buy(chocolate);
        machine.buy(chocolate);
        assertEquals(machine.getStock(chocolate),6);

    }

    @Test
    public void shouldBeAbleToBuyChocolateThreeTimes(){
        OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        Chocolate chocolate = new Chocolate();
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);

        assertEquals(machine.getStock(chocolate),5);

    }


    @Test
    public void shouldBeAbleToTestAllThreeProducts(){
    OverloadedVendingMachine machine = new OverloadedVendingMachine(4, 5, 8);
        Product product = new Product();
    SoftDrink softDrink = new SoftDrink();
        SaltySnacks saltySnacks = new SaltySnacks();
        Chocolate chocolate = new Chocolate();
        machine.addStock(product);
        machine.buy(softDrink);
        machine.buy(softDrink);
        machine.buy(saltySnacks);
        machine.buy(saltySnacks);
        machine.buy(saltySnacks);
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);
        machine.buy(chocolate);

        assertEquals(machine.getStock(softDrink),2);
        assertEquals(machine.getStock(saltySnacks),2);
        assertEquals(machine.getStock(chocolate),1);

    }
}
