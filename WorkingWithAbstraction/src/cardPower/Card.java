package cardPower;

public class Card {
    private Power power;
    private Suit suit;

    public Card(Power power, Suit suit) {
        this.power = power;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format(
                "Card name: %s of %s; Card power: %d",
                this.power.toString(),
                this.suit.toString(),
                this.calculatePower());
    }

    private int calculatePower() {
        return this.power.getValue() + this.suit.getValue();
    }
}
