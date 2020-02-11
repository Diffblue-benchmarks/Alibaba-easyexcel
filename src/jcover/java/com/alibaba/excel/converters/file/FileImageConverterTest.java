package com.alibaba.excel.converters.file;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.file.FileImageConverter
 *
 * @author Diffblue JCover
 */

public class FileImageConverterTest {

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsIMAGE() {
        assertThat(new FileImageConverter().supportExcelTypeKey(), is(CellDataTypeEnum.IMAGE));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsFile() {
        assertThat(new FileImageConverter().supportJavaTypeKey(), equalTo((Class)java.io.File.class));
    }
}
