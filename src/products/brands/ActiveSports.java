package products.brands;

import interfaces.IManufacture;

public class ActiveSports implements IManufacture {

    @Override
    public String manufactureBrand() {
        return "Active sports";
    }
}
