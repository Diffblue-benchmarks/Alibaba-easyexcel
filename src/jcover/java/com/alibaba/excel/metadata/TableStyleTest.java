package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.TableStyle
 *
 * @author Diffblue JCover
 */

public class TableStyleTest {

    @Test(timeout=10000)
    public void getTableContentBackGroundColorReturnsNull() {
        assertThat(new TableStyle().getTableContentBackGroundColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableContentFontReturnsNull() {
        assertThat(new TableStyle().getTableContentFont(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableHeadBackGroundColorReturnsNull() {
        assertThat(new TableStyle().getTableHeadBackGroundColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableHeadFontReturnsNull() {
        assertThat(new TableStyle().getTableHeadFont(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTableContentBackGroundColorToBLACK1() {
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        assertThat(tableStyle.getTableContentBackGroundColor(), is(IndexedColors.BLACK1));
    }

    @Test(timeout=10000)
    public void setTableContentFont() {
        TableStyle tableStyle = new TableStyle();
        Font tableContentFont = new Font();
        tableStyle.setTableContentFont(tableContentFont);
        assertThat(tableStyle.getTableContentFont(), sameInstance(tableContentFont));
    }

    @Test(timeout=10000)
    public void setTableHeadBackGroundColorToBLACK1() {
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        assertThat(tableStyle.getTableHeadBackGroundColor(), is(IndexedColors.BLACK1));
    }

    @Test(timeout=10000)
    public void setTableHeadFont() {
        TableStyle tableStyle = new TableStyle();
        Font tableHeadFont = new Font();
        tableStyle.setTableHeadFont(tableHeadFont);
        assertThat(tableStyle.getTableHeadFont(), sameInstance(tableHeadFont));
    }
}
