package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getTemplateFileTest_11_Test {
  @Test
  public void getTemplateFileTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    File actual = writeWorkbook.getTemplateFile();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
