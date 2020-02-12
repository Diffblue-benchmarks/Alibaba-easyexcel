package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.CellRange
 *
 * @author Diffblue JCover
 */

public class CellRangeDiffblueTest {

    @Test(timeout=10000)
    public void getFirstCol() {
        assertThat(new CellRange(0, 1, 1, 1).getFirstCol(), is(1));
        assertThat(new CellRange(1, 1, 0, 1).getFirstCol(), is(0));
    }

    @Test(timeout=10000)
    public void getFirstRow() {
        assertThat(new CellRange(1, 0, 1, 1).getFirstRow(), is(1));
        assertThat(new CellRange(0, 1, 1, 1).getFirstRow(), is(0));
    }

    @Test(timeout=10000)
    public void getLastCol() {
        assertThat(new CellRange(0, 1, 1, 1).getLastCol(), is(1));
        assertThat(new CellRange(1, 1, 1, 0).getLastCol(), is(0));
    }

    @Test(timeout=10000)
    public void getLastRow() {
        assertThat(new CellRange(0, 1, 1, 1).getLastRow(), is(1));
        assertThat(new CellRange(1, 0, 1, 1).getLastRow(), is(0));
    }

    @Test(timeout=10000)
    public void setFirstColToOne() {
        new CellRange(1, 1, 1, 1).setFirstCol(1);
    }

    @Test(timeout=10000)
    public void setFirstRowToOne() {
        new CellRange(1, 1, 1, 1).setFirstRow(1);
    }

    @Test(timeout=10000)
    public void setLastColToOne() {
        new CellRange(1, 1, 1, 1).setLastCol(1);
    }

    @Test(timeout=10000)
    public void setLastRowToOne() {
        new CellRange(1, 1, 1, 1).setLastRow(1);
    }
}
