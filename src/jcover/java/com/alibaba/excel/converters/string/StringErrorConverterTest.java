package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringErrorConverter
 *
 * @author Diffblue Cover
 */

class StringErrorConverterTest {

    @Test
    void supportJavaTypeKeyReturnsString() {
        assertThat(new StringErrorConverter().supportJavaTypeKey(), equalTo((Class) String.class));
    }

    @Test
    void supportExcelTypeKeyReturnsError() {
        assertThat(new StringErrorConverter().supportExcelTypeKey(), is(CellDataTypeEnum.ERROR));
    }

    @Test
    void convertToJavaDataReturnsFoo() {
        CellData<String> cellData = new CellData<String>();
        cellData.setStringValue("foo");
        assertThat(new StringErrorConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is("foo"));
    }

    @Test
    void convertToExcelDataValueIsFoo() {
        CellData result =
             new StringErrorConverter().convertToExcelData("foo", new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("foo"));
        assertThat(result.getType(), is(CellDataTypeEnum.ERROR));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
