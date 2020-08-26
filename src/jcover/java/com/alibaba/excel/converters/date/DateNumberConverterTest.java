package com.alibaba.excel.converters.date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.date.DateNumberConverter
 *
 * @author Diffblue Cover
 */

class DateNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsDate() {
        assertThat(new DateNumberConverter().supportJavaTypeKey(), equalTo((Class) Date.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new DateNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaData1() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        cellData.setData(new Object());
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData.setImageValue(imageValue4);
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setConverter(new AutoConverter());
        contentProperty.setDateTimeFormatProperty(null);
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
        contentProperty.setHead(head);
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        contentProperty.setNumberFormatProperty(numberFormatProperty);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);
        assertThat(new DateNumberConverter().convertToJavaData(cellData, contentProperty, globalConfiguration), equalTo(new Date("Jan 01 1900")));
    }

    @Test
    void convertToJavaData2() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        cellData.setData(new Object());
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData.setImageValue(imageValue4);
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        contentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        Head head = new Head(1, "data", new ArrayList<String>(), false, false);
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
        contentProperty.setHead(head);
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        contentProperty.setNumberFormatProperty(numberFormatProperty);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);
        assertThat(new DateNumberConverter().convertToJavaData(cellData, contentProperty, globalConfiguration), equalTo(new Date("Jan 01 1900")));
    }

    @Test
    void convertToJavaDataContentPropertyIsNull() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        cellData.setData(new Object());
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData.setImageValue(imageValue4);
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);
        assertThat(new DateNumberConverter().convertToJavaData(cellData, (ExcelContentProperty) null, globalConfiguration), equalTo(new Date("Jan 01 1900")));
    }

    @Test
    void convertToExcelData1() throws java.text.ParseException {

        // arrange
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), new ExcelContentProperty(), globalConfiguration);

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToExcelData2() throws java.text.ParseException {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), contentProperty, new GlobalConfiguration());

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToExcelDataContentPropertyIsNull() throws java.text.ParseException {

        // arrange
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), (ExcelContentProperty) null, globalConfiguration);

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }
}
