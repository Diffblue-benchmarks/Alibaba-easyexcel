package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteBasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteBasicParameter_getCustomWriteHandlerListTest_1_Test {
  @Test
  public void getCustomWriteHandlerListTest() throws Exception {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    List<WriteHandler> actual = writeBasicParameter.getCustomWriteHandlerList();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
