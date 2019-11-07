package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_getInTest_2_Test {
  @Test
  public void getInTest() throws Exception {
    // Arrange
    AnalysisParam analysisParam = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "aaaaa");

    // Act
    InputStream actual = analysisParam.getIn();

    // Assert
    Assert.assertTrue(actual instanceof ByteArrayInputStream);
    int availableResult = actual.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
