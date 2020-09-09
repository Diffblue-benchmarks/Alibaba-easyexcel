package com.alibaba.excel.context;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.context.AnalysisContextImpl
 *
 * @author Diffblue Cover
 */

class AnalysisContextImplTest {

    @Test
    void currentSheet() {
        new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).currentSheet(new ReadSheet());
    }

    @Test
    void readRowHolderReturnsNull() {
        assertThat(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).readRowHolder(), is(nullValue()));
    }

    @Test
    void readRowHolder() {
        new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).readRowHolder(new ReadRowHolder(1, RowTypeEnum.DATA, new GlobalConfiguration(), new HashMap<Integer, Cell>()));
    }

    @Test
    void currentReadHolder() {
        // pojo com.alibaba.excel.read.metadata.holder.ReadHolder
    }

    @Test
    void getCustom() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        assertThat(new DefaultXlsReadContext(readWorkbook, ExcelTypeEnum.XLS).getCustom(), sameInstance(customObject));
    }

    @Test
    void analysisEventProcessor() {
        // pojo com.alibaba.excel.read.processor.AnalysisEventProcessor
    }

    @Test
    void getExcelTypeReturnsXls() {
        assertThat(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test
    void getInputStream() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        StringBufferInputStream inputStream =
             new StringBufferInputStream("Broadway");
        readWorkbook.setInputStream(inputStream);
        assertThat(new DefaultXlsReadContext(readWorkbook, ExcelTypeEnum.XLS).getInputStream(), instanceOf(StringBufferInputStream.class));
        assertThat((StringBufferInputStream) new DefaultXlsReadContext(readWorkbook, ExcelTypeEnum.XLS).getInputStream(), sameInstance(inputStream));
    }
}
