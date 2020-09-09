package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteTypeEnum
 *
 * @author Diffblue Cover
 */

class WriteTypeEnumTest {

    @Test
    void valuesReturnsADDFILL() {
        WriteTypeEnum[] result = WriteTypeEnum.values();
        assertThat(result[0], is(WriteTypeEnum.ADD));
        assertThat(result[1], is(WriteTypeEnum.FILL));
    }
}
