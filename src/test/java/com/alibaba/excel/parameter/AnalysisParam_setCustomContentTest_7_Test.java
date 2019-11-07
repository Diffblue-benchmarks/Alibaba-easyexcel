package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_setCustomContentTest_7_Test {
  @Test
  public void setCustomContentTest() throws Exception {
    // Arrange
    AnalysisParam analysisParam = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "aaaaa");
    String customContent = "aaaaa";

    // Act
    analysisParam.setCustomContent(customContent);

    // Assert
    Object customContent1 = analysisParam.getCustomContent();
    String toStringResult = analysisParam.toString();
    ExcelTypeEnum excelTypeEnum = analysisParam.getExcelTypeEnum();
    InputStream in = analysisParam.getIn();
    Assert.assertTrue(customContent1 instanceof String);
    Assert.assertTrue(in instanceof ByteArrayInputStream);
    Assert.assertEquals("aaaaa", customContent1);
    int availableResult = in.available();
    Assert.assertEquals(ExcelTypeEnum.XLS, excelTypeEnum);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(in.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
