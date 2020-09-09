package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.XlsSaxAnalyser
 *
 * @author Diffblue Cover
 */

class XlsSaxAnalyserTest {

    @Test
    void factory() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(true);
        readWorkbook.setConvertAllFiled(false);
        readWorkbook.setCustomObject(new Object());
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(new Ehcache(1));
        readWorkbook.setUseDefaultListener(false);
        readWorkbook.setXlsxSAXParserFactoryName("Acme");
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
        readWorkbook.setLocale(new Locale("en"));
        readWorkbook.setUse1904windowing(false);
        readWorkbook.setUseScientificFormat(false);
        // pojo XlsSaxAnalyser
    }
}
