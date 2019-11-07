package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setHasBeenInitializedSheetTest_20_Test {
  @Test
  public void setHasBeenInitializedSheetTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    HashMap<Integer, WriteSheetHolder> hashMap = new HashMap<Integer, WriteSheetHolder>();
    hashMap.put(new Integer(8), null);

    // Act
    writeWorkbookHolder.setHasBeenInitializedSheet(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertTrue(hashMap.containsKey(Integer.valueOf(8)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
