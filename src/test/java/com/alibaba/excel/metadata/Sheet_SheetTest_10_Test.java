package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_SheetTest_10_Test {
//failed_compile   @Test
//  public void SheetTest() throws Exception {
//    // Arrange
//    int sheetNo = 0;
//    int headLineMun = 0;
//    Class<BaseRowModel> clazz = (Class<BaseRowModel>) null;
//
//    // Act
//    Sheet sheet = new Sheet(sheetNo, headLineMun, clazz);
//
//    // Assert
//    Class<BaseRowModel> clazz1 = sheet.getClazz();
//    List<List<String>> head = sheet.getHead();
//    String toStringResult = sheet.toString();
//    int headLineMun1 = sheet.getHeadLineMun();
//    int sheetNo1 = sheet.getSheetNo();
//    String sheetName = sheet.getSheetName();
//    TableStyle tableStyle = sheet.getTableStyle();
//    Boolean autoWidth = sheet.getAutoWidth();
//    int startRow = sheet.getStartRow();
//    Map<Integer, Integer> columnWidthMap = sheet.getColumnWidthMap();
//    Assert.assertEquals(null, clazz1);
//    Assert.assertTrue(columnWidthMap instanceof java.util.HashMap);
//    Assert.assertEquals(0, startRow);
//    Assert.assertEquals(0, columnWidthMap.size());
//    Assert.assertEquals(Boolean.valueOf(false), autoWidth);
//    Assert.assertEquals(null, tableStyle);
//    Assert.assertEquals(null, sheetName);
//    Assert.assertEquals(0, sheetNo1);
//    Assert.assertEquals(0, headLineMun1);
//    Assert.assertEquals(
//        "Sheet{headLineMun=0, sheetNo=0, sheetName='null', clazz=null, head=null, tableStyle=null, columnWidthMap={}}",
//        toStringResult);
//    Assert.assertEquals(null, head);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
