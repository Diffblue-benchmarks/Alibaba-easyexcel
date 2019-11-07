package com.alibaba.excel;

import com.alibaba.excel.EasyExcel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcel_EasyExcelTest_1_Test {
  @Test
  public void EasyExcelTest() throws Exception {
    // Arrange and Act
    EasyExcel easyExcel = new EasyExcel();

    // Assert
    Assert.assertNotNull(easyExcel.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
