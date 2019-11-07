package com.alibaba.excel.write;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelBuilderImpl_addContentTest_1_Test {
  @Test
  public void addContentTest() throws Exception {
    // Arrange
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(new WriteWorkbook());
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(" error,at row:");
    WriteSheet writeSheet = new WriteSheet();
    WriteTable writeTable = new WriteTable();

    // Act
    excelBuilderImpl.addContent(arrayList, writeSheet, writeTable);

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
    Class clazz1 = writeTable.getClazz();
    List<List<String>> head1 = writeTable.getHead();
    Boolean autoTrim1 = writeTable.getAutoTrim();
    List<WriteHandler> customWriteHandlerList1 = writeTable.getCustomWriteHandlerList();
    String toStringResult1 = writeTable.toString();
    Boolean needHead1 = writeTable.getNeedHead();
    Integer relativeHeadRowIndex1 = writeTable.getRelativeHeadRowIndex();
    TableStyle tableStyle1 = writeTable.getTableStyle();
    Boolean use1904windowing1 = writeTable.getUse1904windowing();
    List<Converter> customConverterList1 = writeTable.getCustomConverterList();
    Assert.assertEquals(null, clazz1);
    Assert.assertEquals(Integer.valueOf(0), writeTable.getTableNo());
    Assert.assertEquals(null, customConverterList1);
    Assert.assertEquals(null, use1904windowing1);
    Assert.assertEquals(null, tableStyle1);
    Assert.assertEquals(null, relativeHeadRowIndex1);
    Assert.assertEquals(null, needHead1);
    Assert.assertNotNull(toStringResult1);
    Assert.assertTrue(customWriteHandlerList1 instanceof ArrayList);
    Assert.assertEquals(null, autoTrim1);
    Assert.assertEquals(0, customWriteHandlerList1.size());
    Assert.assertEquals(null, head1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
