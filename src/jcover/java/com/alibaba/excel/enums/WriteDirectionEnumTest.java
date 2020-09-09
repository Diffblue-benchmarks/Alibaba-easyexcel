package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteDirectionEnum
 *
 * @author Diffblue Cover
 */

class WriteDirectionEnumTest {

    @Test
    void valuesReturnsVERTICALHORIZONTAL() {
        WriteDirectionEnum[] result = WriteDirectionEnum.values();
        assertThat(result[0], is(WriteDirectionEnum.VERTICAL));
        assertThat(result[1], is(WriteDirectionEnum.HORIZONTAL));
    }
}
