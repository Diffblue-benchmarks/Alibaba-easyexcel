package com.alibaba.excel.write.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_setSheetNameTest_1_Test {
  @Test
  public void setSheetNameTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();
    String sheetName = "aaaaa";

    // Act
    writeSheet.setSheetName(sheetName);

    // Assert
    Class clazz = writeSheet.getClazz();
    String toStringResult = writeSheet.toString();
    List<WriteHandler> customWriteHandlerList = writeSheet.getCustomWriteHandlerList();
    String sheetName1 = writeSheet.getSheetName();
    TableStyle tableStyle = writeSheet.getTableStyle();
    Integer sheetNo = writeSheet.getSheetNo();
    List<List<String>> head = writeSheet.getHead();
    Boolean autoTrim = writeSheet.getAutoTrim();
    Boolean needHead = writeSheet.getNeedHead();
    Integer relativeHeadRowIndex = writeSheet.getRelativeHeadRowIndex();
    Boolean use1904windowing = writeSheet.getUse1904windowing();
    List<Converter> customConverterList = writeSheet.getCustomConverterList();
    Map<Integer, Integer> columnWidthMap = writeSheet.getColumnWidthMap();
    Assert.assertEquals(null, clazz);
    Assert.assertTrue(columnWidthMap instanceof java.util.HashMap);
    Assert.assertEquals(null, customConverterList);
    Assert.assertEquals(0, columnWidthMap.size());
    Assert.assertEquals(null, use1904windowing);
    Assert.assertEquals(null, relativeHeadRowIndex);
    Assert.assertEquals(null, needHead);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
    Assert.assertEquals(null, sheetNo);
    Assert.assertEquals(null, tableStyle);
    Assert.assertEquals("aaaaa", sheetName1);
    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, customWriteHandlerList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
