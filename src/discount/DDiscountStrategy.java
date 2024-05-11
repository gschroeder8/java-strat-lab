package discount;

public class DDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}