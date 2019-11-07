package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_setBooleanValueTest_2_Test {
  @Test
  public void setBooleanValueTest() throws Exception {
    // Arrange
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    Boolean booleanValue = new Boolean(true);

    // Act
    cellData.setBooleanValue(booleanValue);

    // Assert
    String stringValue = cellData.getStringValue();
    Boolean booleanValue1 = cellData.getBooleanValue();
    String dataFormatString = cellData.getDataFormatString();
    String toStringResult = cellData.toString();
    String formulaValue = cellData.getFormulaValue();
    Integer dataFormat = cellData.getDataFormat();
    CellDataTypeEnum type = cellData.getType();
    BigDecimal numberValue = cellData.getNumberValue();
    Boolean formula = cellData.getFormula();
    byte[] imageValue = cellData.getImageValue();
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(24, imageValue.length);
    Assert.assertEquals((byte) 0, imageValue[0]);
    Assert.assertEquals((byte) 0, imageValue[1]);
    Assert.assertEquals((byte) 0, imageValue[2]);
    Assert.assertEquals((byte) 0, imageValue[21]);
    Assert.assertEquals((byte) 0, imageValue[22]);
    Assert.assertEquals((byte) 0, imageValue[23]);
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.IMAGE, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("empty", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(Boolean.valueOf(true), booleanValue1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
