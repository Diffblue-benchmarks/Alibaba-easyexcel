package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Sheet
 *
 * @author Diffblue JCover
 */

public class SheetDiffblueTest {

    @Test(timeout=10000)
    public void getAutoWidthReturnsFalse() {
        assertThat(new Sheet(1).getAutoWidth(), is(false));
    }

    @Test(timeout=10000)
    public void getClazzReturnsNull() {
        assertThat(new Sheet(1).getClazz(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getColumnWidthMapReturnsEmpty() {
        Sheet sheet = new Sheet(1);
        Map<Integer, Integer> result = sheet.getColumnWidthMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(sheet.getColumnWidthMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getHeadLineMun() {
        assertThat(new Sheet(1, 1).getHeadLineMun(), is(1));
        assertThat(new Sheet(1).getHeadLineMun(), is(0));
    }

    @Test(timeout=10000)
    public void getHeadReturnsNull() {
        assertThat(new Sheet(1).getHead(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSheetNameReturnsNull() {
        assertThat(new Sheet(1).getSheetName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSheetNo() {
        assertThat(new Sheet(1).getSheetNo(), is(1));
        assertThat(new Sheet(0).getSheetNo(), is(0));
    }

    @Test(timeout=10000)
    public void getStartRow() {
        assertThat(new Sheet(1).getStartRow(), is(0));
        assertThat(new Sheet(0, 1).getStartRow(), is(0));
        assertThat(new Sheet(0, 1, BaseRowModel.class).getStartRow(), is(0));
        assertThat(new Sheet(0, 1, BaseRowModel.class, "bar", new ArrayList<java.util.List<String>>()).getStartRow(), is(0));
    }

    @Test(timeout=10000)
    public void getTableStyleReturnsNull() {
        assertThat(new Sheet(1).getTableStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAutoWidthToFalse() {
        new Sheet(1).setAutoWidth(false);
    }

    @Test(timeout=10000)
    public void setClazz1() {
        Sheet sheet = new Sheet(1);
        sheet.setClazz(BaseRowModel.class);
        assertThat((Class<BaseRowModel>)sheet.getClazz(), equalTo((Class)BaseRowModel.class));
        assertThat(sheet.getHeadLineMun(), is(1));
    }

    @Test(timeout=10000)
    public void setClazz2() {
        Sheet sheet = new Sheet(1, 1);
        sheet.setClazz(BaseRowModel.class);
        assertThat((Class<BaseRowModel>)sheet.getClazz(), equalTo((Class)BaseRowModel.class));
    }

    @Test(timeout=10000)
    public void setColumnWidthMapToEmpty() {
        Sheet sheet = new Sheet(1);
        Map<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        sheet.setColumnWidthMap(columnWidthMap);
        assertThat(sheet.getColumnWidthMap(), sameInstance(columnWidthMap));
    }

    @Test(timeout=10000)
    public void setHeadLineMunToOne() {
        Sheet sheet = new Sheet(1);
        sheet.setHeadLineMun(1);
        assertThat(sheet.getHeadLineMun(), is(1));
    }

    @Test(timeout=10000)
    public void setHeadToEmpty() {
        Sheet sheet = new Sheet(1);
        List<List<String>> head2 = new ArrayList<List<String>>();
        sheet.setHead(head2);
        assertThat(sheet.getHead(), sameInstance(head2));
    }

    @Test(timeout=10000)
    public void setSheetName() {
        Sheet sheet = new Sheet(1);
        sheet.setSheetName("/bin/bash");
        assertThat(sheet.getSheetName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setSheetNoToOne() {
        new Sheet(1).setSheetNo(1);
    }

    @Test(timeout=10000)
    public void setStartRowToOne() {
        Sheet sheet = new Sheet(1);
        sheet.setStartRow(1);
        assertThat(sheet.getStartRow(), is(1));
    }

    @Test(timeout=10000)
    public void setTableStyle() {
        Sheet sheet = new Sheet(1);
        TableStyle tableStyle = new TableStyle();
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }
}
