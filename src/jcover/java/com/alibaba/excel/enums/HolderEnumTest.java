package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.enums.HolderEnum
 *
 * @author Diffblue JCover
 */

public class HolderEnumTest {

    @Test(timeout=10000)
    public void valuesReturnsWORKBOOKSHEETTABLEROW() {
        HolderEnum[] result = HolderEnum.values();
        assertThat(result[0], is(HolderEnum.WORKBOOK));
        assertThat(result[1], is(HolderEnum.SHEET));
        assertThat(result[2], is(HolderEnum.TABLE));
        assertThat(result[3], is(HolderEnum.ROW));
    }
}
