package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.TableStyle
 *
 * @author Diffblue Cover
 */

class TableStyleTest {

    @Test
    void factory() {
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        Font tableContentFont = new Font();
        tableContentFont.setBold(false);
        tableContentFont.setFontHeightInPoints((short) 1);
        tableContentFont.setFontName("Acme");
        tableStyle.setTableContentFont(tableContentFont);
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        Font tableHeadFont = new Font();
        tableHeadFont.setBold(false);
        tableHeadFont.setFontHeightInPoints((short) 1);
        tableHeadFont.setFontName("Acme");
        tableStyle.setTableHeadFont(tableHeadFont);
        assertThat(tableStyle.getTableContentBackGroundColor(), is(IndexedColors.BLACK1));
        assertThat(tableStyle.getTableContentFont(), sameInstance(tableContentFont));
        assertThat(tableStyle.getTableHeadBackGroundColor(), is(IndexedColors.BLACK1));
        assertThat(tableStyle.getTableHeadFont(), sameInstance(tableHeadFont));
    }
}
