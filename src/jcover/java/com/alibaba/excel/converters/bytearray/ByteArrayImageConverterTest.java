package com.alibaba.excel.converters.bytearray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.bytearray.ByteArrayImageConverter
 *
 * @author Diffblue Cover
 */

class ByteArrayImageConverterTest {

    @Test
    void supportJavaTypeKeyReturnsArray() {
        assertThat(new ByteArrayImageConverter().supportJavaTypeKey(), equalTo((Class) byte[].class));
    }

    @Test
    void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new ByteArrayImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }

    @Test
    void convertToExcelDataValueIsOne() {

        // arrange
        byte[] value = new byte[] { 1 };

        // act
        CellData result = new ByteArrayImageConverter().convertToExcelData(value, new ExcelContentProperty(), new GlobalConfiguration());

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertArrayEquals(new byte[] { 1 }, result.getImageValue());
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.IMAGE));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
