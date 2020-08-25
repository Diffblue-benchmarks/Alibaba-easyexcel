package com.alibaba.excel.converters.integer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.integer.IntegerStringConverter
 *
 * @author Diffblue Cover
 */

class IntegerStringConverterTest {

    @Test
    void supportJavaTypeKeyReturnsInteger() {
        assertThat(new IntegerStringConverter().supportJavaTypeKey(), equalTo((Class) Integer.class));
    }

    @Test
    void supportExcelTypeKeyReturnsString() {
        assertThat(new IntegerStringConverter().supportExcelTypeKey(), is(CellDataTypeEnum.STRING));
    }

    @Test
    void convertToExcelDataValueIsOne() {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));

        // act
        CellData result =
             new IntegerStringConverter().convertToExcelData((Integer) 1, contentProperty, new GlobalConfiguration());

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
    }
}
