package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.metadata.Head;

import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelContentProperty
 *
 * @author Diffblue Cover
 */

class ExcelContentPropertyTest {

    @Test
    void factory() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        excelContentProperty.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head = new Head(1, "data", headNameList1, false, false);
        head.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        head.setColumnWidthProperty(columnWidthProperty);
        head.setFieldName("data");
        head.setForceIndex(false);
        head.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head.setHeadNameList(headNameList2);
        excelContentProperty.setHead(head);
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        excelContentProperty.setNumberFormatProperty(numberFormatProperty);
        assertThat(excelContentProperty.getDateTimeFormatProperty(), sameInstance(dateTimeFormatProperty));
        assertThat(excelContentProperty.getField(), is(nullValue()));
        assertThat(excelContentProperty.getHead(), sameInstance(head));
        assertThat(excelContentProperty.getNumberFormatProperty(), sameInstance(numberFormatProperty));
    }
}
