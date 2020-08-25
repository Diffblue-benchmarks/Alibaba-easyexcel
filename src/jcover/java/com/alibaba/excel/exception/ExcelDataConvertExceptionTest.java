package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelDataConvertException
 *
 * @author Diffblue Cover
 */

class ExcelDataConvertExceptionTest {

    @Test
    void factory1() {
        ExcelContentProperty excelContentProperty1 =
             new ExcelContentProperty();
        excelContentProperty1.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        excelContentProperty1.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head1 = new Head(1, "data", headNameList1, false, false);
        head1.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        head1.setColumnWidthProperty(columnWidthProperty1);
        head1.setFieldName("data");
        head1.setForceIndex(false);
        head1.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head1.setHeadNameList(headNameList2);
        excelContentProperty1.setHead(head1);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        excelContentProperty1.setNumberFormatProperty(numberFormatProperty1);
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(1, 1, excelContentProperty1, "an error has happened");
        excelDataConvertException.setColumnIndex(1);
        ExcelContentProperty excelContentProperty2 =
             new ExcelContentProperty();
        excelContentProperty2.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty2 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty2.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty2.setUse1904windowing(false);
        excelContentProperty2.setDateTimeFormatProperty(dateTimeFormatProperty2);
        ArrayList<String> headNameList3 = new ArrayList<String>();
        headNameList3.add("Smith");
        Head head2 = new Head(1, "data", headNameList3, false, false);
        head2.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty2 = new ColumnWidthProperty(1);
        columnWidthProperty2.setWidth(1);
        head2.setColumnWidthProperty(columnWidthProperty2);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        ArrayList<String> headNameList4 = new ArrayList<String>();
        headNameList4.add("Smith");
        head2.setHeadNameList(headNameList4);
        excelContentProperty2.setHead(head2);
        NumberFormatProperty numberFormatProperty2 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty2.setFormat("yyyy-MM-dd");
        numberFormatProperty2.setRoundingMode(RoundingMode.UP);
        excelContentProperty2.setNumberFormatProperty(numberFormatProperty2);
        excelDataConvertException.setExcelContentProperty(excelContentProperty2);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty2));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        ExcelContentProperty excelContentProperty1 =
             new ExcelContentProperty();
        excelContentProperty1.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        excelContentProperty1.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head1 = new Head(1, "data", headNameList1, false, false);
        head1.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        head1.setColumnWidthProperty(columnWidthProperty1);
        head1.setFieldName("data");
        head1.setForceIndex(false);
        head1.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head1.setHeadNameList(headNameList2);
        excelContentProperty1.setHead(head1);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        excelContentProperty1.setNumberFormatProperty(numberFormatProperty1);
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(1, 1, excelContentProperty1, "an error has happened", cause);
        excelDataConvertException.setColumnIndex(1);
        ExcelContentProperty excelContentProperty2 =
             new ExcelContentProperty();
        excelContentProperty2.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty2 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty2.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty2.setUse1904windowing(false);
        excelContentProperty2.setDateTimeFormatProperty(dateTimeFormatProperty2);
        ArrayList<String> headNameList3 = new ArrayList<String>();
        headNameList3.add("Smith");
        Head head2 = new Head(1, "data", headNameList3, false, false);
        head2.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty2 = new ColumnWidthProperty(1);
        columnWidthProperty2.setWidth(1);
        head2.setColumnWidthProperty(columnWidthProperty2);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        ArrayList<String> headNameList4 = new ArrayList<String>();
        headNameList4.add("Smith");
        head2.setHeadNameList(headNameList4);
        excelContentProperty2.setHead(head2);
        NumberFormatProperty numberFormatProperty2 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty2.setFormat("yyyy-MM-dd");
        numberFormatProperty2.setRoundingMode(RoundingMode.UP);
        excelContentProperty2.setNumberFormatProperty(numberFormatProperty2);
        excelDataConvertException.setExcelContentProperty(excelContentProperty2);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty2));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause().getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getCause().getMessage(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory3() {
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException("an error has happened");
        excelDataConvertException.setColumnIndex(1);
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
        excelDataConvertException.setExcelContentProperty(excelContentProperty);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory4() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException("an error has happened", cause);
        excelDataConvertException.setColumnIndex(1);
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
        excelDataConvertException.setExcelContentProperty(excelContentProperty);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause().getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getCause().getMessage(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory5() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(cause);
        excelDataConvertException.setColumnIndex(1);
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
        excelDataConvertException.setExcelContentProperty(excelContentProperty);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause().getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getCause().getMessage(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("java.lang.Exception"));
    }
}
