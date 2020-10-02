package com.alibaba.excel.converters.integer;

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
 * Unit tests for com.alibaba.excel.converters.integer.IntegerNumberConverter
 *
 * @author Diffblue Cover
 */

class IntegerNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsInteger() {
        assertThat(new IntegerNumberConverter().supportJavaTypeKey(), equalTo((Class) Integer.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new IntegerNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData<String> cellData = new CellData<String>();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        assertThat(new IntegerNumberConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(1));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new IntegerNumberConverter().convertToExcelData((Integer) 1, new ExcelContentProperty(), new GlobalConfiguration());
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
