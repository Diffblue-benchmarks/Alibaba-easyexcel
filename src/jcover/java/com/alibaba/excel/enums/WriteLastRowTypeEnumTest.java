package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteLastRowTypeEnum
 *
 * @author Diffblue JCover
 */

public class WriteLastRowTypeEnumTest {

    @Test(timeout=10000)
    public void valuesReturnsCOMMON_EMPTYTEMPLATE_EMPTYHAS_DATA() {
        WriteLastRowTypeEnum[] result = WriteLastRowTypeEnum.values();
        assertThat(result[0], is(WriteLastRowTypeEnum.COMMON_EMPTY));
        assertThat(result[1], is(WriteLastRowTypeEnum.TEMPLATE_EMPTY));
        assertThat(result[2], is(WriteLastRowTypeEnum.HAS_DATA));
    }
}
