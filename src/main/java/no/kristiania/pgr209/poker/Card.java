package no.kristiania.pgr209.poker;

public class Card {
    private final Rank rank;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
