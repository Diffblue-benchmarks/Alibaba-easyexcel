package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.AbstractCell
 *
 * @author Diffblue Cover
 */

class AbstractCellTest {

    @Test
    void factory() {
        AbstractCell abstractCell = new AbstractCell();
        abstractCell.setColumnIndex(1);
        abstractCell.setRowIndex(1);
        assertThat(abstractCell.getColumnIndex(), is(1));
        assertThat(abstractCell.getRowIndex(), is(1));
    }
}
