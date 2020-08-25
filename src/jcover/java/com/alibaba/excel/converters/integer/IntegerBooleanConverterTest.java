package com.alibaba.excel.converters.integer;

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
 * Unit tests for com.alibaba.excel.converters.integer.IntegerBooleanConverter
 *
 * @author Diffblue Cover
 */

class IntegerBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsInteger() {
        assertThat(new IntegerBooleanConverter().supportJavaTypeKey(), equalTo((Class) Integer.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBoolean() {
        assertThat(new IntegerBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        assertThat(new IntegerBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(1));
    }

    @Test
    void convertToJavaDataReturnsZero() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        assertThat(new IntegerBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(0));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new IntegerBooleanConverter().convertToExcelData((Integer) 1, new ExcelContentProperty(), new GlobalConfiguration());
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

    @Test
    void convertToExcelDataValueIsZero() {
        CellData result =
             new IntegerBooleanConverter().convertToExcelData((Integer) 0, new ExcelContentProperty(), new GlobalConfiguration());
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
}
