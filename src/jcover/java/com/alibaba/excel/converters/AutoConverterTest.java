package com.alibaba.excel.converters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.AutoConverter
 *
 * @author Diffblue JCover
 */

public class AutoConverterTest {

    @Test(timeout=10000)
    public void convertToExcelDataReturnsNull() {
        assertThat(new AutoConverter().convertToExcelData(new Object(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void convertToJavaDataReturnsNull() {
        assertThat(new AutoConverter().convertToJavaData(new CellData(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsNull() {
        assertThat(new AutoConverter().supportExcelTypeKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsNull() {
        assertThat(new AutoConverter().supportJavaTypeKey(), is(nullValue()));
    }
}
