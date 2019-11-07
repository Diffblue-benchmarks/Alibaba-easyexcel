package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getFileTest_3_Test {
  @Test
  public void getFileTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    File actual = writeWorkbook.getFile();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
