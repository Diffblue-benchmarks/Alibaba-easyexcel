package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.HeadKindEnum;
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
    void factory() {
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head1.add(list);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(null, String.class, head1, false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap =
             new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x348 = new ExcelContentProperty();
        x348.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        x348.setDateTimeFormatProperty(dateTimeFormatProperty1);
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
        x348.setHead(head2);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        x348.setNumberFormatProperty(numberFormatProperty1);
        contentPropertyMap.put(1, x348);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap =
             new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x409 = new ExcelContentProperty();
        x409.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty3 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty3.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty3.setUse1904windowing(false);
        x409.setDateTimeFormatProperty(dateTimeFormatProperty3);
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
        x409.setHead(head4);
        NumberFormatProperty numberFormatProperty3 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty3.setFormat("yyyy-MM-dd");
        numberFormatProperty3.setRoundingMode(RoundingMode.UP);
        x409.setNumberFormatProperty(numberFormatProperty3);
        fieldNameContentPropertyMap.put("foo", x409);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        ArrayList<String> headNameList9 = new ArrayList<String>();
        headNameList9.add("Smith");
        Head x472 = new Head(1, "data", headNameList9, false, false);
        x472.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        x472.setColumnWidthProperty(columnWidthProperty1);
        x472.setFieldName("data");
        x472.setForceIndex(false);
        x472.setForceName(false);
        ArrayList<String> headNameList10 = new ArrayList<String>();
        headNameList10.add("Smith");
        x472.setHeadNameList(headNameList10);
        headMap.put(1, x472);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x348));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x409));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x472));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }
}
