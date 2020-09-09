package com.alibaba.excel.converters.doubleconverter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.doubleconverter.DoubleNumberConverter
 *
 * @author Diffblue Cover
 */

class DoubleNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsDouble() {
        assertThat(new DoubleNumberConverter().supportJavaTypeKey(), equalTo((Class) Double.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new DoubleNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        assertThat(new DoubleNumberConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), closeTo(1.0, 0.0));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new DoubleNumberConverter().convertToExcelData((Double) 1.0, new ExcelContentProperty(), new GlobalConfiguration());
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
