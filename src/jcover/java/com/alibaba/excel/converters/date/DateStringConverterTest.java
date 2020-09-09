package com.alibaba.excel.converters.date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.date.DateStringConverter
 *
 * @author Diffblue Cover
 */

class DateStringConverterTest {

    @Test
    void supportJavaTypeKeyReturnsDate() {
        assertThat(new DateStringConverter().supportJavaTypeKey(), equalTo((Class) java.util.Date.class));
    }

    @Test
    void supportExcelTypeKeyReturnsSTRING() {
        assertThat(new DateStringConverter().supportExcelTypeKey(), is(CellDataTypeEnum.STRING));
    }

    @Test
    void convertToExcelData1() throws java.text.ParseException {
        CellData result =
             new DateStringConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("2010-12-31 00:00:00"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelData2() throws java.text.ParseException {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));

        // act
        CellData result =
             new DateStringConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), contentProperty, new GlobalConfiguration());

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("2010-12-31"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelDataContentPropertyIsNull() throws java.text.ParseException {
        CellData result =
             new DateStringConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), (ExcelContentProperty) null, new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("2010-12-31 00:00:00"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
