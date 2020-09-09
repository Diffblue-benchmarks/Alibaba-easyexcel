package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

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
        new ModelBuildEventListener().invokeHead(new HashMap<Integer, CellData>(), new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void doAfterAllAnalysed() {
        new ModelBuildEventListener().doAfterAllAnalysed(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }
}
