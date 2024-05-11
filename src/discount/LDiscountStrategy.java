package discount;

public class LDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}