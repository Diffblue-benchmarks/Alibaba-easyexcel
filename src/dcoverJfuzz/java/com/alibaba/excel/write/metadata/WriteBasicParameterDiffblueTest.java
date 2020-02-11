package com.alibaba.excel.write.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.handler.WriteHandler;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class WriteBasicParameterDiffblueTest {
  @Test(timeout=10000)
  public void getIncludeColumnIndexesTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getIncludeColumnIndexes());
  }

  @Test(timeout=10000)
  public void setIncludeColumnFiledNamesTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setIncludeColumnFiledNames(null);

    // Assert
    assertNull(writeBasicParameter.getIncludeColumnFiledNames());
  }

  @Test(timeout=10000)
  public void getUseDefaultStyleTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getUseDefaultStyle());
  }

  @Test(timeout=10000)
  public void getExcludeColumnIndexesTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getExcludeColumnIndexes());
  }

  @Test(timeout=10000)
  public void getRelativeHeadRowIndexTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getRelativeHeadRowIndex());
  }

  @Test(timeout=10000)
  public void setExcludeColumnIndexesTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setExcludeColumnIndexes(null);

    // Assert
    assertNull(writeBasicParameter.getExcludeColumnIndexes());
  }

  @Test(timeout=10000)
  public void getNeedHeadTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getNeedHead());
  }

  @Test(timeout=10000)
  public void setIncludeColumnIndexesTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setIncludeColumnIndexes(null);

    // Assert
    assertNull(writeBasicParameter.getIncludeColumnIndexes());
  }

  @Test(timeout=10000)
  public void setCustomWriteHandlerListTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setCustomWriteHandlerList(null);

    // Assert
    assertNull(writeBasicParameter.getCustomWriteHandlerList());
  }

  @Test(timeout=10000)
  public void getExcludeColumnFiledNamesTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getExcludeColumnFiledNames());
  }

  @Test(timeout=10000)
  public void setRelativeHeadRowIndexTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setRelativeHeadRowIndex(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), writeBasicParameter.getRelativeHeadRowIndex());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    WriteBasicParameter actualWriteBasicParameter = new WriteBasicParameter();

    // Assert
    Class actualClazz = actualWriteBasicParameter.getClazz();
    Collection<String> actualIncludeColumnFiledNames = actualWriteBasicParameter.getIncludeColumnFiledNames();
    List<WriteHandler> customWriteHandlerList = actualWriteBasicParameter.getCustomWriteHandlerList();
    Collection<String> actualExcludeColumnFiledNames = actualWriteBasicParameter.getExcludeColumnFiledNames();
    List<List<String>> actualHead = actualWriteBasicParameter.getHead();
    Boolean actualAutoTrim = actualWriteBasicParameter.getAutoTrim();
    Boolean actualNeedHead = actualWriteBasicParameter.getNeedHead();
    Integer actualRelativeHeadRowIndex = actualWriteBasicParameter.getRelativeHeadRowIndex();
    Collection<Integer> actualExcludeColumnIndexes = actualWriteBasicParameter.getExcludeColumnIndexes();
    Boolean actualUse1904windowing = actualWriteBasicParameter.getUse1904windowing();
    Boolean actualUseDefaultStyle = actualWriteBasicParameter.getUseDefaultStyle();
    List<Converter> actualCustomConverterList = actualWriteBasicParameter.getCustomConverterList();
    assertNull(actualClazz);
    assertNull(actualWriteBasicParameter.getIncludeColumnIndexes());
    assertNull(actualCustomConverterList);
    assertNull(actualUseDefaultStyle);
    assertNull(actualUse1904windowing);
    assertNull(actualExcludeColumnIndexes);
    assertNull(actualRelativeHeadRowIndex);
    assertNull(actualNeedHead);
    assertNull(actualAutoTrim);
    assertNull(actualHead);
    assertNull(actualExcludeColumnFiledNames);
    assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    assertNull(actualIncludeColumnFiledNames);
    assertEquals(0, customWriteHandlerList.size());
  }

  @Test(timeout=10000)
  public void setUseDefaultStyleTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setUseDefaultStyle(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeBasicParameter.getUseDefaultStyle());
  }

  @Test(timeout=10000)
  public void setExcludeColumnFiledNamesTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setExcludeColumnFiledNames(null);

    // Assert
    assertNull(writeBasicParameter.getExcludeColumnFiledNames());
  }

  @Test(timeout=10000)
  public void getCustomWriteHandlerListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new WriteBasicParameter()).getCustomWriteHandlerList().size());
  }

  @Test(timeout=10000)
  public void getIncludeColumnFiledNamesTest() {
    // Arrange, Act and Assert
    assertNull((new WriteBasicParameter()).getIncludeColumnFiledNames());
  }

  @Test(timeout=10000)
  public void setNeedHeadTest() {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    writeBasicParameter.setNeedHead(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeBasicParameter.getNeedHead());
  }
}

