package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.RowTypeEnum
 *
 * @author Diffblue Cover
 */

class RowTypeEnumTest {

    @Test
    void valuesReturnsDataEmpty() {
        RowTypeEnum[] result = RowTypeEnum.values();
        assertThat(result[0], is(RowTypeEnum.DATA));
        assertThat(result[1], is(RowTypeEnum.EMPTY));
    }
}
