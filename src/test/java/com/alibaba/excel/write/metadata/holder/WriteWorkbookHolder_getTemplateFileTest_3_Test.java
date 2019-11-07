package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_getTemplateFileTest_3_Test {
  @Test
  public void getTemplateFileTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    File actual = writeWorkbookHolder.getTemplateFile();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
