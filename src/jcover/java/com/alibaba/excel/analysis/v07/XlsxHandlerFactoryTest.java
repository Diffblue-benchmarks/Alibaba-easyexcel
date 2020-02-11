package com.alibaba.excel.analysis.v07;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

import org.apache.poi.xssf.model.StylesTable;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.XlsxHandlerFactory
 *
 * @author Diffblue JCover
 */

public class XlsxHandlerFactoryTest {

    @Test(timeout=10000)
    public void buildCellHandlers() {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        assertThat(XlsxHandlerFactory.buildCellHandlers(analysisContext, new StylesTable()).size(), is(3));
        // pojo XlsxCellHandler
        // pojo XlsxCellHandler
        // pojo XlsxCellHandler
    }
}
