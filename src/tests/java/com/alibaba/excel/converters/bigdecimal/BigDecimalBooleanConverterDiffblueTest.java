package com.alibaba.excel.converters.bigdecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.bigdecimal.BigDecimalBooleanConverter
 *
 * @author Diffblue JCover
 */

public class BigDecimalBooleanConverterDiffblueTest {

    @Test(timeout=10000)
    public void convertToExcelData1() {
        CellData result = new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(1L), new ExcelContentProperty(), new GlobalConfiguration());
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
    public void convertToExcelData2() {
        CellData result = new BigDecimalBooleanConverter().convertToExcelData(BigDecimal.valueOf(0L), new ExcelContentProperty(), new GlobalConfiguration());
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
    public void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new BigDecimalBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsBigDecimal() {
        assertThat(new BigDecimalBooleanConverter().supportJavaTypeKey(), equalTo((Class)BigDecimal.class));
    }
}
