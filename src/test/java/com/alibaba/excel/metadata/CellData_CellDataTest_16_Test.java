package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_CellDataTest_16_Test {
  @Test
  public void CellDataTest() throws Exception {
    // Arrange
    String stringValue = "BooleanValue can not be null";

    // Act
    CellData cellData = new CellData(stringValue);

    // Assert
    String stringValue1 = cellData.getStringValue();
    Boolean booleanValue = cellData.getBooleanValue();
    String dataFormatString = cellData.getDataFormatString();
    String toStringResult = cellData.toString();
    String formulaValue = cellData.getFormulaValue();
    Integer dataFormat = cellData.getDataFormat();
    CellDataTypeEnum type = cellData.getType();
    BigDecimal numberValue = cellData.getNumberValue();
    Boolean formula = cellData.getFormula();
    Assert.assertEquals("BooleanValue can not be null", stringValue1);
    Assert.assertEquals(null, cellData.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.STRING, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("BooleanValue can not be null", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
