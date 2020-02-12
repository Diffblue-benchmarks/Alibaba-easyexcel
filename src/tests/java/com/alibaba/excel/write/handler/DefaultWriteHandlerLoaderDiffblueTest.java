package com.alibaba.excel.write.handler;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class DefaultWriteHandlerLoaderDiffblueTest {
  @Test(timeout=10000)
  public void loadDefaultHandlerTest() {
    // Arrange
    List<WriteHandler> loadDefaultHandlerResult = DefaultWriteHandlerLoader.loadDefaultHandler(Boolean.valueOf(true));

    // Act
    List<WriteHandler> actualLoadDefaultHandlerResult = DefaultWriteHandlerLoader
        .loadDefaultHandler(Boolean.valueOf(false));

    // Assert
    assertEquals(1, loadDefaultHandlerResult.size());
    assertEquals(0, actualLoadDefaultHandlerResult.size());
  }
}

