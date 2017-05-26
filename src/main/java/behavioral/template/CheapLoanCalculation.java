package behavioral.template;

public class CheapLoanCalculation extends LoanCalculationAlgorithm {

    @Override
    int calculateDiscount() {
        return 5_000;
    }

    @Override
    double getInterest() {
        return 3.2;
    }

    @Override
    int getBaseAmount() {
        return 100_000;
    }
}
