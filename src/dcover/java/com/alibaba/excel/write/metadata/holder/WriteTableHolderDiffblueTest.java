package com.alibaba.excel.write.metadata.holder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class WriteTableHolderDiffblueTest {
  @Test(timeout=10000)
  public void holderTypeTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act and Assert
    assertEquals(HolderEnum.TABLE,
        (new WriteTableHolder(writeTable, null, new WriteWorkbookHolder(new WriteWorkbook()))).holderType());
  }

  @Test(timeout=10000)
  public void getTableNoTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act and Assert
    assertNull((new WriteTableHolder(writeTable, null, new WriteWorkbookHolder(new WriteWorkbook()))).getTableNo());
  }

  @Test(timeout=10000)
  public void setParentWriteSheetHolderTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));

    // Act
    writeTableHolder.setParentWriteSheetHolder(null);

    // Assert
    assertNull(writeTableHolder.getParentWriteSheetHolder());
  }

  @Test(timeout=10000)
  public void setWriteTableTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));
    WriteTable writeTable1 = new WriteTable();

    // Act
    writeTableHolder.setWriteTable(writeTable1);

    // Assert
    assertSame(writeTable1, writeTableHolder.getWriteTable());
  }

  @Test(timeout=10000)
  public void getWriteTableTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act and Assert
    assertSame(writeTable,
        (new WriteTableHolder(writeTable, null, new WriteWorkbookHolder(new WriteWorkbook()))).getWriteTable());
  }

  @Test(timeout=10000)
  public void setTableNoTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));

    // Act
    writeTableHolder.setTableNo(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), writeTableHolder.getTableNo());
  }

  @Test(timeout=10000)
  public void getParentWriteSheetHolderTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act and Assert
    assertNull((new WriteTableHolder(writeTable, null, new WriteWorkbookHolder(new WriteWorkbook())))
        .getParentWriteSheetHolder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act
    WriteTableHolder actualWriteTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));

    // Assert
    Class actualClazz = actualWriteTableHolder.getClazz();
    Collection<String> actualIncludeColumnFiledNames = actualWriteTableHolder.getIncludeColumnFiledNames();
    GlobalConfiguration globalConfiguration = actualWriteTableHolder.getGlobalConfiguration();
    Boolean actualNewInitialization = actualWriteTableHolder.getNewInitialization();
    Collection<String> actualExcludeColumnFiledNames = actualWriteTableHolder.getExcludeColumnFiledNames();
    Integer actualTableNo = actualWriteTableHolder.getTableNo();
    ExcelWriteHeadProperty excelWriteHeadProperty = actualWriteTableHolder.getExcelWriteHeadProperty();
    List<List<String>> actualHead = actualWriteTableHolder.getHead();
    WriteSheetHolder actualParentWriteSheetHolder = actualWriteTableHolder.getParentWriteSheetHolder();
    Boolean actualNeedHead = actualWriteTableHolder.getNeedHead();
    Integer actualRelativeHeadRowIndex = actualWriteTableHolder.getRelativeHeadRowIndex();
    WriteTable actualWriteTable = actualWriteTableHolder.getWriteTable();
    Collection<Integer> actualExcludeColumnIndexes = actualWriteTableHolder.getExcludeColumnIndexes();
    Boolean actualUseDefaultStyle = actualWriteTableHolder.getUseDefaultStyle();
    assertNull(actualClazz);
    assertNull(actualWriteTableHolder.getIncludeColumnIndexes());
    assertEquals(Boolean.valueOf(true), actualUseDefaultStyle);
    assertNull(actualExcludeColumnIndexes);
    assertSame(writeTable, actualWriteTable);
    assertEquals(Integer.valueOf(0), actualRelativeHeadRowIndex);
    assertNull(actualIncludeColumnFiledNames);
    HeadKindEnum actualHeadKind = excelWriteHeadProperty.getHeadKind();
    Class actualHeadClazz = excelWriteHeadProperty.getHeadClazz();
    int actualHeadRowNumber = excelWriteHeadProperty.getHeadRowNumber();
    assertEquals(Boolean.valueOf(true), actualNewInitialization);
    assertNull(actualHead);
    assertNull(actualParentWriteSheetHolder);
    Boolean actualAutoTrim = globalConfiguration.getAutoTrim();
    assertNull(actualExcludeColumnFiledNames);
    assertEquals(Boolean.valueOf(true), actualNeedHead);
    assertNull(actualTableNo);
    assertNull(actualHeadClazz);
    assertEquals(HeadKindEnum.NONE, actualHeadKind);
    assertEquals(Boolean.valueOf(false), globalConfiguration.getUse1904windowing());
    assertEquals(Boolean.valueOf(true), actualAutoTrim);
    assertEquals(0, actualHeadRowNumber);
  }
}

