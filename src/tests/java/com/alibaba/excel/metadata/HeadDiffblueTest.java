package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Test;

public class HeadDiffblueTest {
  @Test(timeout=10000)
  public void setColumnWidthPropertyTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(Integer.valueOf(1));

    // Act
    head.setColumnWidthProperty(columnWidthProperty);

    // Assert
    assertSame(columnWidthProperty, head.getColumnWidthProperty());
  }

  @Test(timeout=10000)
  public void setFieldNameTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    head.setFieldName("name");

    // Assert
    assertEquals("name", head.getFieldName());
  }

  @Test(timeout=10000)
  public void setColumnIndexTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    head.setColumnIndex(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), head.getColumnIndex());
  }

  @Test(timeout=10000)
  public void setHeadNameListTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    head.setHeadNameList(null);

    // Assert
    assertNull(head.getHeadNameList());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Head actualHead = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Assert
    Boolean actualForceIndex = actualHead.getForceIndex();
    String actualFieldName = actualHead.getFieldName();
    Integer actualColumnIndex = actualHead.getColumnIndex();
    assertEquals(Boolean.valueOf(true), actualForceIndex);
    assertEquals(Boolean.valueOf(true), actualHead.getForceName());
    assertEquals(Integer.valueOf(1), actualColumnIndex);
    assertEquals("name", actualFieldName);
  }

  @Test(timeout=10000)
  public void setForceIndexTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    head.setForceIndex(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), head.getForceIndex());
  }

  @Test(timeout=10000)
  public void setForceNameTest() {
    // Arrange
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    head.setForceName(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), head.getForceName());
  }

  @Test(timeout=10000)
  public void getForceIndexTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true),
        (new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true))).getForceIndex());
  }

  @Test(timeout=10000)
  public void getHeadNameListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true)))
        .getHeadNameList().size());
  }

  @Test(timeout=10000)
  public void getForceNameTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true),
        (new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true))).getForceName());
  }

  @Test(timeout=10000)
  public void getColumnIndexTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1),
        (new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true))).getColumnIndex());
  }

  @Test(timeout=10000)
  public void getColumnWidthPropertyTest() {
    // Arrange, Act and Assert
    assertNull((new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true)))
        .getColumnWidthProperty());
  }

  @Test(timeout=10000)
  public void getFieldNameTest() {
    // Arrange, Act and Assert
    assertEquals("name",
        (new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true))).getFieldName());
  }
}

