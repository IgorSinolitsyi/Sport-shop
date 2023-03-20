package interfaces;

import utils.Colors;

public interface IProduct {
    String name();
    IManufacture manufacturingBrand();
    double price();
    Colors color();
}
