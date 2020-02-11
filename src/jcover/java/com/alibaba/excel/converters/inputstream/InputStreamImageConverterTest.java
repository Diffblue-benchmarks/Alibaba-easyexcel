package com.alibaba.excel.converters.inputstream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertArrayEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.inputstream.InputStreamImageConverter
 *
 * @author Diffblue JCover
 */

public class InputStreamImageConverterTest {

    @Test(timeout=10000)
    public void convertToExcelData() throws java.io.IOException {
        CellData result = new InputStreamImageConverter().convertToExcelData(new StringBufferInputStream("Broadway"), new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertArrayEquals(new byte[] { 66, 114, 111, 97, 100, 119, 97, 121 }, result.getImageValue());
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.IMAGE));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new InputStreamImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsInputStream() {
        assertThat(new InputStreamImageConverter().supportJavaTypeKey(), equalTo((Class)java.io.InputStream.class));
    }
}
