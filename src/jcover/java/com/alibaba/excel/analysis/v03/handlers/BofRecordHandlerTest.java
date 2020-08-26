package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.BofRecordHandler
 *
 * @author Diffblue Cover
 */

class BofRecordHandlerTest {

    @Test
    void factory() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(true);
        readWorkbook.setConvertAllFiled(false);
        readWorkbook.setCustomObject(new Object());
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(new Ehcache(1));
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        customReadListenerList.add(new ModelBuildEventListener());
        readWorkbook.setCustomReadListenerList(customReadListenerList);
        readWorkbook.setHeadRowNumber(1);
        readWorkbook.setAutoTrim(false);
        readWorkbook.setClazz(String.class);
        readWorkbook.setCustomConverterList(new ArrayList<Converter>());
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readWorkbook.setHead(head);
        readWorkbook.setUse1904windowing(false);
        ArrayList<ReadSheet> sheets = new ArrayList<ReadSheet>();
        ReadSheet readSheet = new ReadSheet();
        readSheet.setSheetName("Acme");
        readSheet.setSheetNo(1);
        readSheet.setHeadRowNumber(1);
        readSheet.setAutoTrim(false);
        readSheet.setClazz(String.class);
        readSheet.setUse1904windowing(false);
        sheets.add(readSheet);
        BofRecordHandler bofRecordHandler =
             new BofRecordHandler(new AnalysisContextImpl(readWorkbook), sheets, false, false);
        assertThat(bofRecordHandler.getOrder(), is(0));
        assertThat(bofRecordHandler.getCellData(), is(nullValue()));
        assertThat(bofRecordHandler.getColumn(), is(-1));
        assertThat(bofRecordHandler.getRow(), is(-1));
    }
}
