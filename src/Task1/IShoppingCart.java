package Task1;

public interface IShoppingCart {

    boolean addProduct(Product product);
    boolean removeProduct(Product product);
    double getTotalCost();
    int numberOfProduct();
}
