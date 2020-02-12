package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringImageConverter
 *
 * @author Diffblue JCover
 */

public class StringImageConverterDiffblueTest {

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new StringImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsString() {
        assertThat(new StringImageConverter().supportJavaTypeKey(), equalTo((Class)String.class));
    }
}
