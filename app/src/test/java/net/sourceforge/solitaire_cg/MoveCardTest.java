package net.sourceforge.solitaire_cg;
import android.graphics.Canvas;
import android.content.Context;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paragasa on 5/30/18.
 */
public class MoveCardTest {
    MoveCard card = new MoveCard();
    @Test
    public void isValid() throws Exception {
        boolean expected = false;
        boolean actual = card.IsValid();
        assertEquals(expected,actual);
    }

    @Test
    public void getAnchor() throws Exception {
        CardAnchor expected = new CardAnchor();
        card.SetAnchor(expected);
        CardAnchor actual =  new CardAnchor();
        actual = card.GetAnchor();
        assertEquals(actual,expected);
    }

    @Test
    public void setAnchor() throws Exception {
        CardAnchor expected = new CardAnchor();
        card.SetAnchor(expected);
        assertEquals(card.GetAnchor(),expected);
    }
    @Test
    public void getCount() throws Exception {
        int actual= card.GetCount();
        assertEquals(0, actual);
    }
    @Test
    public void addCard() throws Exception {
        MoveCard set = new MoveCard();
        Card cards = new Card(1,1);
        set.AddCard(cards);
        assertEquals(1, set.GetCount());
    }
    @Test
    public void getTopCard() throws Exception {
        MoveCard set = new MoveCard();
        Card expected = new Card(1,1);
        set.AddCard(expected);
        Card actual = set.GetTopCard();
        assertEquals(expected, actual);
    }

    @Test
    public void draw() throws Exception {
        Context contx = null;
        Canvas canvas = new Canvas();
        DrawMaster drawMaster = new DrawMaster(contx, 1,1,1);
        MoveCard set = new MoveCard();
        Card card = new Card(1,1);
        set.AddCard(card);
        set.Draw(drawMaster, canvas);
        //assertEquals(canvas.);

    }

    @Test
    public void release() throws Exception {
        //assert
        MoveCard set = new MoveCard();
        Card card = new Card(2,1);
        Card card2 = new Card(3,0);
        CardAnchor expected = new CardAnchor();
        set.SetAnchor(expected);
        set.AddCard(card);
        set.AddCard(card2);
        //act
        set.Release();
        boolean actualValid = set.IsValid();
        int actualCount = set.GetCount();

        assertEquals(false, actualValid);
        assertEquals(0, actualCount);
    }


    @Test
    public void movePosition() throws Exception {
        MoveCard set = new MoveCard();
        CardAnchor anchor = new CardAnchor();
        set.SetAnchor(anchor);
        Card card = new Card(2,1);
        card.SetPosition(2,2);
        set.AddCard(card);
        set.GetTopCard().SetPosition(2,2);
        set.MovePosition(1,1);
        Card actual = set.GetTopCard();
        Card expected = new Card(1,1);
        expected.SetPosition(1,1);
        assertEquals(expected.GetX(), actual.GetX(),0.01);
        assertEquals(expected.GetY(), actual.GetY(),0.01);
    }

    @Test
    public void dumpCards() throws Exception {
    }

    @Test
    public void dumpCards1() throws Exception {
    }

    @Test
    public void initFromSelectCard() throws Exception {
    }

    @Test
    public void initFromAnchor() throws Exception {
    }

    @Test
    public void hasMoved() throws Exception {
        MoveCard set = new MoveCard();
        CardAnchor anchor = new CardAnchor();
        set.SetAnchor(anchor);
        Card card = new Card(2,1);
        set.AddCard(card);
        set.GetTopCard().SetPosition(5,5);
        Boolean actual = set.HasMoved();
        boolean expected = true;
        assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}