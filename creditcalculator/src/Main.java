public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthpay1 = service.calculate(1_000_000, 12, 9.99);
        System.out.printf("Платеж на 1 год: %.0f; ", monthpay1);
        double monthpay2 = service.calculate(1_000_000, 24, 9.99);
        System.out.printf("Платеж на 2 года: %.0f; ", monthpay2);
        double monthpay3 = service.calculate(1_000_000, 36, 9.99);
        System.out.printf("Платеж на 3 года: %.0f; ", monthpay3);
    }
}
