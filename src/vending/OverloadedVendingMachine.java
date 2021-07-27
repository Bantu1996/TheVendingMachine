package vending;
import vending.product.*;

public class OverloadedVendingMachine {
int softDrinkQty, saltySnacksQty, chocolatesQty;

//My Overloaded constructor...
public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    };


    //Buying my products from the vending machine now... :)
    public void buy(SoftDrink softDrink){
        softDrinkQty = softDrinkQty - 1;
    };
    public void buy(SaltySnacks saltySnacks){
        saltySnacksQty = saltySnacksQty - 1;
    };
    public void buy(Chocolate chocolate){
        chocolatesQty = chocolatesQty - 1;
    };
    public void buy(Product product){
    };

    //Adding the stock to the vending machine... :)
    public void addStock(SoftDrink softdrink){
        softDrinkQty = softDrinkQty + 1;
    };
    public void addStock(SaltySnacks saltySnacks){
        saltySnacksQty = saltySnacksQty + 1;
    };
    public void addStock(Chocolate chocolate){
        chocolatesQty = chocolatesQty + 1;
    };
    public void addStock(Product product){
    };

    //Getting the bought item from the vending machine... :)
    public int getStock(SoftDrink softdrink){
       return softDrinkQty;
    };
    public int getStock(SaltySnacks saltySnacks) {
       return saltySnacksQty;
    }
    public int getStock(Chocolate chocolate){
        return chocolatesQty;
    }
}
