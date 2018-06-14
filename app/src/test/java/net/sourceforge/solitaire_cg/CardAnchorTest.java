package net.sourceforge.solitaire_cg;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by paragasa on 6/11/18.
 */
public class CardAnchorTest {
    CardAnchor anchor= new CardAnchor();
    @Test
    public void createAnchor() throws Exception {
        //arrange
        Rules rule= new RulesFreecell();
        CardAnchor expected= new CardAnchor();
        expected.SetRules(rule);
        expected.SetNumber(2);

                //act
        CardAnchor actual= expected.CreateAnchor(3, 2, rule);
        //assert
        assertEquals(expected.mRules, actual.mRules);
        assertEquals(expected.mNumber, actual.mNumber);
    }

    @Test
    public void getCards() throws Exception {
        //arrange
        Card card = new Card(1,1);
        anchor.mCard[0] = card;
        Card[] expected = new Card[104];
        expected[0] = card;
        //act
        Card[] actual= anchor.GetCards();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getCount() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mCardCount = 2;
        //act
        int actual = card2.GetCount();
        //assert
        assertEquals(2,actual);
    }

    @Test
    public void getHiddenCount() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mHiddenCount = 53;
        //act
        int actual = card2.GetHiddenCount();
        //assert
        assertEquals(53,actual);
    }

    @Test
    public void getLeftEdge() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mLeftEdge = 1;
        //act

        float actual = card2.GetLeftEdge();
        assertEquals((float)1,actual,0.002);
    }

    @Test
    public void getNumber() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mNumber = 10;
        //act
        int actual = card2.GetNumber();
        //assert
        assertEquals(10,actual);
    }


    @Test
    public void getRightEdge() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mRightEdge = 3;
        //act
        float actual = card2.GetRightEdge();
        //assert
        assertEquals((float)3,actual, 0.002);
    }

    @Test
    public void getVisibleCount() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mCardCount= 10;
        card2.mHiddenCount = 8;
        //act
        int actual = card2.GetVisibleCount();
        //assert
        assertEquals(2,actual);
    }

    @Test
    public void getMovableCount() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mCardCount = 2;
        //act
        int actual = card2.GetMovableCount();
        //assert
        assertEquals(1,actual);
    }

    @Test
    public void getX() throws Exception {
        //arrange
        CardAnchor card2= new CardAnchor();
        card2.mX = 3;
        //act
        float actual = card2.GetX();
        //assert
        assertEquals((float)3,actual,0.002);
    }

    @Test
    public void getNewY() throws Exception {
        anchor.mCardCount = 0;
        anchor.mY = 2;
        float actual = anchor.GetNewY();
        assertEquals((float)2,actual,0.002);
    }
    @Test
    public void getX2() throws Exception {
        //arrange
        anchor.mCardCount = 0;
        anchor.mX = 0;
        //act
        float actual = anchor.GetX();
        //assert
        assertEquals((float)0,actual,0.002);
    }

    @Test
    public void getNewY2() throws Exception {
        anchor.mCardCount = 0;
        anchor.mY = 0;
        float actual = anchor.GetNewY();
        assertEquals((float)0,actual,0.002);
    }

    @Test
    public void isDone() throws Exception {
        anchor.mDone = true;
        boolean actual = anchor.IsDone();
        assertEquals(true, actual);
    }
    @Test
    public void isDoneFail() throws Exception {
        anchor.mDone = false;
        boolean actual = anchor.IsDone();
        assertEquals(false, actual);
    }

    @Test
    public void setBottom() throws Exception {
        anchor.SetBottom(2);
        float actual  = anchor.mBottom;
        assertEquals((float)2,actual,0.002);
    }

    @Test
    public void setHiddenCount() throws Exception {
        anchor.SetHiddenCount(10);
        int actual  = anchor.mHiddenCount;
        assertEquals(10,actual);
    }

    @Test
    public void setLeftEdge() throws Exception {
        anchor.SetLeftEdge(2);
        float actual  = anchor.mLeftEdge;
        assertEquals((float)2,actual,0.002);
    }

//    @Test
//    public void setMaxHeight() throws Exception {
//        anchor.m = 2;
//        int actual  = anchor.mBottom;
//        assertEquals((float)2,actual,0.002);
//    }

    @Test
    public void setNumber() throws Exception {
        anchor.SetNumber(10);
        int actual  = anchor.mNumber;
        assertEquals(10,actual);
    }

    @Test
    public void setRightEdge() throws Exception {
        anchor.SetRightEdge(2);
        float actual  = anchor.mRightEdge;
        assertEquals((float)2,actual,0.002);
    }

    @Test
    public void setRules() throws Exception {
        Rules rule= new RulesFreecell();
        anchor.SetRules(rule);
        Rules actual = anchor.mRules;
        assertEquals(rule, actual);
    }
//
//    @Test
//    public void setShowing() throws Exception {
//
//    }


