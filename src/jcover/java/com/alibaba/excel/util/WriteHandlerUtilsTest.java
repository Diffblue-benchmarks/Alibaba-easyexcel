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
    void beforeWorkbookCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x851 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x851.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, x851);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreate2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreate3() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreateRunOwnIsTrue() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.ownWriteHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext, true);
    }

    @Test
    void afterWorkbookCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x957 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x957.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, x957);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookCreate2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookCreate3() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookDispose1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x1001 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x1001.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, x1001);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void afterWorkbookDispose2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void afterWorkbookDispose3() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void beforeSheetCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x1031 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x1031.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.SheetWriteHandler.class, x1031);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeSheetCreate(writeContext);
    }

    @Test
    void beforeSheetCreate2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeSheetCreate(writeContext);
    }

    @Test
    void beforeSheetCreate3() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.SheetWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
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
    void beforeCellCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x2198 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x2198.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.CellWriteHandler.class, x2198);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, new Head(1, "data", new ArrayList<String>(), false, false), 1, 1, false);
    }

    @Test
    void beforeCellCreate2() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, head, 1, 1, false);
    }

    @Test
    void afterCellCreate1() throws org.apache.poi.ss.formula.FormulaParseException {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x2596 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x2596.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.CellWriteHandler.class, x2596);
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
        ArrayList<WriteHandler> x2994 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x2994.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.CellWriteHandler.class, x2994);
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
    void beforeRowCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x4200 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x4200.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.RowWriteHandler.class, x4200);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 0, 1, false);
    }

    @Test
    void beforeRowCreate2() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.RowWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 0, 1, false);
    }

    @Test
    void beforeRowCreateRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 1, 1, false);
    }

    @Test
    void afterRowCreate1() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> x4502 = new ArrayList<WriteHandler>();
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        x4502.add(writeHandler1);
        map.put(com.alibaba.excel.write.handler.RowWriteHandler.class, x4502);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowCreate(writeContext, row, 1, false);
    }

    @Test
    void afterRowCreate2() {
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
    void afterRowCreate3() {
        Map<Class<? extends WriteHandler>, List<WriteHandler>> map =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        map.put(com.alibaba.excel.write.handler.RowWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(map);
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
