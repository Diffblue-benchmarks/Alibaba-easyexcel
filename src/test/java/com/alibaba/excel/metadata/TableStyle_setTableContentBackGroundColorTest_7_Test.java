package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_setTableContentBackGroundColorTest_7_Test {
  @Test
  public void setTableContentBackGroundColorTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();
    IndexedColors tableContentBackGroundColor = IndexedColors.BLACK1;

    // Act
    tableStyle.setTableContentBackGroundColor(tableContentBackGroundColor);

    // Assert
    String toStringResult = tableStyle.toString();
    IndexedColors tableHeadBackGroundColor = tableStyle.getTableHeadBackGroundColor();
    Font tableContentFont = tableStyle.getTableContentFont();
    Font tableHeadFont = tableStyle.getTableHeadFont();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(IndexedColors.BLACK1, tableStyle.getTableContentBackGroundColor());
    Assert.assertEquals(null, tableHeadFont);
    Assert.assertEquals(null, tableContentFont);
    Assert.assertEquals(null, tableHeadBackGroundColor);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
