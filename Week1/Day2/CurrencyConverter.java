package Week1.Day2;

public class CurrencyConverter {
    public static void main(String[] args) {

        double usdValue = 10.00;

        double rupeeValue = usdValue * EXCHANGE_RATE;

        System.out.println(usdValue + "USD is equal to " + rupeeValue + "Rupees ");

    }

    static final double EXCHANGE_RATE = 74.5;
}
