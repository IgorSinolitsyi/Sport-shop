package products.tShirts;

import products.caps.Caps;
import utils.Colors;

public class TShirtRed extends TShirts {

    @Override
    public double price() {
        return 30.0d;
    }
    @Override
    public String name() {
        return "Bloody man t-shirt";
    }
    @Override
    public Colors color(){
        return Colors.RED;
    }
}
