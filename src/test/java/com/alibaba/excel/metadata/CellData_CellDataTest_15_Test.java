package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_CellDataTest_15_Test {
  @Test
  public void CellDataTest() throws Exception {
    // Arrange
    CellDataTypeEnum type = CellDataTypeEnum.STRING;

    // Act
    CellData cellData = new CellData(type);

    // Assert
    String stringValue = cellData.getStringValue();
    Boolean booleanValue = cellData.getBooleanValue();
    String dataFormatString = cellData.getDataFormatString();
    String toStringResult = cellData.toString();
    String formulaValue = cellData.getFormulaValue();
    Integer dataFormat = cellData.getDataFormat();
    CellDataTypeEnum type1 = cellData.getType();
    BigDecimal numberValue = cellData.getNumberValue();
    Boolean formula = cellData.getFormula();
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(null, cellData.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.STRING, type1);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals(null, toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
