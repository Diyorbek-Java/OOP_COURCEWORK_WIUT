package Task1AndTask2;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart implements IShoppingCart {
    // Creating Properties for Shopping Cart class which will be initialized in Constructors
    List<Product> products;
    private double totalCost;
    /*
    There are overall two constructors so that user can initialize class as he or she wants
    first constructor is a default one which does not accept any parameter so default sized
    list will initialize second accepts parameter count as a size of a list while initializing class
     */
    public ShoppingCart(){
        this.products = new ArrayList<>();
        totalCost = 0;
    }
    public ShoppingCart(int count) {
        this.products = new ArrayList<>(count);
        totalCost = 0;
    }

    @Override
    public boolean addProduct(Product product) {
        //First adding price to the totalCost field of a class then adding given product to the list of product
        this.totalCost += product.getPrice();
        return this.products.add(product);
    }

    @Override
    public int numberOfProduct() {
        // getting size of a list so that we know how many products are in the list
        return products.size();
    }


    /*
        Method implementation first removes product form the list and according to result if it is successful
        total cost of the shopping class will be decreased and returns the result
     */
    @Override
    public boolean removeProduct(Product product) {

        boolean remove = this.products.remove(product);
        if (remove){
            this.totalCost-=product.getPrice();
        }
        return remove;
    }

    /*
    Method works as a get field method it just returns the field totalCost of an object
     */
    @Override
    public double getTotalCost() {
        return this.totalCost;
    }

}
