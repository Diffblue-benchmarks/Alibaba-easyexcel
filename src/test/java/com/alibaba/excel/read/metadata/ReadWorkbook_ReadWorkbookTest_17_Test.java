package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_ReadWorkbookTest_17_Test {
  @Test
  public void ReadWorkbookTest() throws Exception {
    // Arrange and Act
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Assert
    ExcelTypeEnum excelType = readWorkbook.getExcelType();
    ReadCache readCache = readWorkbook.getReadCache();
    Class clazz = readWorkbook.getClazz();
    Boolean defaultReturnMap = readWorkbook.getDefaultReturnMap();
    Integer headRowNumber = readWorkbook.getHeadRowNumber();
    String toStringResult = readWorkbook.toString();
    File file = readWorkbook.getFile();
    Boolean ignoreEmptyRow = readWorkbook.getIgnoreEmptyRow();
    Boolean autoCloseStream = readWorkbook.getAutoCloseStream();
    Boolean convertAllFiled = readWorkbook.getConvertAllFiled();
    List<List<String>> head = readWorkbook.getHead();
    Boolean autoTrim = readWorkbook.getAutoTrim();
    ReadCacheSelector readCacheSelector = readWorkbook.getReadCacheSelector();
    Boolean mandatoryUseInputStream = readWorkbook.getMandatoryUseInputStream();
    InputStream inputStream = readWorkbook.getInputStream();
    List<ReadListener> customReadListenerList = readWorkbook.getCustomReadListenerList();
    Boolean use1904windowing = readWorkbook.getUse1904windowing();
    List<Converter> customConverterList = readWorkbook.getCustomConverterList();
    Assert.assertEquals(null, excelType);
    Assert.assertEquals(null, readWorkbook.getCustomObject());
    Assert.assertEquals(null, customConverterList);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertTrue(customReadListenerList instanceof java.util.ArrayList);
    Assert.assertEquals(null, inputStream);
    Assert.assertEquals(0, customReadListenerList.size());
    Assert.assertEquals(null, mandatoryUseInputStream);
    Assert.assertEquals(null, readCacheSelector);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
    Assert.assertEquals(null, convertAllFiled);
    Assert.assertEquals(null, autoCloseStream);
    Assert.assertEquals(null, ignoreEmptyRow);
    Assert.assertEquals(null, file);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, headRowNumber);
    Assert.assertEquals(null, defaultReturnMap);
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, readCache);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
