package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AnalysisParam_setExcelTypeEnumTest_6_Test {
  @Test
  public void setExcelTypeEnumTest() throws Exception {
    // Arrange
    AnalysisParam analysisParam = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "aaaaa");
    ExcelTypeEnum excelTypeEnum = ExcelTypeEnum.XLS;

    // Act
    analysisParam.setExcelTypeEnum(excelTypeEnum);

    // Assert
    Object customContent = analysisParam.getCustomContent();
    String toStringResult = analysisParam.toString();
    ExcelTypeEnum excelTypeEnum1 = analysisParam.getExcelTypeEnum();
    InputStream in = analysisParam.getIn();
    Assert.assertTrue(customContent instanceof String);
    Assert.assertTrue(in instanceof ByteArrayInputStream);
    Assert.assertEquals("aaaaa", customContent);
    int availableResult = in.available();
    Assert.assertEquals(ExcelTypeEnum.XLS, excelTypeEnum1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(in.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
