package products.tShirts;

import products.brands.ActiveSports;
import utils.Colors;

public class TShirtBlue extends TShirts {

    @Override
    public double price() {
        return 50.5d;
    }

    @Override
    public String name() {
        return "Blue Guy t-shirt";
    }
    @Override
    public Colors color(){
        return Colors.BLUE;
    }
}

