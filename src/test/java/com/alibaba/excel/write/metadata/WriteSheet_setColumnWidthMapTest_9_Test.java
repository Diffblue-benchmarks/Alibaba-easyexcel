package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteSheet;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_setColumnWidthMapTest_9_Test {
  @Test
  public void setColumnWidthMapTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Integer integer = new Integer(1);
    hashMap.put(integer, new Integer(1));

    // Act
    writeSheet.setColumnWidthMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals(Integer.valueOf(1), hashMap.get(Integer.valueOf(1)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
