package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_headTest_4_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("Must use 'EasyExcelFactory.read().sheet()' to call this method");
    arrayList.add(arrayList1);

    // Act
    excelReaderSheetBuilder.head(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    List<String> getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof ArrayList);
    Assert.assertEquals(1, getResult.size());
    Assert.assertEquals("Must use 'EasyExcelFactory.read().sheet()' to call this method", getResult.get(0));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
