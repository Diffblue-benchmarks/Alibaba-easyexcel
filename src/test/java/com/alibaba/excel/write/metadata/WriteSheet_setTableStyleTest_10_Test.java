package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_setTableStyleTest_10_Test {
  @Test
  public void setTableStyleTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();
    TableStyle tableStyle = new TableStyle();

    // Act
    writeSheet.setTableStyle(tableStyle);

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
