public class PizzaPayments {
    public static double michaelPays(double cost) {
        double michael;
        if (cost <= 5) {
            michael = cost;
        } else {
            michael = cost * 2 / 3.0;
            if (michael > 20) {
                michael = cost - 10;
            }
        }
        return Math.round(michael * 100.0) / 100.0;
    }
    public static void main(String[] args) {
        double[] costs = {2, 5, 21, 10, 15, 30, 50};
        for (double cost : costs) {
            double michaelPayment = michaelPays(cost);
            System.out.println(michaelPayment);
        }
    }
}