package com.alibaba.excel.converters.floatconverter;

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
 * Unit tests for com.alibaba.excel.converters.floatconverter.FloatBooleanConverter
 *
 * @author Diffblue JCover
 */

public class FloatBooleanConverterDiffblueTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsNaN() {
        CellData result = new FloatBooleanConverter().convertToExcelData((Float)Float.NaN, new ExcelContentProperty(), new GlobalConfiguration());
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
    }

    @Test(timeout=10000)
    public void convertToExcelDataValueIsOne() {
        CellData result = new FloatBooleanConverter().convertToExcelData((Float)1.0f, new ExcelContentProperty(), new GlobalConfiguration());
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
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new FloatBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsFloat() {
        assertThat(new FloatBooleanConverter().supportJavaTypeKey(), equalTo((Class)Float.class));
    }
}
