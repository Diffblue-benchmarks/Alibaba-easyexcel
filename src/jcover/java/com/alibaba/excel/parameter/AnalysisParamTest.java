package com.alibaba.excel.parameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.parameter.AnalysisParam
 *
 * @author Diffblue Cover
 */

class AnalysisParamTest {

    @Test
    void factory() {
        AnalysisParam analysisParam =
             new AnalysisParam(new StringBufferInputStream("foo"), ExcelTypeEnum.XLS, new Object());
        Object customContent2 = new Object();
        analysisParam.setCustomContent(customContent2);
        analysisParam.setExcelTypeEnum(ExcelTypeEnum.XLS);
        analysisParam.setIn(new StringBufferInputStream("foo"));
        assertThat(analysisParam.getCustomContent(), sameInstance(customContent2));
        assertThat(analysisParam.getExcelTypeEnum(), is(ExcelTypeEnum.XLS));
    }
}
