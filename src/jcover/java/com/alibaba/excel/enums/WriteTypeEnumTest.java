package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteTypeEnum
 *
 * @author Diffblue JCover
 */

public class WriteTypeEnumTest {

    @Test(timeout=10000)
    public void valuesReturnsADDFILL() {
        WriteTypeEnum[] result = WriteTypeEnum.values();
        assertThat(result[0], is(WriteTypeEnum.ADD));
        assertThat(result[1], is(WriteTypeEnum.FILL));
    }
}
