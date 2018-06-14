package net.sourceforge.solitaire_cg;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by DarshLin on 6/14/18.
 */

public class SelectCardTest {

    CardAnchor anchor= new CardAnchor();

    @Test
    public void clear() {
        Card card = new Card(5,2);
        SelectCard selectCard = new SelectCard();
        selectCard.mCard[0] = card;

        System.out.println(selectCard.mCard[0].GetValue());
        Card expected = null;
        selectCard.Clear();

        assertSame(expected, selectCard.mCard[0]);

    }

    @Test
    public void isValid() {
        SelectCard select = new SelectCard();
        boolean expected = false;

        assertSame(expected, select.mValid);

    }


        //integration
    @Test
    public void getAnchor() {
        SelectCard selectCard = new SelectCard();
        Card card = new Card(5,2);
        anchor.mCard[0] = card;
        Card[] expected = new Card[104];
        expected[0] = card;

        selectCard.mCardAnchor = anchor;

        int actualValue = selectCard.GetAnchor().mCard[0].GetValue();
        int actualSuit = selectCard.GetAnchor().mCard[0].GetSuit();

        assertEquals(expected[0].GetValue(), actualValue);
        assertEquals(expected[0].GetSuit(), actualSuit);




    }

    @Test
    public void getCount() {
        SelectCard selectCard = new SelectCard();
        int expected = 6;

        selectCard.mCardCount = 6;

        assertEquals(expected, selectCard.mCardCount);
    }

    //Integration
    @Test
    public void draw() {
        SelectCard selectCard = new SelectCard();

        //dependencies
        DrawMaster drawMaster = new DrawMaster(null, 50,90, 196);
        Canvas canvas = new Canvas();

        selectCard.Draw(drawMaster, canvas);

    }

//    @Test
//    public void initFromAnchor() {
//        SelectCard selectCard = new SelectCard();
//        Card card = new Card(5,2);
//        Card card1 = new Card(6,2);
//        Card card2 = new Card(11,1);
//        Card card3 = new Card(3,4);
//        Card card4 = new Card(9,3);
//        CardAnchor anchor2 = new CardAnchor();
//
//        anchor2.mLeftEdge = 4;
//        anchor2.mRightEdge = 6;
//        anchor2.AddCard(card);
//        anchor2.AddCard(card1);
//        anchor2.AddCard(card2);
//        //anchor2.AddCard(card3);
//        //anchor2.AddCard(card4);
//
//        selectCard.mCard[0] = card4;
//        selectCard.mCard[1] = card3;
//        selectCard.mCard[2] = card2;
//        //selectCard.mCard[3] = card1;
//        //selectCard.mCard[4] = card;
//        selectCard.mCardCount = 52;
//        selectCard.mLeftEdge = 1;
//        selectCard.mRightEdge = 1;
//
//        selectCard.InitFromAnchor(anchor2);
//        System.out.println(selectCard.mCard[4].GetValue());
//
//        boolean expected = true;
//        boolean actual = selectCard.IsValid();

    }

    @Test
    public void tap() {
        SelectCard selectCard = new SelectCard();
        Card card = new Card(6,3);
        Card card1 = new Card(4,1);

        selectCard.mCard[0] = card;
        selectCard.mCard[1] = card1;

        selectCard.Tap(4,4);
    }

    @Test
    public void release() {

    }

    @Test
    public void dumpCards() {
    }

    @Test
    public void scroll() {
    }

    @Test
    public void isOnCard() {
    }
}