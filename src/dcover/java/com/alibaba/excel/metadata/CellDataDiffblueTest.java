package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.enums.CellDataTypeEnum;
import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CellDataDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void setDataFormatStringTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setDataFormatString("foo");

    // Assert
    assertEquals("foo", cellData.getDataFormatString());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getType());
  }

  @Test(timeout=10000)
  public void getDataFormatTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getDataFormat());
  }

  @Test(timeout=10000)
  public void checkEmptyTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.checkEmpty();

    // Assert
    assertEquals(CellDataTypeEnum.EMPTY, cellData.getType());
  }

  @Test(timeout=10000)
  public void setNumberValueTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setNumberValue(null);

    // Assert
    assertNull(cellData.getNumberValue());
  }

  @Test(timeout=10000)
  public void constructorTest10() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>("foo");

    // Assert
    String actualStringValue = actualCellData.getStringValue();
    CellDataTypeEnum actualType = actualCellData.getType();
    assertEquals("foo", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualCellData.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }

  @Test(timeout=10000)
  public void setImageValueTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    cellData.setImageValue(byteArray);

    // Assert
    assertSame(byteArray, cellData.getImageValue());
  }

  @Test(timeout=10000)
  public void constructorTest9() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>("foo", "foo");

    // Assert
    Object data = actualCellData.getData();
    String actualFormulaValue = actualCellData.getFormulaValue();
    assertEquals(Boolean.valueOf(true), actualCellData.getFormula());
    assertEquals("foo", actualFormulaValue);
    assertTrue(data instanceof String);
  }

  @Test(timeout=10000)
  public void constructorTest8() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>(CellDataTypeEnum.STRING, "foo");

    // Assert
    String actualStringValue = actualCellData.getStringValue();
    CellDataTypeEnum actualType = actualCellData.getType();
    assertEquals("foo", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualCellData.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }

  @Test(timeout=10000)
  public void getDataFormatStringTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getDataFormatString());
  }

  @Test(timeout=10000)
  public void setDataFormatTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setDataFormat(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), cellData.getDataFormat());
  }

  @Test(timeout=10000)
  public void getNumberValueTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getNumberValue());
  }

  @Test(timeout=10000)
  public void setFormulaTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setFormula(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), cellData.getFormula());
  }

  @Test(timeout=10000)
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getData());
  }

  @Test(timeout=10000)
  public void constructorTest7() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>();

    // Assert
    String actualStringValue = actualCellData.getStringValue();
    Boolean actualBooleanValue = actualCellData.getBooleanValue();
    String actualDataFormatString = actualCellData.getDataFormatString();
    String actualToStringResult = actualCellData.toString();
    Object actualData = actualCellData.getData();
    String actualFormulaValue = actualCellData.getFormulaValue();
    Integer actualDataFormat = actualCellData.getDataFormat();
    CellDataTypeEnum actualType = actualCellData.getType();
    BigDecimal actualNumberValue = actualCellData.getNumberValue();
    Boolean actualFormula = actualCellData.getFormula();
    assertNull(actualStringValue);
    assertNull(actualCellData.getImageValue());
    assertNull(actualFormula);
    assertNull(actualNumberValue);
    assertNull(actualType);
    assertNull(actualDataFormat);
    assertNull(actualFormulaValue);
    assertNull(actualData);
    assertEquals("empty", actualToStringResult);
    assertNull(actualDataFormatString);
    assertNull(actualBooleanValue);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("empty", (new CellData<Object>()).toString());
  }

  @Test(timeout=10000)
  public void getImageValueTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getImageValue());
  }

  @Test(timeout=10000)
  public void setFormulaValueTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setFormulaValue("foo");

    // Assert
    assertEquals("foo", cellData.getFormulaValue());
  }

  @Test(timeout=10000)
  public void getFormulaValueTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getFormulaValue());
  }

  @Test(timeout=10000)
  public void setBooleanValueTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setBooleanValue(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), cellData.getBooleanValue());
  }

  @Test(timeout=10000)
  public void constructorTest6() {
    // Arrange, Act and Assert
    assertTrue((new CellData<Object>((Object) "foo")).getData() instanceof String);
  }

  @Test(timeout=10000)
  public void setStringValueTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setStringValue("foo");

    // Assert
    assertEquals("foo", cellData.getStringValue());
  }

  @Test(timeout=10000)
  public void getBooleanValueTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getBooleanValue());
  }

  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new CellData<Object>((BigDecimal) null);
  }

  @Test(timeout=10000)
  public void getFormulaTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getFormula());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setType(CellDataTypeEnum.STRING);

    // Assert
    assertEquals(CellDataTypeEnum.STRING, cellData.getType());
  }

  @Test(timeout=10000)
  public void setDataTest() {
    // Arrange
    CellData<Object> cellData = new CellData<Object>();

    // Act
    cellData.setData("foo");

    // Assert
    assertTrue(cellData.getData() instanceof String);
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    CellData<Object> actualCellData = new CellData<Object>(byteArray);

    // Assert
    CellDataTypeEnum actualType = actualCellData.getType();
    Boolean actualFormula = actualCellData.getFormula();
    assertEquals(24, actualCellData.getImageValue().length);
    assertEquals(Boolean.valueOf(false), actualFormula);
    assertEquals(CellDataTypeEnum.IMAGE, actualType);
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>(CellDataTypeEnum.STRING);

    // Assert
    CellDataTypeEnum actualType = actualCellData.getType();
    assertEquals(Boolean.valueOf(false), actualCellData.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>(Boolean.valueOf(true));

    // Assert
    Boolean actualBooleanValue = actualCellData.getBooleanValue();
    CellDataTypeEnum actualType = actualCellData.getType();
    assertEquals(Boolean.valueOf(false), actualCellData.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(true), actualBooleanValue);
  }

  @Test(timeout=10000)
  public void getStringValueTest() {
    // Arrange, Act and Assert
    assertNull((new CellData<Object>()).getStringValue());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    CellData<Object> actualCellData = new CellData<Object>(new CellData<Object>());

    // Assert
    String actualStringValue = actualCellData.getStringValue();
    Boolean actualBooleanValue = actualCellData.getBooleanValue();
    String actualDataFormatString = actualCellData.getDataFormatString();
    Object actualData = actualCellData.getData();
    String actualFormulaValue = actualCellData.getFormulaValue();
    Integer actualDataFormat = actualCellData.getDataFormat();
    CellDataTypeEnum actualType = actualCellData.getType();
    BigDecimal actualNumberValue = actualCellData.getNumberValue();
    Boolean actualFormula = actualCellData.getFormula();
    assertNull(actualStringValue);
    assertNull(actualCellData.getImageValue());
    assertNull(actualFormula);
    assertNull(actualNumberValue);
    assertNull(actualType);
    assertNull(actualDataFormat);
    assertNull(actualFormulaValue);
    assertNull(actualData);
    assertNull(actualDataFormatString);
    assertNull(actualBooleanValue);
  }
}

