package hotelReservation;

public enum Discount {
    None(0),
    SecondVisit(10),
    VIP(20);

    private final int discountPercent;

    Discount(int percent) {
        this.discountPercent = percent;
    }

    public double getDiscount() {
        return (100 - this.discountPercent) / 100.0;
    }
}
