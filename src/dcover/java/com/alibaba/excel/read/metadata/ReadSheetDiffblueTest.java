package com.alibaba.excel.read.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.read.listener.ReadListener;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ReadSheetDiffblueTest {
  @Test(timeout=10000)
  public void setSheetNoTest() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act
    readSheet.setSheetNo(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), readSheet.getSheetNo());
  }

  @Test(timeout=10000)
  public void getSheetNoTest() {
    // Arrange, Act and Assert
    assertNull((new ReadSheet()).getSheetNo());
  }

  @Test(timeout=10000)
  public void getSheetNameTest() {
    // Arrange, Act and Assert
    assertNull((new ReadSheet()).getSheetName());
  }

  @Test(timeout=10000)
  public void copyBasicParameterTest() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();
    ReadSheet readSheet1 = new ReadSheet();

    // Act
    readSheet.copyBasicParameter(readSheet1);

    // Assert
    Class actualClazz = readSheet.getClazz();
    List<List<String>> actualHead = readSheet.getHead();
    Integer actualHeadRowNumber = readSheet.getHeadRowNumber();
    Boolean actualAutoTrim = readSheet.getAutoTrim();
    List<ReadListener> actualCustomReadListenerList = readSheet.getCustomReadListenerList();
    Boolean actualUse1904windowing = readSheet.getUse1904windowing();
    assertNull(actualClazz);
    assertNull(readSheet.getCustomConverterList());
    assertNull(actualUse1904windowing);
    assertSame(readSheet1.getCustomReadListenerList(), actualCustomReadListenerList);
    assertNull(actualAutoTrim);
    assertNull(actualHeadRowNumber);
    assertNull(actualHead);
  }

  @Test(timeout=10000)
  public void setSheetNameTest() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act
    readSheet.setSheetName("name");

    // Assert
    assertEquals("name", readSheet.getSheetName());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ReadSheet actualReadSheet = new ReadSheet(Integer.valueOf(1), "name");

    // Assert
    String actualSheetName = actualReadSheet.getSheetName();
    assertEquals(Integer.valueOf(1), actualReadSheet.getSheetNo());
    assertEquals("name", actualSheetName);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1), (new ReadSheet(Integer.valueOf(1))).getSheetNo());
  }
}

