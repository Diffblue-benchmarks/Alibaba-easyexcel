package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_EasyExcelFactoryTest_27_Test {
  @Test
  public void EasyExcelFactoryTest() throws Exception {
    // Arrange and Act
    EasyExcelFactory easyExcelFactory = new EasyExcelFactory();

    // Assert
    Assert.assertNotNull(easyExcelFactory.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
