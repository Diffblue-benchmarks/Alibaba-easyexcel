package com.alibaba.excel.converters.booleanconverter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter
 *
 * @author Diffblue Cover
 */

class BooleanNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsBoolean() {
        assertThat(new BooleanNumberConverter().supportJavaTypeKey(), equalTo((Class) Boolean.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new BooleanNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsFalse() {
        CellData<String> cellData = new CellData<String>();
        cellData.setNumberValue(BigDecimal.valueOf(0L));
        assertThat(new BooleanNumberConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(false));
    }

    @Test
    void convertToJavaDataReturnsTrue() {
        CellData<String> cellData = new CellData<String>();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        assertThat(new BooleanNumberConverter().convertToJavaData(cellData, contentProperty, new GlobalConfiguration()), is(true));
    }

    @Test
    void convertToExcelDataValueIsFalse() {
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        CellData result =
             new BooleanNumberConverter().convertToExcelData((Boolean) false, contentProperty, new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelDataValueIsTrue() {
        CellData result =
             new BooleanNumberConverter().convertToExcelData((Boolean) true, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("1")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
