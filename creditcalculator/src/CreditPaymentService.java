public class CreditPaymentService {
    public double calculate(double sum, double term, double percent) {
        double r = percent / 100 / 12;
        double p = sum * (r * Math.pow((1+r),term)) / (Math.pow((1+r), term) - 1);
        return p;
    }
}
