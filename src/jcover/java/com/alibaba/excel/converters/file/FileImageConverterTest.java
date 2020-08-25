package com.alibaba.excel.converters.file;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.file.FileImageConverter
 *
 * @author Diffblue Cover
 */

class FileImageConverterTest {

    @Test
    void supportJavaTypeKeyReturnsFile() {
        assertThat(new FileImageConverter().supportJavaTypeKey(), equalTo((Class) java.io.File.class));
    }

    @Test
    void supportExcelTypeKeyReturnsImage() {
        assertThat(new FileImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }
}
