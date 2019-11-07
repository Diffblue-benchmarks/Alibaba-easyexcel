package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_setTableStyleTest_17_Test {
  @Test
  public void setTableStyleTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);
    TableStyle tableStyle = new TableStyle();

    // Act
    sheet.setTableStyle(tableStyle);

    // Assert
    String toStringResult = tableStyle.toString();
    IndexedColors tableHeadBackGroundColor = tableStyle.getTableHeadBackGroundColor();
    Font tableContentFont = tableStyle.getTableContentFont();
    Font tableHeadFont = tableStyle.getTableHeadFont();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, tableStyle.getTableContentBackGroundColor());
    Assert.assertEquals(null, tableHeadFont);
    Assert.assertEquals(null, tableContentFont);
    Assert.assertEquals(null, tableHeadBackGroundColor);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
