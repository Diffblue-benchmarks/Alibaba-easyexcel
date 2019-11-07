package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTableHolder_holderTypeTest_1_Test {
  @Test
  public void holderTypeTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));

    // Act
    HolderEnum actual = writeTableHolder.holderType();

    // Assert
    Assert.assertEquals(HolderEnum.TABLE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
