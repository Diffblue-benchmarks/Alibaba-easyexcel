package com.alibaba.excel.write.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.ConfigurationHolder;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;

import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.property.ExcelWriteHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelWriteHeadPropertyTest {

    @Test
    void factory1() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ExcelWriteHeadProperty excelWriteHeadProperty =
             new ExcelWriteHeadProperty(holder, String.class, new ArrayList<List<String>>(), false);
        RowHeightProperty contentRowHeightProperty =
             new RowHeightProperty((short) 1);
        contentRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setContentRowHeightProperty(contentRowHeightProperty);
        RowHeightProperty headRowHeightProperty =
             new RowHeightProperty((short) 1);
        headRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setHeadRowHeightProperty(headRowHeightProperty);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x188 = new ExcelContentProperty();
        x188.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x188.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head2 = new Head(1, "data", headNameList1, false, false);
        head2.setColumnIndex(1);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head2.setHeadNameList(headNameList2);
        x188.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x188.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x188);
        excelWriteHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x245 = new ExcelContentProperty();
        x245.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x245.setDateTimeFormatProperty(dateTimeFormatProperty3);
        ArrayList<String> headNameList5 = new ArrayList<String>();
        headNameList5.add("Smith");
        Head head4 = new Head(1, "data", headNameList5, false, false);
        head4.setColumnIndex(1);
        head4.setFieldName("data");
        head4.setForceIndex(false);
        head4.setForceName(false);
        ArrayList<String> headNameList6 = new ArrayList<String>();
        headNameList6.add("Smith");
        head4.setHeadNameList(headNameList6);
        x245.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x245.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x245);
        excelWriteHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelWriteHeadProperty.setHeadClazz(String.class);
        excelWriteHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x304 = new Head(1, "data", headNameList9, false, false);
        x304.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x304.setColumnWidthProperty(columnWidthProperty1);
        x304.setFieldName("data");
        x304.setForceIndex(false);
        x304.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x304.setHeadNameList(headNameList10);
        headMap.put(1, x304);
        excelWriteHeadProperty.setHeadMap(headMap);
        excelWriteHeadProperty.setHeadRowNumber(1);
        excelWriteHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelWriteHeadProperty.getContentRowHeightProperty(), sameInstance(contentRowHeightProperty));
        assertThat(excelWriteHeadProperty.getHeadRowHeightProperty(), sameInstance(headRowHeightProperty));
        assertThat(excelWriteHeadProperty.getContentPropertyMap().get(1), sameInstance(x188));
        assertThat(excelWriteHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x245));
        assertThat((Class<String>) excelWriteHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelWriteHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelWriteHeadProperty.getHeadMap().get(1), sameInstance(x304));
        assertThat(excelWriteHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelWriteHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void factory2() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        head1.add(new ArrayList<String>());
        ExcelWriteHeadProperty excelWriteHeadProperty =
             new ExcelWriteHeadProperty(holder, String.class, head1, false);
        RowHeightProperty contentRowHeightProperty =
             new RowHeightProperty((short) 1);
        contentRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setContentRowHeightProperty(contentRowHeightProperty);
        RowHeightProperty headRowHeightProperty =
             new RowHeightProperty((short) 1);
        headRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setHeadRowHeightProperty(headRowHeightProperty);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x188 = new ExcelContentProperty();
        x188.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x188.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head2 = new Head(1, "data", headNameList1, false, false);
        head2.setColumnIndex(1);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head2.setHeadNameList(headNameList2);
        x188.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x188.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x188);
        excelWriteHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x245 = new ExcelContentProperty();
        x245.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x245.setDateTimeFormatProperty(dateTimeFormatProperty3);
        ArrayList<String> headNameList5 = new ArrayList<String>();
        headNameList5.add("Smith");
        Head head4 = new Head(1, "data", headNameList5, false, false);
        head4.setColumnIndex(1);
        head4.setFieldName("data");
        head4.setForceIndex(false);
        head4.setForceName(false);
        ArrayList<String> headNameList6 = new ArrayList<String>();
        headNameList6.add("Smith");
        head4.setHeadNameList(headNameList6);
        x245.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x245.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x245);
        excelWriteHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelWriteHeadProperty.setHeadClazz(String.class);
        excelWriteHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x304 = new Head(1, "data", headNameList9, false, false);
        x304.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x304.setColumnWidthProperty(columnWidthProperty1);
        x304.setFieldName("data");
        x304.setForceIndex(false);
        x304.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x304.setHeadNameList(headNameList10);
        headMap.put(1, x304);
        excelWriteHeadProperty.setHeadMap(headMap);
        excelWriteHeadProperty.setHeadRowNumber(1);
        excelWriteHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelWriteHeadProperty.getContentRowHeightProperty(), sameInstance(contentRowHeightProperty));
        assertThat(excelWriteHeadProperty.getHeadRowHeightProperty(), sameInstance(headRowHeightProperty));
        assertThat(excelWriteHeadProperty.getContentPropertyMap().get(1), sameInstance(x188));
        assertThat(excelWriteHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x245));
        assertThat((Class<String>) excelWriteHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelWriteHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelWriteHeadProperty.getHeadMap().get(1), sameInstance(x304));
        assertThat(excelWriteHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelWriteHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void headCellRangeListReturnsEmpty() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        head1.add(new ArrayList<String>());
        ExcelWriteHeadProperty excelWriteHeadProperty =
             new ExcelWriteHeadProperty(holder, String.class, head1, false);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        Head x132 = new Head(1, "data", new ArrayList<String>(), false, false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x132.setHeadNameList(headNameList10);
        headMap.put(1, x132);
        excelWriteHeadProperty.setHeadMap(headMap);
        assertThat(excelWriteHeadProperty.headCellRangeList(), empty());
    }
}
