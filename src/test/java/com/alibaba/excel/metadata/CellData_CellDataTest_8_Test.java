package com.alibaba.excel.metadata;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_CellDataTest_8_Test {
  @Test
  public void CellDataTest() throws Exception {
    // Arrange
    BigDecimal numberValue = new BigDecimal(1.0);

    // Act
    CellData cellData = new CellData(numberValue);

    // Assert
    String stringValue = cellData.getStringValue();
    Boolean booleanValue = cellData.getBooleanValue();
    String dataFormatString = cellData.getDataFormatString();
    String toStringResult = cellData.toString();
    String formulaValue = cellData.getFormulaValue();
    Integer dataFormat = cellData.getDataFormat();
    CellDataTypeEnum type = cellData.getType();
    BigDecimal numberValue1 = cellData.getNumberValue();
    Boolean formula = cellData.getFormula();
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(null, cellData.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    int scaleResult = numberValue1.scale();
    String toStringResult1 = numberValue1.toString();
    Assert.assertEquals(CellDataTypeEnum.NUMBER, type);
    Assert.assertEquals(null, booleanValue);
    Assert.assertEquals("1", toStringResult);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals("1", toStringResult1);
    Assert.assertEquals(1, numberValue1.signum());
    Assert.assertEquals(0, scaleResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
