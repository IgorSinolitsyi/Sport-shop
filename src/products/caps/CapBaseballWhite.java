package products.caps;

import utils.Colors;

public class CapBaseballWhite extends Caps {

    @Override
    public double price() {
        return 25.0d;
    }

    @Override
    public String name() {
        return "White Power baseball cap";
    }
    @Override
    public Colors color(){
        return Colors.WHITE;
    }
}
