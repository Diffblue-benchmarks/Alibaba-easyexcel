package com.alibaba.excel.read.listener;

import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.listener.ModelBuildEventListener
 *
 * @author Diffblue Cover
 */

class ModelBuildEventListenerTest {

    @Test
    void invokeHead() {
        AnalysisContext context = mock(AnalysisContext.class);
        new ModelBuildEventListener().invokeHead(new HashMap<Integer, CellData>(), context);
    }

    @Test
    void doAfterAllAnalysed() {
        AnalysisContext context = mock(AnalysisContext.class);
        new ModelBuildEventListener().doAfterAllAnalysed(context);
    }
}
