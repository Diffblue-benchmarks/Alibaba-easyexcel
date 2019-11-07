package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_TableStyleTest_9_Test {
  @Test
  public void TableStyleTest() throws Exception {
    // Arrange and Act
    TableStyle tableStyle = new TableStyle();

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
