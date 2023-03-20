
import orders.OrderBuilder;
import orders.ProductInOrder;

public class StartShopApp {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        ProductInOrder whitePowerOrder = orderBuilder.prepareWPOrder();
        System.out.println("Republicans party order: \n");
        whitePowerOrder.showProducts();
        System.out.println("Total Cost: " + whitePowerOrder.getCost());

        System.out.println("\n*********************************************************************************\n");

        ProductInOrder blackLivesMatter = orderBuilder.prepareBLMOrder();
        System.out.println("Democracy party order: \n");
        blackLivesMatter.showProducts();
        System.out.println("Total Cost: " + blackLivesMatter.getCost());
    }
}
