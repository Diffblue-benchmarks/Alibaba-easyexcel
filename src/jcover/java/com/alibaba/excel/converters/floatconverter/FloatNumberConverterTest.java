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

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.floatconverter.FloatNumberConverter
 *
 * @author Diffblue Cover
 */

class FloatNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsFloat() {
        assertThat(new FloatNumberConverter().supportJavaTypeKey(), equalTo((Class) Float.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new FloatNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        assertEquals(1.0f, new FloatNumberConverter().convertToJavaData(new CellData(BigDecimal.valueOf(1L)), new ExcelContentProperty(), new GlobalConfiguration()), 0);
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new FloatNumberConverter().convertToExcelData((Float) 1.0f, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("1.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
