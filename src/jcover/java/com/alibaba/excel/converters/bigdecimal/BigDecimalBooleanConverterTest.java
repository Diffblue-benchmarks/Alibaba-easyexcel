package com.alibaba.excel.converters.bigdecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

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
    void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new BigDecimalBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaData1() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        assertThat(new BigDecimalBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), equalTo(new BigDecimal("1")));
    }

    @Test
    void convertToJavaData2() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        assertThat(new BigDecimalBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), equalTo(new BigDecimal("0")));
    }

    @Test
    void convertToExcelData1() {
        CellData result = new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(0L), new ExcelContentProperty(), new GlobalConfiguration());
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
        CellData result = new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(1L), new ExcelContentProperty(), new GlobalConfiguration());
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
