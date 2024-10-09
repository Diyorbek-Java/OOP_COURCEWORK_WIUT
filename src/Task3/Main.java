package Task3;

import Task1AndTask2.Product;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Lenovo 5 Pro",536.30);
        Product phone = new Product("Samsung A5",120.00);
        Product watch = new Product("Bigby 4C",75.00);
        Product noteBook = new Product("NoteBook",0.51);
        Product pencil = new Product("pencil",0.3);
        ShoppingCart_Task2 shoppingCart = new ShoppingCart_Task2();

        // Adding process
        if (shoppingCart.addProduct(laptop)){
            System.out.println(laptop.getName()+" successfully added");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(laptop.getName()+" unsuccessfully added");
        }
        if (shoppingCart.addProduct(phone)){
            System.out.println(phone.getName()+" successfully added");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(phone.getName()+" unsuccessfully added");
        }
        if (shoppingCart.addProduct(watch)){
            System.out.println(watch.getName()+" successfully added");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else
            System.out.println(watch.getName()+" unsuccessfully added");

        if (shoppingCart.addProduct(noteBook)){
            System.out.println(noteBook.getName()+" successfully added");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else
            System.out.println(noteBook.getName()+" unsuccessfully added");

        // Removing process
        if (shoppingCart.removeProduct(laptop)){
            System.out.println(laptop.getName()+" successfully removed");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(laptop.getName()+" not is product list");
        }
        if (shoppingCart.removeProduct(phone)){
            System.out.println(phone.getName()+" successfully removed");

            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(phone.getName()+" not is product list");
        }
        if (shoppingCart.removeProduct(watch)){
            System.out.println(watch.getName()+" successfully removed");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(watch.getName()+" not is product list");
        }
        if (shoppingCart.removeProduct(pencil)){
            System.out.println(pencil.getName()+" successfully removed");
            System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
            System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
            System.out.println();
        }else {
            System.out.println(pencil.getName()+" not is product list");
        }

        System.out.println("Total Cost of Products is: "+shoppingCart.getTotalCost()+" $");
        System.out.println("Total number of Products is: "+shoppingCart.numberOfProduct());
    }
}
