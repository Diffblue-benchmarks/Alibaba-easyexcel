package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.metadata.WriteTable;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTable_setTableStyleTest_1_Test {
  @Test
  public void setTableStyleTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();
    TableStyle tableStyle = new TableStyle();

    // Act
    writeTable.setTableStyle(tableStyle);

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
