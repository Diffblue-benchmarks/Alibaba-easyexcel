package com.alibaba.excel.write.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_setAutoCloseStreamTest_19_Test {
  @Test
  public void setAutoCloseStreamTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();
    Boolean autoCloseStream = new Boolean(true);

    // Act
    writeWorkbook.setAutoCloseStream(autoCloseStream);

    // Assert
    ExcelTypeEnum excelType = writeWorkbook.getExcelType();
    Class clazz = writeWorkbook.getClazz();
    List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = writeWorkbook
        .getCustomWriteHandlerList();
    String toStringResult = writeWorkbook.toString();
    InputStream templateInputStream = writeWorkbook.getTemplateInputStream();
    File file = writeWorkbook.getFile();
    OutputStream outputStream = writeWorkbook.getOutputStream();
    Boolean autoCloseStream1 = writeWorkbook.getAutoCloseStream();
    Boolean convertAllFiled = writeWorkbook.getConvertAllFiled();
    com.alibaba.excel.event.WriteHandler writeHandler = writeWorkbook.getWriteHandler();
    List<List<String>> head = writeWorkbook.getHead();
    Boolean autoTrim = writeWorkbook.getAutoTrim();
    Boolean needHead = writeWorkbook.getNeedHead();
    Integer relativeHeadRowIndex = writeWorkbook.getRelativeHeadRowIndex();
    Boolean mandatoryUseInputStream = writeWorkbook.getMandatoryUseInputStream();
    Boolean use1904windowing = writeWorkbook.getUse1904windowing();
    List<Converter> customConverterList = writeWorkbook.getCustomConverterList();
    Assert.assertEquals(null, excelType);
    Assert.assertEquals(null, writeWorkbook.getTemplateFile());
    Assert.assertEquals(null, customConverterList);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertEquals(null, mandatoryUseInputStream);
    Assert.assertEquals(null, relativeHeadRowIndex);
    Assert.assertEquals(null, needHead);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
    Assert.assertEquals(null, writeHandler);
    Assert.assertEquals(null, convertAllFiled);
    Assert.assertEquals(Boolean.valueOf(true), autoCloseStream1);
    Assert.assertEquals(null, outputStream);
    Assert.assertEquals(null, file);
    Assert.assertEquals(null, templateInputStream);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(0, customWriteHandlerList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
