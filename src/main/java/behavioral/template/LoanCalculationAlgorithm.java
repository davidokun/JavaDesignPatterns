package behavioral.template;

public abstract class LoanCalculationAlgorithm {

    public int calculateLoan() {
        return (int) (getBaseAmount() * getInterest() - calculateDiscount());
    }

    abstract int calculateDiscount();

    abstract double getInterest();

    abstract int getBaseAmount();
}
