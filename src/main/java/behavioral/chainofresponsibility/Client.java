package behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {

        PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();
        OffersInfoCheckoutHandler offersInfoCheckoutHandler = new OffersInfoCheckoutHandler();

        customerInfoCheckoutHandler.setNextHandler(offersInfoCheckoutHandler);
        paymentCheckoutHandler.setNextHandler(customerInfoCheckoutHandler);

        paymentCheckoutHandler.handleCheckout();
    }
}
