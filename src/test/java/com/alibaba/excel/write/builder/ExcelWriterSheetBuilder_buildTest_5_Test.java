package com.alibaba.excel.write.builder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_buildTest_5_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act
    WriteSheet actual = excelWriterSheetBuilder.build();

    // Assert
    String toStringResult = actual.toString();
    List<WriteHandler> customWriteHandlerList = actual.getCustomWriteHandlerList();
    String sheetName = actual.getSheetName();
    TableStyle tableStyle = actual.getTableStyle();
    Integer sheetNo = actual.getSheetNo();
    List<List<String>> head = actual.getHead();
    Boolean autoTrim = actual.getAutoTrim();
    Boolean needHead = actual.getNeedHead();
    Integer relativeHeadRowIndex = actual.getRelativeHeadRowIndex();
    Boolean use1904windowing = actual.getUse1904windowing();
    List<Converter> customConverterList = actual.getCustomConverterList();
    Map<Integer, Integer> columnWidthMap = actual.getColumnWidthMap();
    Assert.assertNotNull(toStringResult);
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
    Assert.assertEquals(null, sheetName);
    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    Assert.assertEquals(0, customWriteHandlerList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
