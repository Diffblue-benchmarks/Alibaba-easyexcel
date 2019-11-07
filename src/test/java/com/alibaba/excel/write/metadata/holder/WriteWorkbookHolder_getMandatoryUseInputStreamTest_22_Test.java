package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_getMandatoryUseInputStreamTest_22_Test {
  @Test
  public void getMandatoryUseInputStreamTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    Boolean actual = writeWorkbookHolder.getMandatoryUseInputStream();

    // Assert
    Assert.assertEquals(Boolean.valueOf(false), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
