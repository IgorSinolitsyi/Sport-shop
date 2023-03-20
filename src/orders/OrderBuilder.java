package orders;

import products.caps.CapBaseballWhite;
import products.caps.CapTrackerBlack;
import products.tShirts.TShirtBlue;
import products.tShirts.TShirtRed;

public class OrderBuilder {

    public ProductInOrder prepareBLMOrder() {
        ProductInOrder product = new ProductInOrder();
        product.addItem(new CapTrackerBlack());
        product.addItem(new TShirtBlue());
        return product;
    }

    public ProductInOrder prepareWPOrder() {
        ProductInOrder product = new ProductInOrder();
        product.addItem(new CapBaseballWhite());
        product.addItem(new TShirtRed());
        return product;
    }
}
