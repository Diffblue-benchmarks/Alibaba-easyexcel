package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setTemplateLastRowMapTest_15_Test {
  @Test
  public void setTemplateLastRowMapTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Integer integer = new Integer(8);
    hashMap.put(integer, new Integer(8));

    // Act
    writeWorkbookHolder.setTemplateLastRowMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals(Integer.valueOf(8), hashMap.get(Integer.valueOf(8)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
