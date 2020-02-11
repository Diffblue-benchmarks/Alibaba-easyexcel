package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.List;
import org.junit.Test;

public class SheetDiffblueTest {
  @Test(timeout=10000)
  public void getColumnWidthMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Sheet(1)).getColumnWidthMap().size());
  }

  @Test(timeout=10000)
  public void setClazzTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setClazz(null);

    // Assert
    Class<? extends BaseRowModel> actualClazz = sheet.getClazz();
    assertNull(actualClazz);
    assertEquals(1, sheet.getHeadLineMun());
  }

  @Test(timeout=10000)
  public void setStartRowTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setStartRow(1);

    // Assert
    assertEquals(1, sheet.getStartRow());
  }

  @Test(timeout=10000)
  public void setTableStyleTest() {
    // Arrange
    Sheet sheet = new Sheet(1);
    TableStyle tableStyle = new TableStyle();

    // Act
    sheet.setTableStyle(tableStyle);

    // Assert
    assertSame(tableStyle, sheet.getTableStyle());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    Sheet actualSheet = new Sheet(1, 2);

    // Assert
    String actualToStringResult = actualSheet.toString();
    int actualHeadLineMun = actualSheet.getHeadLineMun();
    int actualSheetNo = actualSheet.getSheetNo();
    Boolean actualAutoWidth = actualSheet.getAutoWidth();
    assertEquals(0, actualSheet.getStartRow());
    assertEquals(Boolean.valueOf(false), actualAutoWidth);
    assertEquals(1, actualSheetNo);
    assertEquals(2, actualHeadLineMun);
    assertEquals("Sheet{headLineMun=2, sheetNo=1, sheetName='null'," + " clazz=null, head=null, tableStyle=null,"
        + " columnWidthMap={}}", actualToStringResult);
  }

  @Test(timeout=10000)
  public void getStartRowTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Sheet(1)).getStartRow());
  }

  @Test(timeout=10000)
  public void getAutoWidthTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new Sheet(1)).getAutoWidth());
  }

  @Test(timeout=10000)
  public void getSheetNoTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Sheet(1)).getSheetNo());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    Sheet actualSheet = new Sheet(1, 2, null, "name", null);

    // Assert
    Class<? extends BaseRowModel> actualClazz = actualSheet.getClazz();
    List<List<String>> actualHead = actualSheet.getHead();
    String actualToStringResult = actualSheet.toString();
    int actualHeadLineMun = actualSheet.getHeadLineMun();
    int actualSheetNo = actualSheet.getSheetNo();
    String actualSheetName = actualSheet.getSheetName();
    Boolean actualAutoWidth = actualSheet.getAutoWidth();
    assertNull(actualClazz);
    assertEquals(0, actualSheet.getStartRow());
    assertEquals(Boolean.valueOf(false), actualAutoWidth);
    assertEquals("name", actualSheetName);
    assertEquals(1, actualSheetNo);
    assertEquals(2, actualHeadLineMun);
    assertEquals("Sheet{headLineMun=2, sheetNo=1, sheetName='name'," + " clazz=null, head=null, tableStyle=null,"
        + " columnWidthMap={}}", actualToStringResult);
    assertNull(actualHead);
  }

  @Test(timeout=10000)
  public void getHeadLineMunTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Sheet(1)).getHeadLineMun());
  }

  @Test(timeout=10000)
  public void setHeadTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setHead(null);

    // Assert
    assertNull(sheet.getHead());
  }

  @Test(timeout=10000)
  public void setColumnWidthMapTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setColumnWidthMap(null);

    // Assert
    assertNull(sheet.getColumnWidthMap());
  }

  @Test(timeout=10000)
  public void getHeadTest() {
    // Arrange, Act and Assert
    assertNull((new Sheet(1)).getHead());
  }

  @Test(timeout=10000)
  public void setAutoWidthTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setAutoWidth(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), sheet.getAutoWidth());
  }

  @Test(timeout=10000)
  public void setHeadLineMunTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setHeadLineMun(2);

    // Assert
    assertEquals(2, sheet.getHeadLineMun());
  }

  @Test(timeout=10000)
  public void getTableStyleTest() {
    // Arrange, Act and Assert
    assertNull((new Sheet(1)).getTableStyle());
  }

  @Test(timeout=10000)
  public void getSheetNameTest() {
    // Arrange, Act and Assert
    assertNull((new Sheet(1)).getSheetName());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Sheet actualSheet = new Sheet(1);

    // Assert
    String actualToStringResult = actualSheet.toString();
    int actualSheetNo = actualSheet.getSheetNo();
    Boolean actualAutoWidth = actualSheet.getAutoWidth();
    assertEquals(0, actualSheet.getStartRow());
    assertEquals(Boolean.valueOf(false), actualAutoWidth);
    assertEquals(1, actualSheetNo);
    assertEquals("Sheet{headLineMun=0, sheetNo=1, sheetName='null'," + " clazz=null, head=null, tableStyle=null,"
        + " columnWidthMap={}}", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Sheet{headLineMun=0, sheetNo=1, sheetName='null'," + " clazz=null, head=null, tableStyle=null,"
        + " columnWidthMap={}}", (new Sheet(1)).toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Sheet actualSheet = new Sheet(1, 2, null);

    // Assert
    Class<? extends BaseRowModel> actualClazz = actualSheet.getClazz();
    String actualToStringResult = actualSheet.toString();
    int actualHeadLineMun = actualSheet.getHeadLineMun();
    int actualSheetNo = actualSheet.getSheetNo();
    Boolean actualAutoWidth = actualSheet.getAutoWidth();
    assertNull(actualClazz);
    assertEquals(0, actualSheet.getStartRow());
    assertEquals(Boolean.valueOf(false), actualAutoWidth);
    assertEquals(1, actualSheetNo);
    assertEquals(2, actualHeadLineMun);
    assertEquals("Sheet{headLineMun=2, sheetNo=1, sheetName='null'," + " clazz=null, head=null, tableStyle=null,"
        + " columnWidthMap={}}", actualToStringResult);
  }

  @Test(timeout=10000)
  public void setSheetNameTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setSheetName("name");

    // Assert
    assertEquals("name", sheet.getSheetName());
  }

  @Test(timeout=10000)
  public void setSheetNoTest() {
    // Arrange
    Sheet sheet = new Sheet(1);

    // Act
    sheet.setSheetNo(1);

    // Assert
    assertEquals(1, sheet.getSheetNo());
  }

  @Test(timeout=10000)
  public void getClazzTest() {
    // Arrange, Act and Assert
    assertNull((new Sheet(1)).getClazz());
  }
}

