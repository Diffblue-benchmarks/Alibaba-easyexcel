package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getTemplateInputStreamTest_7_Test {
  @Test
  public void getTemplateInputStreamTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    InputStream actual = writeWorkbook.getTemplateInputStream();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
