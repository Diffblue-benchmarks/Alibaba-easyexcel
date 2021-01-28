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
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext);
    }

    @Test
    void beforeWorkbookCreateRunOwnIsTrue() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap1 =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap1.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap2 =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap2.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.ownWriteHandlerMap())
            .thenReturn(writeHandlerListMap1);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeWorkbookCreate(writeContext, true);
    }

    @Test
    void afterWorkbookCreate1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookCreate(writeContext);
    }

    @Test
    void afterWorkbookDispose1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void afterWorkbookDispose2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void afterWorkbookDispose3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.WorkbookWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.afterWorkbookDispose(writeContext);
    }

    @Test
    void beforeSheetCreate1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeSheetCreate(writeContext);
    }

    @Test
    void beforeSheetCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.SheetWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeSheetCreate(writeContext);
    }

    @Test
    void beforeSheetCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.SheetWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
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
    void beforeCellCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, new Head(1, "data", new ArrayList<String>(), false, false), 1, 1, false);
    }

    @Test
    void beforeCellCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.beforeCellCreate(writeContext, row, head, 1, 1, false);
    }

    @Test
    void afterCellCreate1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.afterCellCreate(writeContext, cell, head, 1, false);
    }

    @Test
    void afterCellDataConverted1() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellDataConverted(writeContext, new CellData<String>(), cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellDataConverted2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellDataConverted(writeContext, new CellData<String>(), cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void afterCellDataConverted3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.CellWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        Head head = mock(Head.class);
        WriteHandlerUtils.afterCellDataConverted(writeContext, new CellData<String>(), cell, head, 1, false);
    }

    @Test
    void afterCellDisposeIsHeadIsFalseAndRelativeRowIndexIsOne() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>());
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Cell cell = mock(Cell.class);
        WriteHandlerUtils.afterCellDispose(writeContext, new CellData<String>(), cell, new Head(1, "data", new ArrayList<String>(), false, false), 1, false);
    }

    @Test
    void beforeRowCreate1() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.RowWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        WriteHandlerUtils.beforeRowCreate(writeContext, 0, 1, false);
    }

    @Test
    void beforeRowCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.RowWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
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
    void afterRowCreate2() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        ArrayList<WriteHandler> writeHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeHandlerList.add(writeHandler);
        writeHandlerListMap.put(com.alibaba.excel.write.handler.RowWriteHandler.class, writeHandlerList);
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
        WriteContext writeContext = mock(WriteContext.class);
        when(writeContext.currentWriteHolder())
            .thenReturn(writeHolder);
        Row row = mock(Row.class);
        WriteHandlerUtils.afterRowCreate(writeContext, row, 1, false);
    }

    @Test
    void afterRowCreate3() {
        HashMap<Class<? extends WriteHandler>, List<WriteHandler>> writeHandlerListMap =
             new HashMap<Class<? extends WriteHandler>, List<WriteHandler>>();
        writeHandlerListMap.put(com.alibaba.excel.write.handler.RowWriteHandler.class, new ArrayList<WriteHandler>());
        WriteHolder writeHolder = mock(WriteHolder.class);
        when(writeHolder.writeHandlerMap())
            .thenReturn(writeHandlerListMap);
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
