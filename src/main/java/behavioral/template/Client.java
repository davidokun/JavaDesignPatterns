package behavioral.template;

public class Client {

    public static void main(String[] args) {

        LoanCalculationAlgorithm loanCalculation = new ExpensiveLoanCalculation();
        System.out.println("Loan amount : " + loanCalculation.calculateLoan());

        loanCalculation = new CheapLoanCalculation();
        System.out.println("Loan amount : " + loanCalculation.calculateLoan());


    }
}
