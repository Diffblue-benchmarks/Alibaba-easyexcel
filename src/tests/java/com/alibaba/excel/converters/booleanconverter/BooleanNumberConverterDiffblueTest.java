package com.alibaba.excel.converters.booleanconverter;

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
 * Unit tests for com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter
 *
 * @author Diffblue JCover
 */

public class BooleanNumberConverterDiffblueTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsFalse() {
        CellData result = new BooleanNumberConverter().convertToExcelData((Boolean)false, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue().toPlainString(), is("0"));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void convertToExcelDataValueIsTrue() {
        CellData result = new BooleanNumberConverter().convertToExcelData((Boolean)true, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue().toPlainString(), is("1"));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new BooleanNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsBoolean() {
        assertThat(new BooleanNumberConverter().supportJavaTypeKey(), equalTo((Class)Boolean.class));
    }
}
