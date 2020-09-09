package com.alibaba.excel.converters.longconverter;

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
 * Unit tests for com.alibaba.excel.converters.longconverter.LongNumberConverter
 *
 * @author Diffblue Cover
 */

class LongNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsLong() {
        assertThat(new LongNumberConverter().supportJavaTypeKey(), equalTo((Class) Long.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new LongNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        assertThat(new LongNumberConverter().convertToJavaData(new CellData(BigDecimal.valueOf(1L)), new ExcelContentProperty(), new GlobalConfiguration()), is(1L));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new LongNumberConverter().convertToExcelData((Long) 1L, new ExcelContentProperty(), new GlobalConfiguration());
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
