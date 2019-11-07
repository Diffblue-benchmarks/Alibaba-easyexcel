package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_AnalysisParamTest_4_Test {
  @Test
  public void AnalysisParamTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    ExcelTypeEnum excelTypeEnum = ExcelTypeEnum.XLS;
    String customContent = "aaaaa";

    // Act
    AnalysisParam analysisParam = new AnalysisParam(in, excelTypeEnum, customContent);

    // Assert
    String toStringResult = analysisParam.toString();
    ExcelTypeEnum excelTypeEnum1 = analysisParam.getExcelTypeEnum();
    InputStream in1 = analysisParam.getIn();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(in1 instanceof ByteArrayInputStream);
    Assert.assertEquals(ExcelTypeEnum.XLS, excelTypeEnum1);
    int availableResult = in1.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(in1.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
