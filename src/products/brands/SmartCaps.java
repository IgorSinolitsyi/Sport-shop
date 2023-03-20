package products.brands;

import interfaces.IManufacture;

public class SmartCaps implements IManufacture {

    @Override
    public String manufactureBrand() {
        return "Smart caps";
    }
}
