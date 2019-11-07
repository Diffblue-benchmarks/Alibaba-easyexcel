package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_setTableHeadBackGroundColorTest_4_Test {
  @Test
  public void setTableHeadBackGroundColorTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();
    IndexedColors tableHeadBackGroundColor = IndexedColors.BLACK1;

    // Act
    tableStyle.setTableHeadBackGroundColor(tableHeadBackGroundColor);

    // Assert
    String toStringResult = tableStyle.toString();
    IndexedColors tableHeadBackGroundColor1 = tableStyle.getTableHeadBackGroundColor();
    Font tableContentFont = tableStyle.getTableContentFont();
    Font tableHeadFont = tableStyle.getTableHeadFont();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, tableStyle.getTableContentBackGroundColor());
    Assert.assertEquals(null, tableHeadFont);
    Assert.assertEquals(null, tableContentFont);
    Assert.assertEquals(IndexedColors.BLACK1, tableHeadBackGroundColor1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
