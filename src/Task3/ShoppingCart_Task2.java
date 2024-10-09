package Task3;

import Task1AndTask2.Product;


import java.util.List;

public class ShoppingCart_Task2 implements IShoppingCart_Task2 {

    XMLRepository productRepository = new XMLRepository();
    List<Product> products;
    private double totalCost;

    // Constructor: initializes the total cost
    public ShoppingCart_Task2() {
        this.products = productRepository.loadProducts();
        setTotalCost();
    }

    // Add product to the cart and update total cost
    @Override
    public boolean addProduct(Product product) {
        boolean result = productRepository.saveProducts(product);
        if (result) {
            this.totalCost += product.getPrice();
            this.products.add(product);
            return true;
        }
        return false;
    }

    // Get the number of products in the cart
    @Override
    public int numberOfProduct() {
        return productRepository.loadProducts().size();
    }

    // Remove a product from the cart and update total cost
    @Override
    public boolean removeProduct(Product product) {
        boolean remove = productRepository.deleteProduct(product.getName());
        if (remove) {
            this.products.remove(product);
            this.totalCost -= product.getPrice();
        }
        return remove;
    }

    // Get the total cost of all products in the cart
    @Override
    public double getTotalCost() {
        return this.totalCost;
    }

    private void setTotalCost(){
        for (Product product : this.products) {
            this.totalCost+= product.getPrice();
        }
    }
}
