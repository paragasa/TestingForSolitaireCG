package net.sourceforge.solitaire_cg;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paragasa on 5/29/18.
 */
public class MoveTest {
    Move mover= new Move();
    @Test
    public void getFrom() throws Exception {
        mover.mFrom = 3;
        int ret = mover.GetFrom();
        assertEquals(3, ret);
    }
    public void getFrom2() throws Exception {
        mover.mFrom = 2;
        int ret = mover.GetFrom();
        assertEquals(2, ret);
    }

    @Test
    public void getToBegin() throws Exception {

        int ret = mover.GetToBegin();
        assertEquals(-1, ret);
    }
    @Test
    public void getToBegin2() throws Exception {
        mover.mToBegin = 2;
        int ret = mover.GetToBegin();
        assertEquals(2, ret);
    }

    @Test
    public void getToEnd() throws Exception {
        int ret = mover.GetToEnd();
        assertEquals(-1, ret);
    }
    @Test
    public void getToEnd2() throws Exception {
        mover.mToEnd = 3;
        int ret = mover.GetToEnd();
        assertEquals(3, ret);
    }

    @Test
    public void getCount() throws Exception {
        int ret = mover.GetCount();
        assertEquals(0, ret);
    }
    @Test
    public void getCount1() throws Exception {
        mover.mCount = 1;
        int ret = mover.GetCount();
        assertEquals(1, ret);
    }


    @Test
    public void getFlags() throws Exception {
        int ret = mover.GetFlags();
        assertEquals(0, ret);
    }
    @Test
    public void getCount2() throws Exception {
        mover.mCount = 42;
        int ret = mover.GetCount();
        assertEquals(42, ret);
    }

    @Test
    public void getFlags2() throws Exception {
        mover.mFlags = 2;
        int ret = mover.GetFlags();
        assertEquals(2, ret);
    }

    Move moverFlag = new Move(1,1,1,true,true,true);
    @Test
    public void getInvert() throws Exception {
        boolean ret = moverFlag.GetInvert();
        assertNotEquals(0, ret);
    }

    @Test
    public void getUnhide() throws Exception {
        boolean ret = moverFlag.GetUnhide();
        assertNotEquals(0, ret);
    }

    @Test
    public void getAddDealCount() throws Exception {
        boolean ret = moverFlag.GetAddDealCount();
        assertNotEquals(0, ret);
    }
    //
    public void getInvert2() throws Exception {
        mover.mFlags = 3;
        boolean ret = moverFlag.GetInvert();
        assertNotEquals(3, ret);
    }

    @Test
    public void getUnhide2() throws Exception {
        mover.mFlags = 2;
        boolean ret = moverFlag.GetUnhide();
        assertNotEquals(2, ret);
    }

    @Test
    public void getAddDealCount2() throws Exception {
        mover.mFlags = 3;
        boolean ret = moverFlag.GetAddDealCount();
        assertNotEquals(4, ret);
    }

}