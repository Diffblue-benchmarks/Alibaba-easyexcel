package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxHandlerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxHandlerFactory_XlsxHandlerFactoryTest_2_Test {
  @Test
  public void XlsxHandlerFactoryTest() throws Exception {
    // Arrange and Act
    XlsxHandlerFactory xlsxHandlerFactory = new XlsxHandlerFactory();

    // Assert
    Assert.assertNotNull(xlsxHandlerFactory.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
