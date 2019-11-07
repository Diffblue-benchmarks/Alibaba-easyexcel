package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_getSheetNameTest_3_Test {
  @Test
  public void getSheetNameTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    String actual = writeSheet.getSheetName();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
