package pokerhands.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HandScorerTest {

    Hand hand;
    HandScorer scorer;

    @BeforeEach
    void setup() {
        hand = new Hand();
        scorer = new HandScorer();
    }

    @Test
    void testHighCard() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.THREE, Suit.CLUBS));
        hand.addCard(new Card(Rank.FIVE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.SIX, Suit.SPADES));
        hand.addCard(new Card(Rank.SEVEN, Suit.HEARTS));

        assertEquals(Score.HIGH_CARD, scorer.score(hand));
    }

    @Test
    void testOnePair() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
        hand.addCard(new Card(Rank.FIVE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.SIX, Suit.SPADES));
        hand.addCard(new Card(Rank.SEVEN, Suit.HEARTS));

        assertEquals(Score.ONE_PAIR, scorer.score(hand));
    }

    @Test
    void testTwoPair() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
        hand.addCard(new Card(Rank.FIVE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.FIVE, Suit.SPADES));
        hand.addCard(new Card(Rank.SEVEN, Suit.HEARTS));

        assertEquals(Score.TWO_PAIR, scorer.score(hand));
    }

    @Test
    void testThreeOfAKind() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
        hand.addCard(new Card(Rank.TWO, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.FIVE, Suit.SPADES));
        hand.addCard(new Card(Rank.SEVEN, Suit.HEARTS));

        assertEquals(Score.THREE_OF_A_KIND, scorer.score(hand));
    }

    @Test
    void testStraight() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.THREE, Suit.CLUBS));
        hand.addCard(new Card(Rank.FOUR, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.FIVE, Suit.SPADES));
        hand.addCard(new Card(Rank.SIX, Suit.HEARTS));

        assertEquals(Score.STRAIGHT, scorer.score(hand));
    }

    @Test
    void testFlush() {
        hand.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand.addCard(new Card(Rank.TEN, Suit.HEARTS));
        hand.addCard(new Card(Rank.FOUR, Suit.HEARTS));
        hand.addCard(new Card(Rank.FIVE, Suit.HEARTS));
        hand.addCard(new Card(Rank.SIX, Suit.HEARTS));

        assertEquals(Score.FLUSH, scorer.score(hand));
    }

    @Test
    void testFullHouse() {
        hand.addCard(new Card(Rank.NINE, Suit.SPADES));
        hand.addCard(new Card(Rank.NINE, Suit.HEARTS));
        hand.addCard(new Card(Rank.NINE, Suit.CLUBS));
        hand.addCard(new Card(Rank.EIGHT, Suit.HEARTS));
        hand.addCard(new Card(Rank.EIGHT, Suit.CLUBS));

        assertEquals(Score.FULL_HOUSE, scorer.score(hand));
    }

    @Test
    void testFourOfAKind() {
        hand.addCard(new Card(Rank.NINE, Suit.SPADES));
        hand.addCard(new Card(Rank.NINE, Suit.HEARTS));
        hand.addCard(new Card(Rank.NINE, Suit.CLUBS));
        hand.addCard(new Card(Rank.NINE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.EIGHT, Suit.CLUBS));

        assertEquals(Score.FOUR_OF_A_KIND, scorer.score(hand));
    }

    @Test
    void testStraightFlush() {
        hand.addCard(new Card(Rank.SIX, Suit.SPADES));
        hand.addCard(new Card(Rank.SEVEN, Suit.SPADES));
        hand.addCard(new Card(Rank.EIGHT, Suit.SPADES));
        hand.addCard(new Card(Rank.NINE, Suit.SPADES));
        hand.addCard(new Card(Rank.TEN, Suit.SPADES));

        assertEquals(Score.STRAIGHT_FLUSH, scorer.score(hand));
    }

    @Test
    void testRoyalFlush() {
        hand.addCard(new Card(Rank.TEN, Suit.SPADES));
        hand.addCard(new Card(Rank.JACK, Suit.SPADES));
        hand.addCard(new Card(Rank.QUEEN, Suit.SPADES));
        hand.addCard(new Card(Rank.KING, Suit.SPADES));
        hand.addCard(new Card(Rank.ACE, Suit.SPADES));

        assertEquals(Score.ROYAL_FLUSH, scorer.score(hand));
    }

}
