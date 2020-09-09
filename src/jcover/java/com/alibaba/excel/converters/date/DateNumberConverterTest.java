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
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

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
    void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new DateNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaData() {
        CellData cellData = new CellData(BigDecimal.valueOf(1L));
        cellData.setBooleanValue(false);
        cellData.setData(new Object());
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue = new byte[] { 1 };
        cellData.setImageValue(imageValue);
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        cellData.setColumnIndex(1);
        cellData.setRowIndex(1);
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setConverter(new AutoConverter());
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        contentProperty.setHead(new Head(1, "data", new ArrayList<String>(), false, false));
        contentProperty.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(new DateNumberConverter().convertToJavaData(cellData, contentProperty, globalConfiguration), equalTo(new Date("Jan 01 1900")));
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
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelData2() throws java.text.ParseException {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("bar", false));

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
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
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
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
