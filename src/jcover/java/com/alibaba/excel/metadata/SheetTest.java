package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

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
        sheet.setColumnWidthMap(new HashMap<Integer, Integer>());
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        sheet.setHead(head);
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
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
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().isEmpty(), is(true));
        assertThat(sheet.getHead().size(), is(1));
        assertThat(sheet.getHead().get(0), hasSize(1));
        assertThat(sheet.getHead().get(0).get(0), is("Smith"));
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
        sheet.setColumnWidthMap(new HashMap<Integer, Integer>());
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        sheet.setHead(head);
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
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
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().isEmpty(), is(true));
        assertThat(sheet.getHead().size(), is(1));
        assertThat(sheet.getHead().get(0), hasSize(1));
        assertThat(sheet.getHead().get(0).get(0), is("Smith"));
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }

    @Test
    void factory3() {
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Smith");
        head1.add(list1);
        Sheet sheet = new Sheet(1, 1, BaseRowModel.class, "Acme", head1);
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        sheet.setColumnWidthMap(new HashMap<Integer, Integer>());
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Smith");
        head2.add(list2);
        sheet.setHead(head2);
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
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
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().isEmpty(), is(true));
        assertThat(sheet.getHead().size(), is(1));
        assertThat(sheet.getHead().get(0), hasSize(1));
        assertThat(sheet.getHead().get(0).get(0), is("Smith"));
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }

    @Test
    void factory4() {
        Sheet sheet = new Sheet(1);
        sheet.setAutoWidth(false);
        sheet.setClazz(BaseRowModel.class);
        HashMap<Integer, Integer> columnWidthMap =
             new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        sheet.setColumnWidthMap(columnWidthMap);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        sheet.setHead(head);
        sheet.setHeadLineMun(1);
        sheet.setSheetName("Acme");
        sheet.setSheetNo(1);
        sheet.setStartRow(1);
        TableStyle tableStyle = mock(TableStyle.class);
        sheet.setTableStyle(tableStyle);
        assertThat(sheet.getAutoWidth(), is(false));
        assertThat((Class<BaseRowModel>) sheet.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(sheet.getColumnWidthMap().get(1), is(1));
        assertThat(sheet.getHead().size(), is(1));
        assertThat(sheet.getHead().get(0), hasSize(1));
        assertThat(sheet.getHead().get(0).get(0), is("Smith"));
        assertThat(sheet.getHeadLineMun(), is(1));
        assertThat(sheet.getSheetName(), is("Acme"));
        assertThat(sheet.getSheetNo(), is(1));
        assertThat(sheet.getStartRow(), is(1));
        assertThat(sheet.getTableStyle(), sameInstance(tableStyle));
    }
}
