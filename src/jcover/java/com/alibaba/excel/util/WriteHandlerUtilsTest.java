package com.alibaba.excel.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.holder.WriteHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.WriteHandlerUtils
 *
 * @author Diffblue JCover
 */

public class WriteHandlerUtilsTest {

    @Test(timeout=10000)
    public void afterCellCreate1() {
        Map<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>> map = new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>();
        ((HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>)map).put(com.alibaba.excel.write.handler.CellWriteHandler.class, new ArrayList<com.alibaba.excel.write.handler.WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, new Head(1, "/bin/bash", new ArrayList<String>(), false, false), 1, false);
    }

    @Test(timeout=10000)
    public void afterCellCreate2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, new Head(1, "bar", new ArrayList<String>(), true, false), 1, false);
    }

    @Test(timeout=10000)
    public void afterCellDispose1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterCellDispose(writeContext, new CellData(), (Cell)null, new Head(1, "/bin/bash", new ArrayList<String>(), false, false), (Integer)1, (Boolean)false);
    }

    @Test(timeout=10000)
    public void afterCellDispose2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellDispose(writeContext, new CellData(), cell, new Head(1, "bar", new ArrayList<String>(), false, false), (Integer)1, (Boolean)false);
    }

    @Test(timeout=10000)
    public void afterRowCreateIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowCreate(writeContext, row, 1, false);
    }

    @Test(timeout=10000)
    public void afterRowDisposeIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowDispose(writeContext, row, 1, false);
    }

    @Test(timeout=10000)
    public void afterWorkbookCreate() {
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.writeWorkbookHolder())
            .thenReturn(new com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder(new com.alibaba.excel.write.metadata.WriteWorkbook()));
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test(timeout=10000)
    public void afterWorkbookDispose() {
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.writeWorkbookHolder())
            .thenReturn(new com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder(new com.alibaba.excel.write.metadata.WriteWorkbook()));
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test(timeout=10000)
    public void beforeCellCreateColumnIndexIsOneAndIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, new Head(1, "/bin/bash", new ArrayList<String>(), false, false), 1, 1, false);
    }

    @Test(timeout=10000)
    public void beforeRowCreateIsHeadIsFalseAndRelativeRowIndexIsOneAndRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends com.alibaba.excel.write.handler.WriteHandler>, java.util.List<com.alibaba.excel.write.handler.WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 1, 1, false);
    }

    @Test(timeout=10000)
    public void beforeWorkbookCreate() {
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.writeWorkbookHolder())
            .thenReturn(new com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder(new com.alibaba.excel.write.metadata.WriteWorkbook()));
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }
}
