//package name "vending".... :)
package vending;

//importing all the files from the "ExtendableProduct" package to the "ExtendableVendingMachine" class... :)
import vending.ExtendableProduct.*;


public class ExtendableVendingMachine {


    int softDrinksQty, saltySnacksQty, chocolatesQty, purpleChocQty;

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int purpleChocQty){
        this.softDrinksQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.purpleChocQty = purpleChocQty;
    };

    //Buying my products from the vending machine now... :)
    public void buy(Product product, int qty){
        if(product instanceof SoftDrinks){
            softDrinksQty -= qty ;
        }
        if(product instanceof SaltySnacks){
            saltySnacksQty -= qty ;
        }
        if(product instanceof Chocolates){
            chocolatesQty -= qty ;
        }
        if(product instanceof PurpleChoc){
            purpleChocQty -= qty ;
        }
    };

    //Adding the stock to the vending machine... :)
    public void addStock(Product product, int qty){
        if(product instanceof SoftDrinks){
            softDrinksQty += qty;
        }
        if(product instanceof SaltySnacks){
            saltySnacksQty += qty;
        }
        if(product instanceof Chocolates){
            chocolatesQty += qty;
        }
        if(product instanceof PurpleChoc){
            purpleChocQty += qty;
        }
    };

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
        if(product instanceof PurpleChoc){
            qty = this.purpleChocQty;
        }
        return qty;
    };

    public int getStock(){
        int qty = softDrinksQty + saltySnacksQty + chocolatesQty + purpleChocQty;
        return qty;
    }
}
