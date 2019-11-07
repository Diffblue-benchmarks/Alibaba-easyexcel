package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_headTest_3_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");
    arrayList.add(arrayList1);

    // Act
    ExcelWriterTableBuilder actual = excelWriterTableBuilder.head(arrayList);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
