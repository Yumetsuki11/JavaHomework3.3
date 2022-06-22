public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment;

        System.out.println("Сумма кредита 1 000 000 р.");
        System.out.println("Ставка 9,99%");

        payment = service.calculate(1_000_000, 12, 9.99);
        System.out.println();
        System.out.println("При сроке 1 год");
        System.out.println("ежемесячный платёж " + Math.round(payment) + " р.");

        payment = service.calculate(1_000_000, 24, 9.99);
        System.out.println();
        System.out.println("При сроке 2 года");
        System.out.println("ежемесячный платёж " + Math.round(payment) + " р.");

        payment = service.calculate(1_000_000, 36, 9.99);
        System.out.println();
        System.out.println("При сроке 3 года");
        System.out.println("ежемесячный платёж " + Math.round(payment) + " р.");
    }
}
