package com.alibaba.excel.write.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class WriteTableDiffblueTest {
  @Test(timeout=10000)
  public void getTableNoTest() {
    // Arrange, Act and Assert
    assertNull((new WriteTable()).getTableNo());
  }

  @Test(timeout=10000)
  public void setTableStyleTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();
    TableStyle tableStyle = new TableStyle();

    // Act
    writeTable.setTableStyle(tableStyle);

    // Assert
    assertSame(tableStyle, writeTable.getTableStyle());
  }

  @Test(timeout=10000)
  public void getTableStyleTest() {
    // Arrange, Act and Assert
    assertNull((new WriteTable()).getTableStyle());
  }

  @Test(timeout=10000)
  public void setTableNoTest() {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act
    writeTable.setTableNo(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), writeTable.getTableNo());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    WriteTable actualWriteTable = new WriteTable();

    // Assert
    Class actualClazz = actualWriteTable.getClazz();
    Collection<String> actualIncludeColumnFiledNames = actualWriteTable.getIncludeColumnFiledNames();
    List<WriteHandler> customWriteHandlerList = actualWriteTable.getCustomWriteHandlerList();
    TableStyle actualTableStyle = actualWriteTable.getTableStyle();
    Collection<String> actualExcludeColumnFiledNames = actualWriteTable.getExcludeColumnFiledNames();
    Integer actualTableNo = actualWriteTable.getTableNo();
    List<List<String>> actualHead = actualWriteTable.getHead();
    Boolean actualAutoTrim = actualWriteTable.getAutoTrim();
    Boolean actualNeedHead = actualWriteTable.getNeedHead();
    Integer actualRelativeHeadRowIndex = actualWriteTable.getRelativeHeadRowIndex();
    Collection<Integer> actualExcludeColumnIndexes = actualWriteTable.getExcludeColumnIndexes();
    Boolean actualUse1904windowing = actualWriteTable.getUse1904windowing();
    Boolean actualUseDefaultStyle = actualWriteTable.getUseDefaultStyle();
    List<Converter> actualCustomConverterList = actualWriteTable.getCustomConverterList();
    assertNull(actualClazz);
    assertNull(actualWriteTable.getIncludeColumnIndexes());
    assertNull(actualCustomConverterList);
    assertNull(actualUseDefaultStyle);
    assertNull(actualUse1904windowing);
    assertNull(actualExcludeColumnIndexes);
    assertNull(actualRelativeHeadRowIndex);
    assertNull(actualNeedHead);
    assertNull(actualAutoTrim);
    assertNull(actualHead);
    assertNull(actualTableNo);
    assertNull(actualExcludeColumnFiledNames);
    assertNull(actualTableStyle);
    assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    assertNull(actualIncludeColumnFiledNames);
    assertEquals(0, customWriteHandlerList.size());
  }
}

