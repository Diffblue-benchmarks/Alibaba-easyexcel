package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.NumberUtils
 *
 * @author Diffblue JCover
 */

public class NumberUtilsDiffblueTest {

    @Test(timeout=10000)
    public void format() {
        assertThat(NumberUtils.format(1, new ExcelContentProperty()), is("1"));
        assertThat(NumberUtils.format(1, null), is("1"));
    }

    @Test(timeout=10000)
    public void formatToCellData() {
        CellData result = NumberUtils.formatToCellData(1, new ExcelContentProperty());
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
    public void parseByteReturnsOne() throws java.text.ParseException {
        assertThat(NumberUtils.parseByte("1", new ExcelContentProperty()), is((byte)1));
    }

    @Test(timeout=10000)
    public void parseDoubleReturnsOne() throws java.text.ParseException {
        assertEquals(1.0, NumberUtils.parseDouble("1", new ExcelContentProperty()), 0);
    }

    @Test(timeout=10000)
    public void parseFloatReturnsOne() throws java.text.ParseException {
        assertEquals(1.0f, NumberUtils.parseFloat("1", new ExcelContentProperty()), 0);
    }

    @Test(timeout=10000)
    public void parseIntegerReturnsOne() throws java.text.ParseException {
        assertThat(NumberUtils.parseInteger("1", new ExcelContentProperty()), is(1));
    }

    @Test(timeout=10000)
    public void parseLongReturnsOne() throws java.text.ParseException {
        assertThat(NumberUtils.parseLong("1", new ExcelContentProperty()), is(1L));
    }

    @Test(timeout=10000)
    public void parseShortReturnsOne() throws java.text.ParseException {
        assertThat(NumberUtils.parseShort("1", new ExcelContentProperty()), is((short)1));
    }

    @Test(timeout=10000)
    public void toPlainString() throws java.text.ParseException {
        assertThat(NumberUtils.parseBigDecimal("1", new ExcelContentProperty()).toPlainString(), is("1"));
        assertThat(NumberUtils.parseBigDecimal("1", null).toPlainString(), is("1"));
    }
}