//    @Test
//    public void setCardPosition() throws Exception {
//        anchor.mX =2;
//        anchor.mY = 3;
//        anchor.SetCardPosition(0);
//        float actualX = anchor.mX;
//        float actualY = anchor.mY;
//        assertEquals((float)2, actualX, 0.002);
//        assertEquals((float)3, actualY, 0.002);
//    }

    @Test
    public void setDone() throws Exception {
        anchor.SetDone(false);
        boolean actual = anchor.mDone;
        assertEquals(false, actual);
    }

    @Test
    public void setStartSeq() throws Exception {
        anchor.SetStartSeq(3);
        int actual = anchor.mSTARTSEQ;
        assertEquals(3,actual);
    }

    @Test
    public void setSeq() throws Exception {
        anchor.SetSeq(3);
        int actual = anchor.mBUILDSEQ;
        int actual2 = anchor.mMOVESEQ;
        assertEquals(3,actual);
        assertEquals(3,actual2);
    }

    @Test
    public void setBuildSeq() throws Exception {
        anchor.SetBuildSeq(1);
        int actual = anchor.mBUILDSEQ;
        assertEquals(1,actual);

    }


    @Test
    public void setMoveSeq() throws Exception {
        anchor.SetMoveSeq(3);
        int actual = anchor.mMOVESEQ;
        assertEquals(3,actual);
    }

    @Test
    public void setWrap() throws Exception {
        anchor.SetWrap(true);
        boolean actual = anchor.mBUILDWRAP;
        boolean actual2 = anchor.mMOVEWRAP;
        assertEquals(true, actual);
        assertEquals(true, actual2);
    }

    @Test
    public void setMoveWrap() throws Exception {
        anchor.SetMoveWrap(false);

        boolean actual2 = anchor.mMOVEWRAP;

        assertEquals(false, actual2);
    }

    @Test
    public void setBuildWrap() throws Exception {
        anchor.SetBuildWrap(true);
        boolean actual = anchor.mBUILDWRAP;

        assertEquals(true, actual);

    }

    @Test
    public void setSuit() throws Exception {
        anchor.SetSuit(3);
        int actual = anchor.mBUILDSUIT;
        int actual2 = anchor.mMOVESUIT;
        assertEquals(3, actual);
        assertEquals(3, actual2);
    }

    @Test
    public void setBuildSuit() throws Exception {
        anchor.SetBuildSuit(3);
        int actual = anchor.mBUILDSUIT;

        assertEquals(3, actual);

    }

    @Test
    public void setMoveSuit() throws Exception {
        anchor.SetMoveSuit(3);

        int actual2 = anchor.mMOVESUIT;
        assertEquals(3, actual2);

    }

    @Test
    public void setBehavior() throws Exception {
        anchor.SetBehavior(8);
        int actual = anchor.mDROPOFF;
        int actual2 = anchor.mPICKUP;
        assertEquals(8, actual);
        assertEquals(8, actual2);
    }

    @Test
    public void setDropoff() throws Exception {
        anchor.SetBehavior(8);
        int actual = anchor.mDROPOFF;

        assertEquals(8, actual);

    }

    @Test
    public void setPickup() throws Exception {
        anchor.SetBehavior(8);

        int actual2 = anchor.mPICKUP;

        assertEquals(8, actual2);
    }

    @Test
    public void setDisplay() throws Exception {
        anchor.SetDisplay(4);
        int actual = anchor.mDISPLAY;
        assertEquals(4, actual);

    }


    @Test
    public void setHack() throws Exception {
        anchor.SetHack(4);
        int actual = anchor.mHACK;
        assertEquals(4, actual);
    }

    @Test
    public void setPosition() throws Exception {
        anchor.SetPosition(2,2);
        float actual = anchor.GetX();
        float actualY = anchor.mY;
        assertEquals(2, actual, 0.002);
        assertEquals(2, actualY, 0.002);
    }

    @Test
    public void addCard() throws Exception {
        Card card= new Card(2,2);
        anchor.AddCard(card);
        Card actual = anchor.mCard[0];
        assertEquals(card,actual);
    }

//    @Test
//    public void addMoveCard() throws Exception {
//        MoveCard mover = new MoveCard();
//
//    }

    @Test
    public void dropSingleCard() throws Exception {
        Card card = new Card(2,2);
        boolean actual = anchor.DropSingleCard(card);
        assertEquals(false, actual);
    }

    @Test
    public void canDropCard() throws Exception {
        MoveCard card = new MoveCard();
        boolean actual = anchor.CanDropCard(card, 1);
        assertEquals(false, actual);
    }

    @Test
    public void getCardStack() throws Exception {
    }

    @Test
    public void grabCard() throws Exception {
        assertEquals(null,anchor.GrabCard(1,1));
    }

    @Test
    public void popCard() throws Exception {
        Card card = new Card(2,2);
        anchor.AddCard(card);
        Card actual = anchor.PopCard();
        assertEquals(card, actual);
    }

    @Test
    public void tapCard() throws Exception {
        boolean actual = anchor.TapCard(2,2);
        assertEquals(false, actual);
    }

    @Test
    public void unhideTopCard() throws Exception {
        anchor.mCardCount = 2;
        boolean actual = anchor.UnhideTopCard();
        assertEquals(false, actual);
    }

    @Test
    public void expandStack() throws Exception {
        boolean actual = anchor.ExpandStack(1,1);
        assertEquals(false, actual);
    }

    @Test
    public void canMoveStack() throws Exception {
        boolean actual = anchor.CanMoveStack(2,2);
        assertEquals(false, actual);
    }

    @Test
    public void isOverCard() throws Exception {
        boolean actual = anchor.IsOverCard(2,2);
        assertEquals(false, actual);
    }

    @Test
    public void isOverCard1() throws Exception {
        boolean actual = anchor.IsOverCard(2,2, 1);
        assertEquals(false, actual);
    }

    @Test
    public void isOverDeck() throws Exception {
        boolean actual = anchor.IsOverDeck(1,1);
        assertEquals(true, actual);
    }
    @Test
    public void isOverDeck2() throws Exception {
        boolean actual = anchor.IsOverDeck(0,0);
        assertEquals(false, actual);
    }

    @Test
    public void draw() throws Exception {
    }

}