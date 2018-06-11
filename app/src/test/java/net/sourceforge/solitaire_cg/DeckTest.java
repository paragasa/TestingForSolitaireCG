package net.sourceforge.solitaire_cg;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void pushCard() {
        Card card = new Card(5,1);
        Deck deck = new Deck(1,4);

        int expected = deck.mCardCount;
        //System.out.println(deck.mCardCount);
        deck.PopCard();
        deck.PushCard(card);
        int count = deck.mCardCount;
        System.out.println(count);

        assertEquals(expected, count);

    }

    @Test
    public void popCard() {
        Card card = new Card(4, 3);
        Deck deck = new Deck(1,4);

        int expected = deck.mCardCount-1;
        deck.PopCard();
        int count = deck.mCardCount;
        System.out.println("Expected output: " + expected);

        assertEquals(expected, count);
    }

    @Test
    public void empty() {
        Deck deck = new Deck(0,0);
        boolean expected = true;
        boolean answer = deck.Empty();
        assertEquals(expected, answer);
    }

    @Test
    public void shuffle() {
        Deck deck = new Deck(1,4);
        Card card = new Card(0,0);
        card = deck.mCard[0];

        int unexpected[][] = new int[2][2];
        unexpected[0][0] = card.GetValue();
        unexpected[0][1] = card.GetSuit();
        unexpected[1][0] = card.GetValue();
        unexpected[1][1] = card.GetSuit();

        deck.Shuffle();

        card = deck.mCard[0];
        int actual[][] = new int[2][2];
        actual[0][0] = card.GetValue();
        actual[0][1] = card.GetSuit();
        actual[1][0] = card.GetValue();
        actual[1][1] = card.GetSuit();

        assertNotSame(unexpected, actual);
    }
}