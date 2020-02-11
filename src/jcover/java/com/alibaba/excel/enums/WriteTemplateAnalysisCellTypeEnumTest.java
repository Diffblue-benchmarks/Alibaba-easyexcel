package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.enums.WriteTemplateAnalysisCellTypeEnum
 *
 * @author Diffblue JCover
 */

public class WriteTemplateAnalysisCellTypeEnumTest {

    @Test(timeout=10000)
    public void valuesReturnsCOMMONCOLLECTION() {
        WriteTemplateAnalysisCellTypeEnum[] result = WriteTemplateAnalysisCellTypeEnum.values();
        assertThat(result[0], is(WriteTemplateAnalysisCellTypeEnum.COMMON));
        assertThat(result[1], is(WriteTemplateAnalysisCellTypeEnum.COLLECTION));
    }
}
