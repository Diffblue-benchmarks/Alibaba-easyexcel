package com.alibaba.excel.converters.doubleconverter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.doubleconverter.DoubleBooleanConverter
 *
 * @author Diffblue Cover
 */

class DoubleBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsDouble() {
        assertThat(new DoubleBooleanConverter().supportJavaTypeKey(), equalTo((Class) Double.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBoolean() {
        assertThat(new DoubleBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        assertThat(new DoubleBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), closeTo(1.0, 0.0));
    }

    @Test
    void convertToJavaDataReturnsZero() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        assertThat(new DoubleBooleanConverter().convertToJavaData(cellData, contentProperty, new GlobalConfiguration()), closeTo(0.0, 0.0));
    }

    @Test
    void convertToExcelDataValueIsNaN() {
        CellData result =
             new DoubleBooleanConverter().convertToExcelData((Double) Double.NaN, new ExcelContentProperty(), new GlobalConfiguration());
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
    void convertToExcelDataValueIsOne() {
        ExcelContentProperty contentProperty =
             mock(ExcelContentProperty.class);
        CellData result =
             new DoubleBooleanConverter().convertToExcelData((Double) 1.0, contentProperty, new GlobalConfiguration());
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
