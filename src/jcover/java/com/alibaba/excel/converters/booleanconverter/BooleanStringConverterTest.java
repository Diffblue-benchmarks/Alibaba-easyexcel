package com.alibaba.excel.converters.booleanconverter;

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
 * Unit tests for com.alibaba.excel.converters.booleanconverter.BooleanStringConverter
 *
 * @author Diffblue Cover
 */

class BooleanStringConverterTest {

    @Test
    void supportJavaTypeKeyReturnsBoolean() {
        assertThat(new BooleanStringConverter().supportJavaTypeKey(), equalTo((Class) Boolean.class));
    }

    @Test
    void supportExcelTypeKeyReturnsSTRING() {
        assertThat(new BooleanStringConverter().supportExcelTypeKey(), is(CellDataTypeEnum.STRING));
    }

    @Test
    void convertToJavaDataReturnsFalse() {
        assertThat(new BooleanStringConverter().convertToJavaData(new CellData(), new ExcelContentProperty(), new GlobalConfiguration()), is(false));
    }

    @Test
    void convertToExcelDataValueIsFalse() {
        CellData result = new BooleanStringConverter().convertToExcelData((Boolean) false, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("false"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
