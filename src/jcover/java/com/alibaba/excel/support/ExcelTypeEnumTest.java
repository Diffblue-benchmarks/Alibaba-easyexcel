package com.alibaba.excel.support;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
}
