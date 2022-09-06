package no.kristiania.pgr209.poker;

public class PokerHand {
    private final Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getDescription() {
        Rank maxRank = Rank.NUMBER_2;
        for (Card card : cards) {
            if (card.getRank().compareTo(maxRank) > 0) {
                maxRank = card.getRank();
            }
        }

        return "high card: " + maxRank.getDescription();
    }
}
