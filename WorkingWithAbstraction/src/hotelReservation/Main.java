package hotelReservation;

import java.util.Scanner;

enum Season {
    Spring(2),
    Summer(4),
    Autumn(1),
    Winter(3);

    private final int priceMultiplier;

    Season(int index) {
        this.priceMultiplier = index;
    }

    public int getPriceMultiplier() {
        return this.priceMultiplier;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerDay = scanner.nextDouble();
        int numOfDays = scanner.nextInt();
        String seasonName = scanner.next();
        String discountType = scanner.next();

        Season season = Season.valueOf(seasonName);
        Discount discount = Discount.valueOf(discountType);

        System.out.printf("%.2f", getPriceFor(pricePerDay, numOfDays, season, discount));
    }

    private static double getPriceFor(double pricePerDay, int numOfDays, Season season, Discount discount) {
        return pricePerDay * season.getPriceMultiplier() * numOfDays * discount.getDiscount();
    }
}
