package Homeworks.Homework5;


public class CalcCostDelivery extends CalcCostBase {

    private final double deliveryPrice;

    public CalcCostDelivery(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}
