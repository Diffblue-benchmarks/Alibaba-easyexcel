package com.alibaba.excel.converters.bigdecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.bigdecimal.BigDecimalBooleanConverter
 *
 * @author Diffblue Cover
 */

class BigDecimalBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsBigDecimal() {
        assertThat(new BigDecimalBooleanConverter().supportJavaTypeKey(), equalTo((Class) BigDecimal.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBoolean() {
        assertThat(new BigDecimalBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaData1() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        BigDecimal numberValue4 = BigDecimal.valueOf(1L);
        cellData.setNumberValue(numberValue4);
        assertThat(new BigDecimalBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), sameInstance(numberValue4));
    }

    @Test
    void convertToJavaData2() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        assertThat(new BigDecimalBooleanConverter().convertToJavaData(cellData, contentProperty, new GlobalConfiguration()), equalTo(new BigDecimal("0")));
    }

    @Test
    void convertToExcelData1() {
        CellData result =
             new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(0L), new ExcelContentProperty(), new GlobalConfiguration());
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

    @Test
    void convertToExcelData2() {
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        CellData result =
             new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(1L), contentProperty, new GlobalConfiguration());
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
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
