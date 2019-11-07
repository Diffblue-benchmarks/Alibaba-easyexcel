package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_headTest_13_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    arrayList.add(arrayList1);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.head(arrayList);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
