package com.alibaba.excel.converters.bytearray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertArrayEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter
 *
 * @author Diffblue JCover
 */

public class BoxingByteArrayImageConverterTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsOne() {
        Byte[] value = new Byte[] { 1 };
        CellData result = new BoxingByteArrayImageConverter().convertToExcelData(value, new ExcelContentProperty(), new GlobalConfiguration());
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
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new BoxingByteArrayImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsArray() {
        assertThat(new BoxingByteArrayImageConverter().supportJavaTypeKey(), equalTo((Class)Byte[].class));
    }
}
