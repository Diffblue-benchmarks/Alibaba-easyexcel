package com.alibaba.excel.support;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.read.metadata.ReadWorkbook;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.support.ExcelTypeEnum
 *
 * @author Diffblue Cover
 */

class ExcelTypeEnumTest {

    @Test
    void valuesReturnsXlsXlsx() {
        ExcelTypeEnum[] result = ExcelTypeEnum.values();
        assertThat(result[0], is(ExcelTypeEnum.XLS));
        assertThat(result[1], is(ExcelTypeEnum.XLSX));
    }

    @Test
    void valueOfReturnsXls() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        assertThat(ExcelTypeEnum.valueOf(readWorkbook), is(ExcelTypeEnum.XLS));
    }
}
