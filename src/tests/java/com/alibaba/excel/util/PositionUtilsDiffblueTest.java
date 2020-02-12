package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.PositionUtils
 *
 * @author Diffblue JCover
 */

public class PositionUtilsDiffblueTest {

    @Test(timeout=10000)
    public void getCol() {
        assertThat(PositionUtils.getCol("0"), is(-1));
        assertThat(PositionUtils.getCol("A"), is(0));
        assertThat(PositionUtils.getCol(null), is(-1));
    }

    @Test(timeout=10000)
    public void getRow() {
        assertThat(PositionUtils.getRow(null), is(0));
        assertThat(PositionUtils.getRow("0"), is(-1));
    }

    @Test(timeout=10000)
    public void getRowByRowTagt() {
        assertThat(PositionUtils.getRowByRowTagt("0"), is(-1));
        assertThat(PositionUtils.getRowByRowTagt(null), is(0));
    }
}
