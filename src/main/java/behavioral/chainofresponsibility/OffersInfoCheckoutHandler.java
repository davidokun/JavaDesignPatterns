package behavioral.chainofresponsibility;

public class OffersInfoCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Managing offers at checkout");

        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
}
