package Task1;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart implements IShoppingCart {
    List<Product> products = new ArrayList<>();
    private double totalCost;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        totalCost = 0;
    }

    @Override
    public boolean addProduct(Product product) {
        this.totalCost += product.getPrice();
        return this.products.add(product);
    }

    @Override
    public int numberOfProduct() {
        return products.size();
    }

    @Override
    public boolean removeProduct(Product product) {
        boolean remove = this.products.remove(product);
        if (remove){
            this.totalCost-=product.getPrice();
        }
        return remove;
    }

    @Override
    public double getTotalCost() {
        return this.totalCost;
    }

}
