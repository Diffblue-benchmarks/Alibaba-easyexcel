package com.alibaba.excel.converters.longconverter;

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
 * Unit tests for com.alibaba.excel.converters.longconverter.LongBooleanConverter
 *
 * @author Diffblue Cover
 */

class LongBooleanConverterTest {

    @Test
    void supportJavaTypeKeyReturnsLong() {
        assertThat(new LongBooleanConverter().supportJavaTypeKey(), equalTo((Class) Long.class));
    }

    @Test
    void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new LongBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test
    void convertToJavaDataReturnsOne() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(true);
        assertThat(new LongBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(1L));
    }

    @Test
    void convertToJavaDataReturnsZero() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        assertThat(new LongBooleanConverter().convertToJavaData(cellData, new ExcelContentProperty(), new GlobalConfiguration()), is(0L));
    }

    @Test
    void convertToExcelDataValueIsOne() {
        CellData result =
             new LongBooleanConverter().convertToExcelData((Long) 1L, new ExcelContentProperty(), new GlobalConfiguration());
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

    @Test
    void convertToExcelDataValueIsZero() {
        CellData result =
             new LongBooleanConverter().convertToExcelData((Long) 0L, new ExcelContentProperty(), new GlobalConfiguration());
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
}
