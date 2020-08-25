package com.alibaba.excel.converters.floatconverter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.floatconverter.FloatBooleanConverter
 *
 * @author Diffblue Cover
 */

class FloatBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsFloat() {
        assertThat(new FloatBooleanConverter().supportJavaTypeKey(), equalTo((Class) Float.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBoolean() {
        assertThat(new FloatBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        assertEquals(1.0f, new FloatBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), 0);
    }

    @Test
    void convertToJavaDataReturnsZero() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        assertEquals(0.0f, new FloatBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), 0);
    }

    @Test
    void convertToExcelDataValueIsNaN() {
        CellData result =
             new FloatBooleanConverter().convertToExcelData((Float) Float.NaN, new ExcelContentProperty(), new GlobalConfiguration());
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
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new FloatBooleanConverter().convertToExcelData((Float) 1.0f, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(true));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.BOOLEAN));
    }
}
