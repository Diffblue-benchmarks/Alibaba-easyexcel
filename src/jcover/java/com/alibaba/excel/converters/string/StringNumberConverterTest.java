package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringNumberConverter
 *
 * @author Diffblue Cover
 */

class StringNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsString() {
        assertThat(new StringNumberConverter().supportJavaTypeKey(), equalTo((Class) String.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new StringNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaData() {
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        assertThat(new StringNumberConverter().convertToJavaData(new CellData(BigDecimal.valueOf(1L)), contentProperty, new GlobalConfiguration()), is("1900-01-01"));
    }
}
