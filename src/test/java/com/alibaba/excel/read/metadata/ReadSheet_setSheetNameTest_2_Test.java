package com.alibaba.excel.read.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadSheet_setSheetNameTest_2_Test {
  @Test
  public void setSheetNameTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();
    String sheetName = "aaaaa";

    // Act
    readSheet.setSheetName(sheetName);

    // Assert
    Class clazz = readSheet.getClazz();
    List<List<String>> head = readSheet.getHead();
    Integer headRowNumber = readSheet.getHeadRowNumber();
    Boolean autoTrim = readSheet.getAutoTrim();
    String toStringResult = readSheet.toString();
    String sheetName1 = readSheet.getSheetName();
    List<ReadListener> customReadListenerList = readSheet.getCustomReadListenerList();
    Boolean use1904windowing = readSheet.getUse1904windowing();
    Integer sheetNo = readSheet.getSheetNo();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, readSheet.getCustomConverterList());
    Assert.assertEquals(null, sheetNo);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertTrue(customReadListenerList instanceof java.util.ArrayList);
    Assert.assertEquals("aaaaa", sheetName1);
    Assert.assertEquals(0, customReadListenerList.size());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, headRowNumber);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
