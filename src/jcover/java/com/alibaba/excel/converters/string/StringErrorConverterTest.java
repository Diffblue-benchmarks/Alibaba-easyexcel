package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringErrorConverter
 *
 * @author Diffblue JCover
 */

public class StringErrorConverterTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsSomething() {
        CellData result = new StringErrorConverter().convertToExcelData("something", new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("something"));
        assertThat(result.getType(), is(CellDataTypeEnum.ERROR));
    }

    @Test(timeout=10000)
    public void convertToJavaDataReturnsNull() {
        assertThat(new StringErrorConverter().convertToJavaData(new CellData(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsERROR() {
        assertThat(new StringErrorConverter().supportExcelTypeKey(), is(CellDataTypeEnum.ERROR));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsString() {
        assertThat(new StringErrorConverter().supportJavaTypeKey(), equalTo((Class)String.class));
    }
}
