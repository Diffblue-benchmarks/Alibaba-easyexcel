package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_getWriteWorkbookTest_9_Test {
  @Test
  public void getWriteWorkbookTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    WriteWorkbook actual = writeWorkbookHolder.getWriteWorkbook();

    // Assert
    Class clazz = actual.getClazz();
    List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = actual.getCustomWriteHandlerList();
    String toStringResult = actual.toString();
    InputStream templateInputStream = actual.getTemplateInputStream();
    File file = actual.getFile();
    OutputStream outputStream = actual.getOutputStream();
    Boolean autoCloseStream = actual.getAutoCloseStream();
    Boolean convertAllFiled = actual.getConvertAllFiled();
    com.alibaba.excel.event.WriteHandler writeHandler = actual.getWriteHandler();
    List<List<String>> head = actual.getHead();
    Boolean autoTrim = actual.getAutoTrim();
    Boolean needHead = actual.getNeedHead();
    Integer relativeHeadRowIndex = actual.getRelativeHeadRowIndex();
    Boolean mandatoryUseInputStream = actual.getMandatoryUseInputStream();
    Boolean use1904windowing = actual.getUse1904windowing();
    List<Converter> customConverterList = actual.getCustomConverterList();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, actual.getTemplateFile());
    Assert.assertEquals(null, customConverterList);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertEquals(null, mandatoryUseInputStream);
    Assert.assertEquals(null, relativeHeadRowIndex);
    Assert.assertEquals(null, needHead);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
    Assert.assertEquals(null, writeHandler);
    Assert.assertEquals(null, convertAllFiled);
    Assert.assertEquals(null, autoCloseStream);
    Assert.assertEquals(null, outputStream);
    Assert.assertEquals(null, file);
    Assert.assertEquals(null, templateInputStream);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    Assert.assertEquals(0, customWriteHandlerList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
