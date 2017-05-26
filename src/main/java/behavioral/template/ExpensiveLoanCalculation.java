package behavioral.template;

public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm {

    @Override
    int calculateDiscount() {
        return 100;
    }

    @Override
    double getInterest() {
        return 5.4;
    }

    @Override
    int getBaseAmount() {
        return 100_000;
    }
}
