package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.CellExtraTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.CellExtra
 *
 * @author Diffblue Cover
 */

class CellExtraTest {

    @Test
    void factory() {
        CellExtra cellExtra = new CellExtra(CellExtraTypeEnum.COMMENT, "hello", 1, 1);
        cellExtra.setFirstColumnIndex(1);
        cellExtra.setFirstRowIndex(1);
        cellExtra.setLastColumnIndex(1);
        cellExtra.setLastRowIndex(1);
        cellExtra.setText("hello");
        cellExtra.setType(CellExtraTypeEnum.COMMENT);
        cellExtra.setColumnIndex(1);
        cellExtra.setRowIndex(1);
        assertThat(cellExtra.getFirstColumnIndex(), is(1));
        assertThat(cellExtra.getFirstRowIndex(), is(1));
        assertThat(cellExtra.getLastColumnIndex(), is(1));
        assertThat(cellExtra.getLastRowIndex(), is(1));
        assertThat(cellExtra.getText(), is("hello"));
        assertThat(cellExtra.getType(), is(CellExtraTypeEnum.COMMENT));
        assertThat(cellExtra.getColumnIndex(), is(1));
        assertThat(cellExtra.getRowIndex(), is(1));
    }
}
