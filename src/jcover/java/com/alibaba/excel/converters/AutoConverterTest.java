package com.alibaba.excel.converters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.AutoConverter
 *
 * @author Diffblue Cover
 */

class AutoConverterTest {

    @Test
    void supportJavaTypeKeyReturnsNull() {
        assertThat(new AutoConverter().supportJavaTypeKey(), is(nullValue()));
    }

    @Test
    void supportExcelTypeKeyReturnsNull() {
        assertThat(new AutoConverter().supportExcelTypeKey(), is(nullValue()));
    }

    @Test
    void convertToJavaDataReturnsNull() {
        assertThat(new AutoConverter().convertToJavaData(new CellData<String>(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }

    @Test
    void convertToExcelDataReturnsNull() {
        assertThat(new AutoConverter().convertToExcelData(new Object(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }
}
