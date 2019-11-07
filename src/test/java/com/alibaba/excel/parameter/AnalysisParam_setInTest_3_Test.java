package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_setInTest_3_Test {
  @Test
  public void setInTest() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    AnalysisParam analysisParam = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");

    // Act
    analysisParam.setIn(byteArrayInputStream);

    // Assert
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
