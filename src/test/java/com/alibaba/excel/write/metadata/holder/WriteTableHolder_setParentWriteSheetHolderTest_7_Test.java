package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTableHolder_setParentWriteSheetHolderTest_7_Test {
  @Test
  public void setParentWriteSheetHolderTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));
    WriteSheetHolder writeSheetHolder = (WriteSheetHolder) null;

    // Act
    writeTableHolder.setParentWriteSheetHolder(writeSheetHolder);

    // Assert
    Assert.assertEquals(null, writeSheetHolder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
