package Task3;

import Task1AndTask2.Product;

public interface IShoppingCart_Task2 {
    // Since it is an interface there is not body for them
    // Add and return method has return type boolean to check that given project is added or removed successfully
    boolean addProduct(Product product);
    boolean removeProduct(Product product);
    double getTotalCost();
    int numberOfProduct();
}
