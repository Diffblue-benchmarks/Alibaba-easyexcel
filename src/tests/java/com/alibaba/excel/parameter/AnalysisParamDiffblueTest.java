package com.alibaba.excel.parameter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;

public class AnalysisParamDiffblueTest {
  @Test(timeout=10000)
  public void setInTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    AnalysisParam analysisParam = new AnalysisParam(new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS, "foo");
    byte[] byteArray1 = new byte[24];
    Arrays.fill(byteArray1, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray1);

    // Act
    analysisParam.setIn(byteArrayInputStream);

    // Assert
    assertSame(byteArrayInputStream, analysisParam.getIn());
  }

  @Test(timeout=10000)
  public void getInTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act and Assert
    assertSame(byteArrayInputStream, (new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "foo")).getIn());
  }

  @Test(timeout=10000)
  public void getExcelTypeEnumTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(ExcelTypeEnum.XLS,
        (new AnalysisParam(new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS, "foo")).getExcelTypeEnum());
  }

  @Test(timeout=10000)
  public void setExcelTypeEnumTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    AnalysisParam analysisParam = new AnalysisParam(new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS, "foo");

    // Act
    analysisParam.setExcelTypeEnum(ExcelTypeEnum.XLS);

    // Assert
    assertEquals(ExcelTypeEnum.XLS, analysisParam.getExcelTypeEnum());
  }

  @Test(timeout=10000)
  public void setCustomContentTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    AnalysisParam analysisParam = new AnalysisParam(new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS, "foo");

    // Act
    analysisParam.setCustomContent("foo");

    // Assert
    assertTrue(analysisParam.getCustomContent() instanceof String);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act
    AnalysisParam actualAnalysisParam = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "foo");

    // Assert
    Object customContent = actualAnalysisParam.getCustomContent();
    ExcelTypeEnum actualExcelTypeEnum = actualAnalysisParam.getExcelTypeEnum();
    assertTrue(customContent instanceof String);
    assertSame(byteArrayInputStream, actualAnalysisParam.getIn());
    assertEquals(ExcelTypeEnum.XLS, actualExcelTypeEnum);
  }

  @Test(timeout=10000)
  public void getCustomContentTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals("foo",
        (new AnalysisParam(new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS, "foo")).getCustomContent());
  }
}

