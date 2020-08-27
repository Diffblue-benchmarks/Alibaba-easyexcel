package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.ConfigurationHolder;
import com.alibaba.excel.metadata.Head;

import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelHeadPropertyTest {

    @Test
    void factory1() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, null, false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x175 = new ExcelContentProperty();
        x175.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x175.setDateTimeFormatProperty(dateTimeFormatProperty1);
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
        x175.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x175.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x175);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x232 = new ExcelContentProperty();
        x232.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x232.setDateTimeFormatProperty(dateTimeFormatProperty3);
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
        x232.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x232.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x232);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x291 = new Head(1, "data", headNameList9, false, false);
        x291.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x291.setColumnWidthProperty(columnWidthProperty1);
        x291.setFieldName("data");
        x291.setForceIndex(false);
        x291.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x291.setHeadNameList(headNameList10);
        headMap.put(1, x291);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x175));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x232));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x291));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void factory2() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, new ArrayList<List<String>>(), false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x175 = new ExcelContentProperty();
        x175.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x175.setDateTimeFormatProperty(dateTimeFormatProperty1);
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
        x175.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x175.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x175);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x232 = new ExcelContentProperty();
        x232.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x232.setDateTimeFormatProperty(dateTimeFormatProperty3);
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
        x232.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x232.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x232);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x291 = new Head(1, "data", headNameList9, false, false);
        x291.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x291.setColumnWidthProperty(columnWidthProperty1);
        x291.setFieldName("data");
        x291.setForceIndex(false);
        x291.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x291.setHeadNameList(headNameList10);
        headMap.put(1, x291);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x175));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x232));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x291));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void factory3() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        head1.add(new ArrayList<String>());
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head1, false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x175 = new ExcelContentProperty();
        x175.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x175.setDateTimeFormatProperty(dateTimeFormatProperty1);
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
        x175.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x175.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x175);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x232 = new ExcelContentProperty();
        x232.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x232.setDateTimeFormatProperty(dateTimeFormatProperty3);
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
        x232.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x232.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x232);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x291 = new Head(1, "data", headNameList9, false, false);
        x291.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x291.setColumnWidthProperty(columnWidthProperty1);
        x291.setFieldName("data");
        x291.setForceIndex(false);
        x291.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x291.setHeadNameList(headNameList10);
        headMap.put(1, x291);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x175));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x232));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x291));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void factory4() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head1.add(list);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head1, false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x175 = new ExcelContentProperty();
        x175.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x175.setDateTimeFormatProperty(dateTimeFormatProperty1);
        Head head2 =
             new Head(1, "data", new ArrayList<String>(), false, false);
        head2.setColumnIndex(1);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head2.setHeadNameList(headNameList2);
        x175.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x175.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x175);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x232 = new ExcelContentProperty();
        x232.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x232.setDateTimeFormatProperty(dateTimeFormatProperty3);
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
        x232.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x232.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x232);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x291 = new Head(1, "data", headNameList9, false, false);
        x291.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x291.setColumnWidthProperty(columnWidthProperty1);
        x291.setFieldName("data");
        x291.setForceIndex(false);
        x291.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x291.setHeadNameList(headNameList10);
        headMap.put(1, x291);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x175));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x232));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x291));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }

    @Test
    void hasHeadReturnsFalse() {
        ConfigurationHolder holder = mock(ConfigurationHolder.class);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head1.add(list);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head1, false);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        assertThat(excelHeadProperty.hasHead(), is(false));
    }
}
