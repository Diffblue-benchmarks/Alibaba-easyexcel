package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_holderTypeTest_4_Test {
  @Test
  public void holderTypeTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    HolderEnum actual = writeWorkbookHolder.holderType();

    // Assert
    Assert.assertEquals(HolderEnum.WORKBOOK, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
