package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_CellDataTest_5_Test {
  @Test
  public void CellDataTest() throws Exception {
    // Arrange
    byte[] imageValue = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    CellData cellData = new CellData(imageValue);

    // Assert
    String stringValue = cellData.getStringValue();
    Boolean booleanValue = cellData.getBooleanValue();
    String dataFormatString = cellData.getDataFormatString();
    String toStringResult = cellData.toString();
    String formulaValue = cellData.getFormulaValue();
    Integer dataFormat = cellData.getDataFormat();
    CellDataTypeEnum type = cellData.getType();
    BigDecimal numberValue = cellData.getNumberValue();
    Boolean formula = cellData.getFormula();
    byte[] imageValue1 = cellData.getImageValue();
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(24, imageValue1.length);
    Assert.assertEquals((byte) 0, imageValue1[0]);
    Assert.assertEquals((byte) 0, imageValue1[1]);
    Assert.assertEquals((byte) 0, imageValue1[2]);
    Assert.assertEquals((byte) 0, imageValue1[21]);
    Assert.assertEquals((byte) 0, imageValue1[22]);
    Assert.assertEquals((byte) 0, imageValue1[23]);
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.IMAGE, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("empty", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
