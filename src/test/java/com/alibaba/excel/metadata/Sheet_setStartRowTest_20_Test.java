package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_setStartRowTest_20_Test {
//failed_compile   @Test
//  public void setStartRowTest() throws Exception {
//    // Arrange
//    Sheet sheet = new Sheet(0);
//    int startRow = 0;
//
//    // Act
//    sheet.setStartRow(startRow);
//
//    // Assert
//    Class<BaseRowModel> clazz = sheet.getClazz();
//    List<List<String>> head = sheet.getHead();
//    String toStringResult = sheet.toString();
//    int headLineMun = sheet.getHeadLineMun();
//    int sheetNo = sheet.getSheetNo();
//    String sheetName = sheet.getSheetName();
//    TableStyle tableStyle = sheet.getTableStyle();
//    Boolean autoWidth = sheet.getAutoWidth();
//    int startRow1 = sheet.getStartRow();
//    Map<Integer, Integer> columnWidthMap = sheet.getColumnWidthMap();
//    Assert.assertEquals(null, clazz);
//    Assert.assertTrue(columnWidthMap instanceof java.util.HashMap);
//    Assert.assertEquals(0, startRow1);
//    Assert.assertEquals(0, columnWidthMap.size());
//    Assert.assertEquals(Boolean.valueOf(false), autoWidth);
//    Assert.assertEquals(null, tableStyle);
//    Assert.assertEquals(null, sheetName);
//    Assert.assertEquals(0, sheetNo);
//    Assert.assertEquals(0, headLineMun);
//    Assert.assertEquals(
//        "Sheet{headLineMun=0, sheetNo=0, sheetName='null', clazz=null, head=null, tableStyle=null, columnWidthMap={}}",
//        toStringResult);
//    Assert.assertEquals(null, head);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
