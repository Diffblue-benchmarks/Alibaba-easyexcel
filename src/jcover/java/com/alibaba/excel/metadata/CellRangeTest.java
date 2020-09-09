package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.CellRange
 *
 * @author Diffblue Cover
 */

class CellRangeTest {

    @Test
    void factory() {
        CellRange cellRange = new CellRange(-1, 0, 1, 1);
        cellRange.setFirstCol(1);
        cellRange.setFirstRow(1);
        cellRange.setLastCol(1);
        cellRange.setLastRow(1);
        assertThat(cellRange.getFirstCol(), is(1));
        assertThat(cellRange.getFirstRow(), is(1));
        assertThat(cellRange.getLastCol(), is(1));
        assertThat(cellRange.getLastRow(), is(1));
    }
}
