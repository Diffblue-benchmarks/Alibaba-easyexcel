package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_getExcelTypeEnumTest_5_Test {
  @Test
  public void getExcelTypeEnumTest() throws Exception {
    // Arrange
    AnalysisParam analysisParam = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "aaaaa");

    // Act
    ExcelTypeEnum actual = analysisParam.getExcelTypeEnum();

    // Assert
    Assert.assertEquals(ExcelTypeEnum.XLS, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
