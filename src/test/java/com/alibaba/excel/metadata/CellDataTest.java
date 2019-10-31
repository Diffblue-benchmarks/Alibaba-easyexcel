package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.math.BigDecimal;



public class CellDataTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void checkEmptyOutputVoid9991641941eb29c2daa() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    thisObj.checkEmpty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInput24OutputNotNull9994bb2147e23f67ecc() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputStringNotNullOutputNotNull999540fc2304777468a() {

    // Arrange
    final CellDataTypeEnum arg0 = CellDataTypeEnum.STRING;
    final String arg1 = "BooleanValue can not be null";

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertEquals("BooleanValue can not be null", actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.STRING, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputStringOutputNotNull99907531335fe327bdd() {

    // Arrange
    final CellDataTypeEnum arg0 = CellDataTypeEnum.STRING;

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.STRING, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e9f8d98bdd4ee2fe() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData arg0 = new CellData(myByteArray);

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9993966e25888f4da4a() {

    // Arrange
    final Boolean arg0 = new Boolean(true);

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNotNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995ca843b6538b8c04() {

    // Arrange
    final String arg0 = "BooleanValue can not be null";

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertEquals("BooleanValue can not be null", actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.STRING, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999b951f58266ee9260() {

    // Arrange
    final BigDecimal arg0 = new BigDecimal(1.0);

    // Act, creating object to test constructor
    final CellData actual = new CellData(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNotNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanValueOutputVoid999cc7b916973ab1f7c() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final Boolean actual = thisObj.getBooleanValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataFormatStringOutputVoid999503cd8378e0ff323() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final String actual = thisObj.getDataFormatString();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataFormatOutputVoid99941884ae3e86ce217() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final Integer actual = thisObj.getDataFormat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFormulaOutputNotNull999d0b922d6161d023a() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final Boolean actual = thisObj.getFormula();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFormulaValueOutputVoid9995952ba6d2c29799c() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final String actual = thisObj.getFormulaValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getImageValueOutput249997cfc22fff9d325ca() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final byte[] actual = thisObj.getImageValue();

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNumberValueOutputVoid99980375419225e9e2a() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final BigDecimal actual = thisObj.getNumberValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringValueOutputVoid999c18e7e07fd18b1f9() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final String actual = thisObj.getStringValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputImage9994848a32bdcce2a9b() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final CellDataTypeEnum actual = thisObj.getType();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setBooleanValueInputNotNullOutputVoid9996010f5df341d5f28() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setBooleanValue(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getBooleanValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataFormatStringInputNotNullOutputVoid99937181ee15ed5b762() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final String arg0 = "StringValue can not be null";

    // Act
    thisObj.setDataFormatString(arg0);

    // Assert side effects
    Assert.assertEquals("StringValue can not be null", thisObj.getDataFormatString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataFormatInputNotNullOutputVoid9992ad5cb5b8dec4cfb() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setDataFormat(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataFormat());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFormulaInputNotNullOutputVoid9990d7ed9aad698e454() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setFormula(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFormulaValueInputNotNullOutputVoid99906119eba12297555() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final String arg0 = "StringValue can not be null";

    // Act
    thisObj.setFormulaValue(arg0);

    // Assert side effects
    Assert.assertEquals("StringValue can not be null", thisObj.getFormulaValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void setImageValueInput21OutputVoid999aec0deea16a6faca() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thisObj.setImageValue(arg0);

    // Assert side effects
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, thisObj.getImageValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNumberValueInputNullOutputVoid999dccd3242c84926df() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final BigDecimal arg0 = null;

    // Act
    thisObj.setNumberValue(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStringValueInputNotNullOutputVoid99950dbaaaff0598c1e() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final String arg0 = "StringValue can not be null";

    // Act
    thisObj.setStringValue(arg0);

    // Assert side effects
    Assert.assertEquals("StringValue can not be null", thisObj.getStringValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeInputStringOutputVoid9990cfb50a58445f870() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);
    final CellDataTypeEnum arg0 = CellDataTypeEnum.STRING;

    // Act
    thisObj.setType(arg0);

    // Assert side effects
    Assert.assertEquals(CellDataTypeEnum.STRING, thisObj.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999509d2cf7859ec8bb() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData thisObj = new CellData(myByteArray);

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("empty", actual);

  }
}
