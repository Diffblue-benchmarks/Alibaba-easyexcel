package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_writeTest_6_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("aaaaa", null, new ByteArrayOutputStream()));
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaak");
    WriteSheet writeSheet = new WriteSheet();
    WriteTable writeTable = new WriteTable();

    // Act
    ExcelWriter actual = excelWriter.write(arrayList, writeSheet, writeTable);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
