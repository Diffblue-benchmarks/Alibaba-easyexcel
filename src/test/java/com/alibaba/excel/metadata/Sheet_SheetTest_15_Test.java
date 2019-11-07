package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_SheetTest_15_Test {
//failed_compile   @Test
//  public void SheetTest() throws Exception {
//    // Arrange
//    int sheetNo = 0;
//    int headLineMun = 0;
//    Class<BaseRowModel> clazz = (Class<BaseRowModel>) null;
//    String sheetName = "aaaaa";
//    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
//    ArrayList<String> arrayList1 = new ArrayList<String>();
//    arrayList1.add("aaaaa");
//    arrayList.add(arrayList1);
//
//    // Act
//    Sheet sheet = new Sheet(sheetNo, headLineMun, clazz, sheetName, arrayList);
//
//    // Assert
//    Class<BaseRowModel> clazz1 = sheet.getClazz();
//    List<List<String>> head = sheet.getHead();
//    String toStringResult = sheet.toString();
//    int headLineMun1 = sheet.getHeadLineMun();
//    int sheetNo1 = sheet.getSheetNo();
//    String sheetName1 = sheet.getSheetName();
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
//    Assert.assertEquals("aaaaa", sheetName1);
//    Assert.assertEquals(0, sheetNo1);
//    Assert.assertEquals(0, headLineMun1);
//    Assert.assertEquals(
//        "Sheet{headLineMun=0, sheetNo=0, sheetName='aaaaa', clazz=null, head=[[aaaaa]], tableStyle=null, columnWidthMap={}}",
//        toStringResult);
//    Assert.assertTrue(head instanceof ArrayList);
//    Assert.assertEquals(1, head.size());
//    List<String> getResult = head.get(0);
//    Assert.assertTrue(getResult instanceof ArrayList);
//    Assert.assertEquals(1, getResult.size());
//    Assert.assertEquals("aaaaa", getResult.get(0));
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
