package no.kristiania.pgr209.poker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerHand {
    private final Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getDescription() {
        Map<Rank, List<Card>> cardsPerRank = new HashMap<>();

        for (Card card : cards) {
            if (!cardsPerRank.containsKey(card.getRank())) {
                cardsPerRank.put(card.getRank(), new ArrayList<>());
            }
            cardsPerRank.get(card.getRank()).add(card);
        }


        for (Rank rank : cardsPerRank.keySet()) {
            if (cardsPerRank.get(rank).size() == 2) {
                return "pair of " + rank.getDescription();
            }
        }


        Rank maxRank = Rank.NUMBER_2;
        for (Card card : cards) {
            if (card.getRank().compareTo(maxRank) > 0) {
                maxRank = card.getRank();
            }
        }

        return "high card: " + maxRank.getDescription();
    }
}
