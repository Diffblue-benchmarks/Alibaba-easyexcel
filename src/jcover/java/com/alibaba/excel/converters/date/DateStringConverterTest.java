package com.alibaba.excel.converters.date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.date.DateStringConverter
 *
 * @author Diffblue JCover
 */

public class DateStringConverterTest {

    @Test(timeout=10000)
    public void convertToExcelData() {
        CellData result = new DateStringConverter().convertToExcelData(new Date(1L), new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("1970-01-01 00:00:00"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
    }

    @Test(timeout=10000)
    public void convertToExcelDataContentPropertyIsNull() {
        CellData result = new DateStringConverter().convertToExcelData(new Date(1L), (ExcelContentProperty)null, new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("1970-01-01 00:00:00"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsSTRING() {
        assertThat(new DateStringConverter().supportExcelTypeKey(), is(CellDataTypeEnum.STRING));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsDate() {
        assertThat(new DateStringConverter().supportJavaTypeKey(), equalTo((Class)Date.class));
    }
}
