package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_setAutoWidthTest_2_Test {
//failed_compile   @Test
//  public void setAutoWidthTest() throws Exception {
//    // Arrange
//    Sheet sheet = new Sheet(0);
//    Boolean autoWidth = new Boolean(true);
//
//    // Act
//    sheet.setAutoWidth(autoWidth);
//
//    // Assert
//    Class<BaseRowModel> clazz = sheet.getClazz();
//    List<List<String>> head = sheet.getHead();
//    String toStringResult = sheet.toString();
//    int headLineMun = sheet.getHeadLineMun();
//    int sheetNo = sheet.getSheetNo();
//    String sheetName = sheet.getSheetName();
//    TableStyle tableStyle = sheet.getTableStyle();
//    Boolean autoWidth1 = sheet.getAutoWidth();
//    int startRow = sheet.getStartRow();
//    Map<Integer, Integer> columnWidthMap = sheet.getColumnWidthMap();
//    Assert.assertEquals(null, clazz);
//    Assert.assertTrue(columnWidthMap instanceof java.util.HashMap);
//    Assert.assertEquals(0, startRow);
//    Assert.assertEquals(0, columnWidthMap.size());
//    Assert.assertEquals(Boolean.valueOf(true), autoWidth1);
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
