package com.alibaba.excel.write.handler;

import com.alibaba.excel.write.handler.DefaultWriteHandlerLoader;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultWriteHandlerLoader_loadDefaultHandlerTest_2_Test {
  @Test
  public void loadDefaultHandlerTest() throws Exception {
    // Arrange and Act
    List<WriteHandler> actual = DefaultWriteHandlerLoader.loadDefaultHandler();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(1, actual.size());
    WriteHandler getResult = actual.get(0);
    Assert.assertTrue(getResult instanceof HorizontalCellStyleStrategy);
    Assert.assertNotNull(((HorizontalCellStyleStrategy) getResult).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
