package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_getCustomContentTest_1_Test {
  @Test
  public void getCustomContentTest() throws Exception {
    // Arrange
    AnalysisParam analysisParam = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "aaaaa");

    // Act
    Object actual = analysisParam.getCustomContent();

    // Assert
    Assert.assertTrue(actual instanceof String);
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
