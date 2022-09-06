package no.kristiania.pgr209.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerHandTest {

    @Test
    void shouldScoreHighCard() {
        var pokerHand = new PokerHand(new Card[] {
                new Card(Rank.NUMBER_2, Suit.HEART),
                new Card(Rank.NUMBER_3, Suit.SPADES),
                new Card(Rank.NUMBER_7, Suit.DIAMONDS),
                new Card(Rank.NUMBER_10, Suit.CLUBS),
                new Card(Rank.ACE, Suit.CLUBS),
        });
        assertEquals(pokerHand.getDescription(), "high card: Ace");
    }

    @Test
    void shouldScorePair() {
        var pokerHand = new PokerHand(new Card[] {
                new Card(Rank.NUMBER_2, Suit.HEART),
                new Card(Rank.NUMBER_3, Suit.SPADES),
                new Card(Rank.NUMBER_2, Suit.DIAMONDS),
                new Card(Rank.NUMBER_10, Suit.CLUBS),
                new Card(Rank.ACE, Suit.CLUBS),
        });
        assertEquals(pokerHand.getDescription(), "pair of 2");
    }

}
