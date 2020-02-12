package com.alibaba.excel.parameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.parameter.AnalysisParam
 *
 * @author Diffblue JCover
 */

public class AnalysisParamDiffblueTest {

    @Test(timeout=10000)
    public void getCustomContent() {
        Object customContent = new Object();
        assertThat(new AnalysisParam(new StringBufferInputStream("Broadway"), ExcelTypeEnum.XLS, customContent).getCustomContent(), sameInstance(customContent));
    }

    @Test(timeout=10000)
    public void getExcelTypeEnumReturnsXLS() {
        assertThat(new AnalysisParam(new StringBufferInputStream("Broadway"), ExcelTypeEnum.XLS, new Object()).getExcelTypeEnum(), is(ExcelTypeEnum.XLS));
    }

    @Test(timeout=10000)
    public void getIn() {
        InputStream in = new StringBufferInputStream("Broadway");
        assertThat(new AnalysisParam(in, ExcelTypeEnum.XLS, new Object()).getIn(), sameInstance(in));
    }

    @Test(timeout=10000)
    public void setCustomContent() {
        AnalysisParam analysisParam = new AnalysisParam(new StringBufferInputStream("Broadway"), ExcelTypeEnum.XLS, new Object());
        Object customContent = new Object();
        analysisParam.setCustomContent(customContent);
        assertThat(analysisParam.getCustomContent(), sameInstance(customContent));
    }

    @Test(timeout=10000)
    public void setExcelTypeEnumToXLS() {
        new AnalysisParam(new StringBufferInputStream("Broadway"), ExcelTypeEnum.XLS, new Object()).setExcelTypeEnum(ExcelTypeEnum.XLS);
    }

    @Test(timeout=10000)
    public void setIn() {
        AnalysisParam analysisParam = new AnalysisParam(new StringBufferInputStream("Broadway"), ExcelTypeEnum.XLS, new Object());
        InputStream in = new StringBufferInputStream("Broadway");
        analysisParam.setIn(in);
        assertThat(analysisParam.getIn(), sameInstance(in));
    }
}
