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
 * Unit tests for com.alibaba.excel.converters.string.StringBooleanConverter
 *
 * @author Diffblue Cover
 */

class StringBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsString() {
        assertThat(new StringBooleanConverter().supportJavaTypeKey(), equalTo((Class) String.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new StringBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaDataReturnsFalse() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        assertThat(new StringBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is("false"));
    }

    @Test
    void convertToExcelDataValueIsFoo() {
        CellData result = new StringBooleanConverter().convertToExcelData("foo", new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(false));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.BOOLEAN));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
