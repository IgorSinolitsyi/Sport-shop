package products.tShirts;

import interfaces.IManufacture;
import interfaces.IProduct;
import products.brands.ActiveSports;

public abstract class TShirts implements IProduct {

    @Override
    public IManufacture manufacturingBrand() {
        return new ActiveSports();
    }

    @Override
    public abstract double price();
}
