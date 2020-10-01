package com.alibaba.excel.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.WriteHandlerUtils
 *
 * @author Diffblue Cover
 */

class WriteHandlerUtilsTest {

    @Test
    void beforeWorkbookCreate() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookCreate() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookDispose() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void beforeSheetCreate() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeSheetCreate(writeContext);
    }

    @Test
    void afterSheetCreate() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterSheetCreate(writeContext);
    }

    @Test
    void beforeCellCreateColumnIndexIsOneAndIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, new Head(1, "data", new ArrayList<String>(), false, false), 1, 1, false);
    }

    @Test
    void afterCellCreate1() throws org.apache.poi.ss.formula.FormulaParseException {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x899 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x899.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.CellWriteHandler.class, x899);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellCreate2() throws org.apache.poi.ss.formula.FormulaParseException {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, head, 1, false);
    }

    @Test
    void afterCellDataConverted1() throws org.apache.poi.ss.formula.FormulaParseException {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x906 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x906.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.CellWriteHandler.class, x906);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellDataConverted(writeContext, new CellData(), cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellDataConverted2() throws org.apache.poi.ss.formula.FormulaParseException {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.afterCellDataConverted(writeContext, new CellData(), cell, head, 1, false);
    }

    @Test
    void afterCellDispose1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterCellDispose(writeContext, new CellData(), null, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellDispose2() throws org.apache.poi.ss.formula.FormulaParseException {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.afterCellDispose(writeContext, new CellData(), cell, head, 1, false);
    }

    @Test
    void beforeRowCreateIsHeadIsFalseAndRelativeRowIndexIsOneAndRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 1, 1, false);
    }

    @Test
    void afterRowCreateIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowCreate(writeContext, row, 1, false);
    }

    @Test
    void afterRowDisposeIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowDispose(writeContext, row, 1, false);
    }
}
