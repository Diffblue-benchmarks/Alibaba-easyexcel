package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Sheet
 *
 * @author Diffblue Cover
 */

class SheetTest {

    @Test
    void factory1() {
        Sheet sheet = new Sheet(1, 1);
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        HashMap<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        sheet.setColumnWidthMap(columnWidthMap);
        sheet.setHead(new ArrayList<List<String>>());
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().get(1), is(1));
        assertThat(sheet.getHead(), empty());
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }

    @Test
    void factory2() {
        Sheet sheet = new Sheet(1, 1, BaseRowModel.class);
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        HashMap<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        sheet.setColumnWidthMap(columnWidthMap);
        sheet.setHead(new ArrayList<List<String>>());
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().get(1), is(1));
        assertThat(sheet.getHead(), empty());
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }

    @Test
    void factory3() {
        Sheet sheet = new Sheet(1, 1, BaseRowModel.class, "Acme", new ArrayList<List<String>>());
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        HashMap<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        sheet.setColumnWidthMap(columnWidthMap);
        sheet.setHead(new ArrayList<List<String>>());
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().get(1), is(1));
        assertThat(sheet.getHead(), empty());
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }

    @Test
    void factory4() {
        Sheet sheet = new Sheet(0);
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        HashMap<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        sheet.setColumnWidthMap(columnWidthMap);
        sheet.setHead(new ArrayList<List<String>>());
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().get(1), is(1));
        assertThat(sheet.getHead(), empty());
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }
}
