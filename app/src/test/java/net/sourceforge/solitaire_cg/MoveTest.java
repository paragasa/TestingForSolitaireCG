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
        int ret = mover.GetFrom();
        assertEquals(-1, ret);
    }

    @Test
    public void getToBegin() throws Exception {
        int ret = mover.GetToBegin();
        assertEquals(-1, ret);
    }

    @Test
    public void getToEnd() throws Exception {
        int ret = mover.GetToEnd();
        assertEquals(-1, ret);
    }

    @Test
    public void getCount() throws Exception {
        int ret = mover.GetCount();
        assertEquals(0, ret);
    }

    @Test
    public void getFlags() throws Exception {
        int ret = mover.GetFlags();
        assertEquals(0, ret);
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

}