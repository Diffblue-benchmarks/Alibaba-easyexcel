package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.HeadKindEnum
 *
 * @author Diffblue Cover
 */

class HeadKindEnumTest {

    @Test
    void valuesReturnsNONECLASSSTRING() {
        HeadKindEnum[] result = HeadKindEnum.values();
        assertThat(result[0], is(HeadKindEnum.NONE));
        assertThat(result[1], is(HeadKindEnum.CLASS));
        assertThat(result[2], is(HeadKindEnum.STRING));
    }
}
