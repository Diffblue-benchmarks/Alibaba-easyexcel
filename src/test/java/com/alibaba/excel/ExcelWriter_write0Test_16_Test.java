package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_write0Test_16_Test {
  @Test
  public void write0Test() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("aaaaa", null, new ByteArrayOutputStream()));
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaak");
    Sheet sheet = new Sheet(1);

    // Act
    ExcelWriter actual = excelWriter.write0(arrayList, sheet);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
