public class CreditPaymentService {
    public double calculate(int amount, int term, double interestRate) {
        double monInterestRate = interestRate / 12 / 100;
        return amount * (monInterestRate + (monInterestRate / (Math.pow(1 + monInterestRate, term) - 1)));
    }
}
