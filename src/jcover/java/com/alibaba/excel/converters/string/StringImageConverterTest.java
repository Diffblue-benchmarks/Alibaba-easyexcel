package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringImageConverter
 *
 * @author Diffblue Cover
 */

class StringImageConverterTest {

    @Test
    void supportJavaTypeKeyReturnsString() {
        assertThat(new StringImageConverter().supportJavaTypeKey(), equalTo((Class) String.class));
    }

    @Test
    void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new StringImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }
}
