package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.listener.ModelBuildEventListener
 *
 * @author Diffblue Cover
 */

class ModelBuildEventListenerTest {

    @Test
    void invokeHeadCellDataMapIsEmpty() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        new ModelBuildEventListener().invokeHead(new HashMap<Integer, CellData>(), new AnalysisContextImpl(readWorkbook));
    }

    @Test
    void doAfterAllAnalysed() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        new ModelBuildEventListener().doAfterAllAnalysed(new AnalysisContextImpl(readWorkbook));
    }
}
