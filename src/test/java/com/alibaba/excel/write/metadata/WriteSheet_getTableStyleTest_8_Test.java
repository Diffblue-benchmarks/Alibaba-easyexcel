package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_getTableStyleTest_8_Test {
  @Test
  public void getTableStyleTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    TableStyle actual = writeSheet.getTableStyle();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
