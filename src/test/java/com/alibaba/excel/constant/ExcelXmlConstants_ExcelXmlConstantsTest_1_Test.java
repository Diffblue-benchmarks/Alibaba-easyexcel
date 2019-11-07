package com.alibaba.excel.constant;

import com.alibaba.excel.constant.ExcelXmlConstants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelXmlConstants_ExcelXmlConstantsTest_1_Test {
  @Test
  public void ExcelXmlConstantsTest() throws Exception {
    // Arrange and Act
    ExcelXmlConstants excelXmlConstants = new ExcelXmlConstants();

    // Assert
    Assert.assertNotNull(excelXmlConstants.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
