package com.alibaba.excel.read.listener;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.read.metadata.holder.ReadHolder;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.listener.ModelBuildEventListener
 *
 * @author Diffblue JCover
 */

public class ModelBuildEventListenerTest {

    @Test(timeout=10000)
    public void doAfterAllAnalysed() {
        AnalysisContext context = mock(AnalysisContext.class);
        new ModelBuildEventListener().doAfterAllAnalysed(context);
    }

    @Test(timeout=10000)
    public void invokeCellDataMapIsEmpty() {
        Holder holder1 = mock(Holder.class);
        Holder holder2 = mock(Holder.class);
        ReadHolder readHolder = mock(ReadHolder.class);
        when(readHolder.excelReadHeadProperty())
            .thenReturn(new com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty(holder2, String.class, new java.util.ArrayList<java.util.List<String>>(), false))
            .thenReturn(new com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty(holder1, String.class, new java.util.ArrayList<java.util.List<String>>(), true));
        AnalysisContext context = mock(AnalysisContext.class);
        when(context.currentReadHolder())
            .thenReturn(readHolder);
        when(context.readRowHolder())
            .thenReturn(new com.alibaba.excel.read.metadata.holder.ReadRowHolder(1, new com.alibaba.excel.metadata.GlobalConfiguration()));
        new ModelBuildEventListener().invoke(new HashMap<Integer, com.alibaba.excel.metadata.CellData>(), context);
    }

    @Test(timeout=10000)
    public void invokeHeadCellDataMapIsEmpty() {
        AnalysisContext context = mock(AnalysisContext.class);
        new ModelBuildEventListener().invokeHead(new HashMap<Integer, com.alibaba.excel.metadata.CellData>(), context);
    }
}
