package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteLastRowTypeEnum
 *
 * @author Diffblue Cover
 */

class WriteLastRowTypeEnumTest {

    @Test
    void valuesReturnsCommon_emptyTemplate_emptyHas_data() {
        WriteLastRowTypeEnum[] result = WriteLastRowTypeEnum.values();
        assertThat(result[0], is(WriteLastRowTypeEnum.COMMON_EMPTY));
        assertThat(result[1], is(WriteLastRowTypeEnum.TEMPLATE_EMPTY));
        assertThat(result[2], is(WriteLastRowTypeEnum.HAS_DATA));
    }
}
