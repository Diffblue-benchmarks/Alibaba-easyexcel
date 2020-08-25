package com.alibaba.excel.converters.shortconverter;

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
 * Unit tests for com.alibaba.excel.converters.shortconverter.ShortNumberConverter
 *
 * @author Diffblue Cover
 */

class ShortNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsShort() {
        assertThat(new ShortNumberConverter().supportJavaTypeKey(), equalTo((Class) Short.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new ShortNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        assertThat(new ShortNumberConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is((short) 1));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new ShortNumberConverter().convertToExcelData((short) 1, new ExcelContentProperty(), new GlobalConfiguration());
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
    }
}
