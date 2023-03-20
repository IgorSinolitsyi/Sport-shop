package products.caps;

import utils.Colors;

public class CapTrackerBlack extends Caps {

    @Override
    public double price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Black Tracker cap";
    }
    @Override
    public Colors color(){
        return Colors.BLACK;
    }


}
