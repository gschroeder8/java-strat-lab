package discount;

public class SDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}