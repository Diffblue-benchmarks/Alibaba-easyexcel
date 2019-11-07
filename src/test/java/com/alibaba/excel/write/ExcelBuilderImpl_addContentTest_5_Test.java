package com.alibaba.excel.write;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelBuilderImpl_addContentTest_5_Test {
  @Test
  public void addContentTest() throws Exception {
    // Arrange
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(new WriteWorkbook());
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(" error,at row:");
    WriteSheet writeSheet = new WriteSheet();

    // Act
    excelBuilderImpl.addContent(arrayList, writeSheet);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    Object getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals(" error,at row:", getResult);
    Class clazz = writeSheet.getClazz();
    String toStringResult = writeSheet.toString();
    List<WriteHandler> customWriteHandlerList = writeSheet.getCustomWriteHandlerList();
    String sheetName = writeSheet.getSheetName();
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
    Assert.assertEquals(Integer.valueOf(0), sheetNo);
    Assert.assertEquals(null, tableStyle);
    Assert.assertEquals(null, sheetName);
    Assert.assertTrue(customWriteHandlerList instanceof ArrayList);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, customWriteHandlerList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
