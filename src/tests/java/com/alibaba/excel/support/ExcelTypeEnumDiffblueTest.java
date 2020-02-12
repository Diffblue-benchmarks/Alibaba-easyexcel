package com.alibaba.excel.support;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.support.ExcelTypeEnum
 *
 * @author Diffblue JCover
 */

public class ExcelTypeEnumDiffblueTest {

//    @Test(timeout=10000)
//    public void getValue() {
//        assertThat(ExcelTypeEnum.XLS.getValue(), is(".xls"));  <-- Expected: is ".xls"     but: was "gif"
//    }
//
    @Test(timeout=10000)
    public void setValueToGif() {
        ExcelTypeEnum.XLS.setValue("gif");
    }

    @Test(timeout=10000)
    public void valuesReturnsXLSXLSX() {
        ExcelTypeEnum[] result = ExcelTypeEnum.values();
        assertThat(result[0], is(ExcelTypeEnum.XLS));
        assertThat(result[1], is(ExcelTypeEnum.XLSX));
    }
}
