package com.alibaba.excel.write.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Test;

public class WriteSheetDiffblueTest {
  @Test(timeout=10000)
  public void getColumnWidthMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new WriteSheet()).getColumnWidthMap().size());
  }

  @Test(timeout=10000)
  public void setTableStyleTest() {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();
    TableStyle tableStyle = new TableStyle();

    // Act
    writeSheet.setTableStyle(tableStyle);

    // Assert
    assertSame(tableStyle, writeSheet.getTableStyle());
  }

  @Test(timeout=10000)
  public void setSheetNoTest() {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    writeSheet.setSheetNo(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), writeSheet.getSheetNo());
  }

  @Test(timeout=10000)
  public void getSheetNoTest() {
    // Arrange, Act and Assert
    assertNull((new WriteSheet()).getSheetNo());
  }

  @Test(timeout=10000)
  public void getTableStyleTest() {
    // Arrange, Act and Assert
    assertNull((new WriteSheet()).getTableStyle());
  }

  @Test(timeout=10000)
  public void getSheetNameTest() {
    // Arrange, Act and Assert
    assertNull((new WriteSheet()).getSheetName());
  }

  @Test(timeout=10000)
  public void setColumnWidthMapTest() {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    writeSheet.setColumnWidthMap(null);

    // Assert
    assertNull(writeSheet.getColumnWidthMap());
  }

  @Test(timeout=10000)
  public void setSheetNameTest() {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    writeSheet.setSheetName("name");

    // Assert
    assertEquals("name", writeSheet.getSheetName());
  }
}

