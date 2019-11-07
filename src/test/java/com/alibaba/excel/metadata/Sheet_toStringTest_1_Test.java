package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_toStringTest_1_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    String actual = sheet.toString();

    // Assert
    Assert.assertEquals(
        "Sheet{headLineMun=0, sheetNo=0, sheetName='null', clazz=null, head=null, tableStyle=null, columnWidthMap={}}",
        actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
