package com.alibaba.excel.read.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.FontProperty;
import com.alibaba.excel.metadata.property.LoopMergeProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import com.alibaba.excel.metadata.property.StyleProperty;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelReadHeadPropertyTest {

    @Test
    void factory() throws Exception {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head1.add(list);
        ExcelReadHeadProperty excelReadHeadProperty =
             new ExcelReadHeadProperty(holder, String.class, head1, false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x337 = new ExcelContentProperty();
        Converter converter1 = mock(Converter.class);
        x337.setConverter(converter1);
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x337.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head2 = new Head(1, "data", headNameList1, false, false);
        head2.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 =
             mock(ColumnWidthProperty.class);
        head2.setColumnWidthProperty(columnWidthProperty1);
        head2.setContentFontProperty(new FontProperty());
        head2.setContentStyleProperty(new StyleProperty());
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        head2.setHeadFontProperty(new FontProperty());
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head2.setHeadNameList(headNameList2);
        head2.setHeadStyleProperty(new StyleProperty());
        LoopMergeProperty loopMergeProperty1 = mock(LoopMergeProperty.class);
        head2.setLoopMergeProperty(loopMergeProperty1);
        x337.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x337.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x337);
        excelReadHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x404 = new ExcelContentProperty();
        Converter converter3 = mock(Converter.class);
        x404.setConverter(converter3);
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x404.setDateTimeFormatProperty(dateTimeFormatProperty3);
        ArrayList<String> headNameList5 = new ArrayList<String>();
        headNameList5.add("Smith");
        Head head4 = new Head(1, "data", headNameList5, false, false);
        head4.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty3 =
             mock(ColumnWidthProperty.class);
        head4.setColumnWidthProperty(columnWidthProperty3);
        head4.setContentFontProperty(new FontProperty());
        head4.setContentStyleProperty(new StyleProperty());
        head4.setFieldName("data");
        head4.setForceIndex(false);
        head4.setForceName(false);
        head4.setHeadFontProperty(new FontProperty());
        ArrayList<String> headNameList6 = new ArrayList<String>();
        headNameList6.add("Smith");
        head4.setHeadNameList(headNameList6);
        head4.setHeadStyleProperty(new StyleProperty());
        LoopMergeProperty loopMergeProperty3 = mock(LoopMergeProperty.class);
        head4.setLoopMergeProperty(loopMergeProperty3);
        x404.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x404.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("HmacMD5", x404);
        excelReadHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelReadHeadProperty.setHeadClazz(String.class);
        excelReadHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x473 = new Head(1, "data", headNameList9, false, false);
        x473.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty5 = new ColumnWidthProperty(1);
        columnWidthProperty5.setWidth(1);
        x473.setColumnWidthProperty(columnWidthProperty5);
        FontProperty contentFontProperty5 = new FontProperty();
        contentFontProperty5.setBold(false);
        contentFontProperty5.setCharset(1);
        contentFontProperty5.setColor((short) 1);
        contentFontProperty5.setFontHeightInPoints((short) 1);
        contentFontProperty5.setFontName("Acme");
        contentFontProperty5.setItalic(false);
        contentFontProperty5.setStrikeout(false);
        contentFontProperty5.setTypeOffset((short) 1);
        contentFontProperty5.setUnderline((byte) 1);
        x473.setContentFontProperty(contentFontProperty5);
        StyleProperty contentStyleProperty5 = new StyleProperty();
        contentStyleProperty5.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty5.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty5.setBorderRight(BorderStyle.NONE);
        contentStyleProperty5.setBorderTop(BorderStyle.NONE);
        contentStyleProperty5.setBottomBorderColor((short) 1);
        contentStyleProperty5.setDataFormat((short) 1);
        contentStyleProperty5.setFillBackgroundColor((short) 1);
        contentStyleProperty5.setFillForegroundColor((short) 1);
        contentStyleProperty5.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty5.setHidden(false);
        contentStyleProperty5.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty5.setIndent((short) 1);
        contentStyleProperty5.setLeftBorderColor((short) 1);
        contentStyleProperty5.setLocked(false);
        contentStyleProperty5.setQuotePrefix(false);
        contentStyleProperty5.setRightBorderColor((short) 1);
        contentStyleProperty5.setRotation((short) 1);
        contentStyleProperty5.setShrinkToFit(false);
        contentStyleProperty5.setTopBorderColor((short) 1);
        contentStyleProperty5.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty5.setWrapped(false);
        contentStyleProperty5.setWriteFont(new WriteFont());
        x473.setContentStyleProperty(contentStyleProperty5);
        x473.setFieldName("data");
        x473.setForceIndex(false);
        x473.setForceName(false);
        FontProperty headFontProperty5 = new FontProperty();
        headFontProperty5.setBold(false);
        headFontProperty5.setCharset(1);
        headFontProperty5.setColor((short) 1);
        headFontProperty5.setFontHeightInPoints((short) 1);
        headFontProperty5.setFontName("Acme");
        headFontProperty5.setItalic(false);
        headFontProperty5.setStrikeout(false);
        headFontProperty5.setTypeOffset((short) 1);
        headFontProperty5.setUnderline((byte) 1);
        x473.setHeadFontProperty(headFontProperty5);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x473.setHeadNameList(headNameList10);
        StyleProperty headStyleProperty5 = new StyleProperty();
        headStyleProperty5.setBorderBottom(BorderStyle.NONE);
        headStyleProperty5.setBorderLeft(BorderStyle.NONE);
        headStyleProperty5.setBorderRight(BorderStyle.NONE);
        headStyleProperty5.setBorderTop(BorderStyle.NONE);
        headStyleProperty5.setBottomBorderColor((short) 1);
        headStyleProperty5.setDataFormat((short) 1);
        headStyleProperty5.setFillBackgroundColor((short) 1);
        headStyleProperty5.setFillForegroundColor((short) 1);
        headStyleProperty5.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty5.setHidden(false);
        headStyleProperty5.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty5.setIndent((short) 1);
        headStyleProperty5.setLeftBorderColor((short) 1);
        headStyleProperty5.setLocked(false);
        headStyleProperty5.setQuotePrefix(false);
        headStyleProperty5.setRightBorderColor((short) 1);
        headStyleProperty5.setRotation((short) 1);
        headStyleProperty5.setShrinkToFit(false);
        headStyleProperty5.setTopBorderColor((short) 1);
        headStyleProperty5.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty5.setWrapped(false);
        headStyleProperty5.setWriteFont(new WriteFont());
        x473.setHeadStyleProperty(headStyleProperty5);
        LoopMergeProperty loopMergeProperty5 = new LoopMergeProperty(1, 1);
        loopMergeProperty5.setColumnExtend(1);
        loopMergeProperty5.setEachRow(1);
        x473.setLoopMergeProperty(loopMergeProperty5);
        headMap.put(1, x473);
        excelReadHeadProperty.setHeadMap(headMap);
        excelReadHeadProperty.setHeadRowNumber(1);
        excelReadHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelReadHeadProperty.getContentPropertyMap().get(1), sameInstance(x337));
        assertThat(excelReadHeadProperty.getFieldNameContentPropertyMap().get("HmacMD5"), sameInstance(x404));
        assertThat((Class<String>) excelReadHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelReadHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelReadHeadProperty.getHeadMap().get(1), sameInstance(x473));
        assertThat(excelReadHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelReadHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }
}
