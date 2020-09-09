package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.PositionUtils
 *
 * @author Diffblue Cover
 */

class PositionUtilsTest {

    @Test
    void getRowByRowTagt() {
        assertThat(PositionUtils.getRowByRowTagt(null, -1), is(0));
        assertThat(PositionUtils.getRowByRowTagt(null, null), is(0));
        assertThat(PositionUtils.getRowByRowTagt("0", 1), is(-1));
        assertThat(PositionUtils.getRowByRowTagt(null, 0), is(1));
        assertThat(PositionUtils.getRowByRowTagt("0"), is(-1));
        assertThat(PositionUtils.getRowByRowTagt(null), is(0));
    }

    @Test
    void getRow() {
        assertThat(PositionUtils.getRow(null), is(0));
        assertThat(PositionUtils.getRow("0"), is(-1));
    }

    @Test
    void getCol() {
        assertThat(PositionUtils.getCol(null, null), is(0));
        assertThat(PositionUtils.getCol("A", 1), is(0));
        assertThat(PositionUtils.getCol("EUR", 1), is(3943));
        assertThat(PositionUtils.getCol(null, 0), is(1));
        assertThat(PositionUtils.getCol("A"), is(0));
        assertThat(PositionUtils.getCol("EUR"), is(3943));
        assertThat(PositionUtils.getCol(null), is(-1));
    }
}
