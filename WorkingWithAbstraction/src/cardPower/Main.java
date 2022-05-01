package cardPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String powerInput = scanner.nextLine();
        String suitInput = scanner.nextLine();

        Power power = Power.valueOf(powerInput);
        Suit suit = Suit.valueOf(suitInput);

        Card card = new Card(power, suit);
        System.out.println(card);
    }
}
