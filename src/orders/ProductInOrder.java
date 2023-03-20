package orders;

import interfaces.IProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductInOrder {

    List<IProduct> products = new ArrayList<>();

    public void addItem(IProduct product) {
        products.add(product);
    }

    public double getCost() {
        double cost = 0.0d;

        for (IProduct product : products) {
            cost += product.price();
        }
        return cost;
    }

    public void showProducts() {
        for (IProduct product : products) {
            System.out.print("Product name : " + product.name());
            System.out.print(", Brand : " + product.manufacturingBrand().manufactureBrand());
            System.out.print(", Color : " + product.color().getTitle());
            System.out.println(", Price : " + product.price());
        }
    }
}
