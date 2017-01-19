package structural.facade;

public class Client {

    public static void main(String[] args) {

        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
        financialSystemFacade.createInvoice(15000);
    }
}
