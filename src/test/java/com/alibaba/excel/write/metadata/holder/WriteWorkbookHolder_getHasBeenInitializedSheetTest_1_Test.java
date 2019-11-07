package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_getHasBeenInitializedSheetTest_1_Test {
  @Test
  public void getHasBeenInitializedSheetTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    Map<Integer, WriteSheetHolder> actual = writeWorkbookHolder.getHasBeenInitializedSheet();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
