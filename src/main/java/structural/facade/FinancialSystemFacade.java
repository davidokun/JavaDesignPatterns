package structural.facade;

public class FinancialSystemFacade {

    private BillingSystem billingSystem;
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public FinancialSystemFacade() {
        this.billingSystem = new BillingSystem();
        this.invoiceCustomerSystem = new InvoiceCustomerSystem();
    }

    public void createInvoice(int amount) {

        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }
}
