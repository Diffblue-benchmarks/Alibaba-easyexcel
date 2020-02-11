package com.alibaba.excel.parameter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Test;

public class GenerateParamDiffblueTest {
  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new GenerateParam("name", null, null)).getType());
  }

  @Test(timeout=10000)
  public void setClazzTest() {
    // Arrange
    GenerateParam generateParam = new GenerateParam("name", null, null);

    // Act
    generateParam.setClazz(null);

    // Assert
    assertNull(generateParam.getClazz());
  }

  @Test(timeout=10000)
  public void setNeedHeadTest() {
    // Arrange
    GenerateParam generateParam = new GenerateParam("name", null, null);

    // Act
    generateParam.setNeedHead(true);

    // Assert
    assertTrue(generateParam.isNeedHead());
  }

  @Test(timeout=10000)
  public void getOutputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new GenerateParam("name", null, null)).getOutputStream());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    GenerateParam generateParam = new GenerateParam("name", null, null);

    // Act
    generateParam.setType(ExcelTypeEnum.XLS);

    // Assert
    assertEquals(ExcelTypeEnum.XLS, generateParam.getType());
  }

  @Test(timeout=10000)
  public void getSheetNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new GenerateParam("name", null, null)).getSheetName());
  }

  @Test(timeout=10000)
  public void isNeedHeadTest() {
    // Arrange, Act and Assert
    assertTrue((new GenerateParam("name", null, null)).isNeedHead());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GenerateParam actualGenerateParam = new GenerateParam("name", null, null);

    // Assert
    Class actualClazz = actualGenerateParam.getClazz();
    boolean actualIsNeedHeadResult = actualGenerateParam.isNeedHead();
    String actualSheetName = actualGenerateParam.getSheetName();
    assertNull(actualClazz);
    assertNull(actualGenerateParam.getOutputStream());
    assertEquals("name", actualSheetName);
    assertTrue(actualIsNeedHeadResult);
  }

  @Test(timeout=10000)
  public void setSheetNameTest() {
    // Arrange
    GenerateParam generateParam = new GenerateParam("name", null, null);

    // Act
    generateParam.setSheetName("name");

    // Assert
    assertEquals("name", generateParam.getSheetName());
  }

  @Test(timeout=10000)
  public void getClazzTest() {
    // Arrange, Act and Assert
    assertNull((new GenerateParam("name", null, null)).getClazz());
  }

  @Test(timeout=10000)
  public void setOutputStreamTest() {
    // Arrange
    GenerateParam generateParam = new GenerateParam("name", null, null);

    // Act
    generateParam.setOutputStream(null);

    // Assert
    assertNull(generateParam.getOutputStream());
  }
}

