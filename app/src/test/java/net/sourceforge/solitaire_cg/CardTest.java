package net.sourceforge.solitaire_cg;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void setSize() {
        System.out.println("\nTEST SetSize");
        Card card = new Card(0,0);
        int expectedSmall = 24;
        int expectedHidden = 10;

        System.out.println("Initial Size");
        System.out.println(card.SMALL_SPACING);
        System.out.println(card.HIDDEN_SPACING);

        card.SetSize(2, 10, 560, true);


        System.out.println("New size");
        System.out.println(card.SMALL_SPACING);
        System.out.println(card.HIDDEN_SPACING);

        assertEquals(card.SMALL_SPACING, expectedSmall);
        assertEquals(card.HIDDEN_SPACING, expectedHidden);
    }

    @Test
    public void getX() {
        System.out.println("\nTEST GetX");
        float x;
        float expected = 14.0f;
        float delta = .1f;

        Card card = new Card(11, 0);
        card.SetPosition(14,9);

        x = card.GetX();

        System.out.println(x);
        System.out.println(expected);
        assertEquals(expected, x, delta);

    }

    @Test
    public void getY() {
        System.out.println("\nTEST GetY");
        float y;
        float expected = 9.0f;
        float delta = .1f;

        Card card = new Card(11, 0);
        card.SetPosition(14,9);

        y = card.GetY();

        System.out.println(y);
        System.out.println(expected);
        assertEquals(expected, y, delta);
    }

    @Test
    public void getValue() {
        System.out.println("\nTEST GetValue");
        int val;
        int expected;

        Card card = new Card(11, 0);
        card.SetPosition(14,9);

        expected = card.JACK;
        val = card.GetValue();

        System.out.println(val);
        System.out.println(expected);
        assertEquals(expected, val);
    }

    @Test
    public void getSuit() {
        System.out.println("\nTEST GetSuit");
        int val;
        int expected;

        Card card = new Card(5, 3);

        expected = card.HEARTS;

        val = card.GetSuit();

        System.out.println(val);
        System.out.println(expected);
        assertEquals(expected, val);
    }

    @Test
    public void setPosition() {
        System.out.println("\nTEST SetPosition");
        float xpected = 4.0f;
        float yspected = 5.0f;
        float delta = .1f;

        Card card = new Card(11, 0);
        card.SetPosition(4.0f,5.0f);

        System.out.println(card.GetX());
        System.out.println(card.GetY());

        assertEquals(xpected, card.GetX(), delta);
        assertEquals(yspected, card.GetY(), delta);
    }

    @Test
    public void movePosition() {
        System.out.println("\nTEST MovePosition");
        float xpected = 4.0f;
        float yspected = 5.0f;
        float delta = .1f;

        Card card = new Card(11, 0);
        card.SetPosition(4.0f,5.0f);

        System.out.println("Initial Values");
        System.out.println(card.GetX());
        System.out.println(card.GetY());

        assertEquals(xpected, card.GetX(), delta);
        assertEquals(yspected, card.GetY(), delta);

        float xNew = 2.0f;
        float yNew = 2.0f;

        card.MovePosition(2,3);

        System.out.println("New Values");
        System.out.println(card.GetX());
        System.out.println(card.GetY());

        assertEquals(xNew, card.GetX(), delta);
        assertEquals(yNew, card.GetY(), delta);
    }
}