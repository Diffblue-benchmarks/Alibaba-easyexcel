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
 * Unit tests for com.alibaba.excel.converters.bigdecimal.BigDecimalStringConverter
 *
 * @author Diffblue JCover
 */

public class BigDecimalStringConverterDiffblueTest {

    @Test(timeout=10000)
    public void convertToExcelData() {
        CellData result = new BigDecimalStringConverter().convertToExcelData(BigDecimal.valueOf(1L), new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("1"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsSTRING() {
        assertThat(new BigDecimalStringConverter().supportExcelTypeKey(), is(CellDataTypeEnum.STRING));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsBigDecimal() {
        assertThat(new BigDecimalStringConverter().supportJavaTypeKey(), equalTo((Class)BigDecimal.class));
    }
}
