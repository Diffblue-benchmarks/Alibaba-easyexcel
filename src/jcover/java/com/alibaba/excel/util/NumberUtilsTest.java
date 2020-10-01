package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.NumberUtils
 *
 * @author Diffblue Cover
 */

class NumberUtilsTest {

    @Test
    void format1() {
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("");
        contentProperty.setNumberFormatProperty(numberFormatProperty);
        assertThat(NumberUtils.format(1, contentProperty), is("1"));
    }

    @Test
    void format2() {
        assertThat(NumberUtils.format(1, new ExcelContentProperty()), is("1"));
        assertThat(NumberUtils.format(1, null), is("1"));
    }

    @Test
    void formatToCellDataNumIsOne() {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));

        // act
        CellData result = NumberUtils.formatToCellData(1, contentProperty);

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is("yyyy-MM-dd1"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
