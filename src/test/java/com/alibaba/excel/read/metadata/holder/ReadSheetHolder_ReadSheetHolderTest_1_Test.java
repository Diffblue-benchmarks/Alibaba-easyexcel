package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.holder.ReadSheetHolder;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReadSheetHolder_ReadSheetHolderTest_1_Test {
  @Test
  public void ReadSheetHolderTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();
    ReadWorkbookHolder readWorkbookHolder = (ReadWorkbookHolder) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ReadSheetHolder(readSheet, readWorkbookHolder);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
