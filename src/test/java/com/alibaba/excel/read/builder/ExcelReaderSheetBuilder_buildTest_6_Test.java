package com.alibaba.excel.read.builder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_buildTest_6_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act
    ReadSheet actual = excelReaderSheetBuilder.build();

    // Assert
    Class clazz = actual.getClazz();
    List<List<String>> head = actual.getHead();
    Integer headRowNumber = actual.getHeadRowNumber();
    Boolean autoTrim = actual.getAutoTrim();
    String toStringResult = actual.toString();
    String sheetName = actual.getSheetName();
    List<ReadListener> customReadListenerList = actual.getCustomReadListenerList();
    Boolean use1904windowing = actual.getUse1904windowing();
    Integer sheetNo = actual.getSheetNo();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, actual.getCustomConverterList());
    Assert.assertEquals(null, sheetNo);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertTrue(customReadListenerList instanceof java.util.ArrayList);
    Assert.assertEquals(null, sheetName);
    Assert.assertEquals(0, customReadListenerList.size());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, headRowNumber);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
