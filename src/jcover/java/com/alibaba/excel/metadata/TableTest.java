package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Table
 *
 * @author Diffblue Cover
 */

class TableTest {

    @Test
    void factory() {
        Table table = new Table(0);
        table.setClazz(BaseRowModel.class);
        table.setHead(new ArrayList<List<String>>());
        table.setTableNo(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        table.setTableStyle(tableStyle);
        assertThat((Class<BaseRowModel>) table.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(table.getHead(), empty());
        assertThat(table.getTableNo(), is(1));
        assertThat(table.getTableStyle(), sameInstance(tableStyle));
    }
}
