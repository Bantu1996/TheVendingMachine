package vending;

import vending.OverloadedProduct.*;

public class OverloadedVendingMachine {
    int softDrinksQty, saltySnacksQty, chocolatesQty;

//My Overloaded constructor...
public OverloadedVendingMachine(int softDrinksQty, int saltySnacksQty, int chocolatesQty){
        this.softDrinksQty = softDrinksQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    };


    //Buying my products from the vending machine now... :)
    public void buy(Product product, int qty){
        if(product instanceof SoftDrinks){
            softDrinksQty -= qty ;
        }
        if(product instanceof SaltySnacks){
            saltySnacksQty -= qty ;
        }
        if(product instanceof Chocolates) {
            chocolatesQty -= qty;
        }
        };

    //Adding the stock to the vending machine... :)

    public void addStock(Product product, int qty) {
        if (product instanceof SoftDrinks) {
            softDrinksQty += qty;
        }
        if (product instanceof SaltySnacks) {
            saltySnacksQty += qty;
        }
        if (product instanceof Chocolates) {
            chocolatesQty += qty;
        }
    }
    //Getting the bought item from the vending machine... :)
    public int getStock(Product product){
        int qty = 0;
        if(product instanceof SoftDrinks){
            qty = this.softDrinksQty;
        }
        if(product instanceof SaltySnacks){
            qty = this.saltySnacksQty;
        }
        if(product instanceof Chocolates){
            qty = this.chocolatesQty;
        }
        return qty;
    };
    public int getStock(){
        int qty = softDrinksQty + saltySnacksQty + chocolatesQty ;
        return qty;
    }
}
