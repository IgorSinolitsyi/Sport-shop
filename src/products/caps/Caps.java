package products.caps;

import interfaces.IManufacture;
import interfaces.IProduct;
import products.brands.SmartCaps;

public abstract class Caps implements IProduct {

    @Override
    public IManufacture manufacturingBrand() {
        return new SmartCaps();
    }

    @Override
    public abstract double price();
}
