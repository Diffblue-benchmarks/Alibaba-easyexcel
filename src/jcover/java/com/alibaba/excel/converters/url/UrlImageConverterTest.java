package com.alibaba.excel.converters.url;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.url.UrlImageConverter
 *
 * @author Diffblue Cover
 */

class UrlImageConverterTest {

    @Test
    void supportJavaTypeKeyReturnsURL() {
        assertThat(new UrlImageConverter().supportJavaTypeKey(), equalTo((Class) java.net.URL.class));
    }

    @Test
    void supportExcelTypeKeyReturnsImage() {
        assertThat(new UrlImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }
}
