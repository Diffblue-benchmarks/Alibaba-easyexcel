package com.alibaba.excel.read.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadSheet_setSheetNoTest_4_Test {
  @Test
  public void setSheetNoTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();
    Integer sheetNo = new Integer(1);

    // Act
    readSheet.setSheetNo(sheetNo);

    // Assert
    Class clazz = readSheet.getClazz();
    List<List<String>> head = readSheet.getHead();
    Integer headRowNumber = readSheet.getHeadRowNumber();
    Boolean autoTrim = readSheet.getAutoTrim();
    String toStringResult = readSheet.toString();
    String sheetName = readSheet.getSheetName();
    List<ReadListener> customReadListenerList = readSheet.getCustomReadListenerList();
    Boolean use1904windowing = readSheet.getUse1904windowing();
    Integer sheetNo1 = readSheet.getSheetNo();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, readSheet.getCustomConverterList());
    Assert.assertEquals(Integer.valueOf(1), sheetNo1);
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
