package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WriteSheetHolder_WriteSheetHolderTest_1_Test {
  @Test
  public void WriteSheetHolderTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new WriteSheetHolder(writeSheet, writeWorkbookHolder);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
