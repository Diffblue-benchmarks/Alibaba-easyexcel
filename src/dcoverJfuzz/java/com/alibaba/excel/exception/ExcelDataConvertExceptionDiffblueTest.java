package com.alibaba.excel.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class ExcelDataConvertExceptionDiffblueTest {
  @Test(timeout=10000)
  public void setExcelContentPropertyTest() {
    // Arrange
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException("An error occurred");
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    excelDataConvertException.setExcelContentProperty(excelContentProperty);

    // Assert
    assertSame(excelContentProperty, excelDataConvertException.getExcelContentProperty());
  }

  @Test(timeout=10000)
  public void setColumnIndexTest() {
    // Arrange
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException("An error occurred");

    // Act
    excelDataConvertException.setColumnIndex(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), excelDataConvertException.getColumnIndex());
  }

  @Test(timeout=10000)
  public void getColumnIndexTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelDataConvertException("An error occurred")).getColumnIndex());
  }

  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange and Act
    ExcelDataConvertException actualExcelDataConvertException = new ExcelDataConvertException((Throwable) null);

    // Assert
    Integer actualRowIndex = actualExcelDataConvertException.getRowIndex();
    ExcelContentProperty actualExcelContentProperty = actualExcelDataConvertException.getExcelContentProperty();
    assertNull(actualRowIndex);
    assertNull(actualExcelDataConvertException.getColumnIndex());
    assertNull(actualExcelContentProperty);
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    ExcelDataConvertException actualExcelDataConvertException = new ExcelDataConvertException("An error occurred");

    // Assert
    Integer actualRowIndex = actualExcelDataConvertException.getRowIndex();
    ExcelContentProperty actualExcelContentProperty = actualExcelDataConvertException.getExcelContentProperty();
    assertNull(actualRowIndex);
    assertNull(actualExcelDataConvertException.getColumnIndex());
    assertNull(actualExcelContentProperty);
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    ExcelDataConvertException actualExcelDataConvertException = new ExcelDataConvertException(Integer.valueOf(1),
        Integer.valueOf(1), excelContentProperty, "An error occurred");

    // Assert
    Integer actualRowIndex = actualExcelDataConvertException.getRowIndex();
    ExcelContentProperty actualExcelContentProperty = actualExcelDataConvertException.getExcelContentProperty();
    assertEquals(Integer.valueOf(1), actualRowIndex);
    assertEquals(Integer.valueOf(1), actualExcelDataConvertException.getColumnIndex());
    assertSame(excelContentProperty, actualExcelContentProperty);
  }

  @Test(timeout=10000)
  public void setRowIndexTest() {
    // Arrange
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException("An error occurred");

    // Act
    excelDataConvertException.setRowIndex(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), excelDataConvertException.getRowIndex());
  }

  @Test(timeout=10000)
  public void getExcelContentPropertyTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelDataConvertException("An error occurred")).getExcelContentProperty());
  }

  @Test(timeout=10000)
  public void getRowIndexTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelDataConvertException("An error occurred")).getRowIndex());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    ExcelDataConvertException actualExcelDataConvertException = new ExcelDataConvertException(Integer.valueOf(1),
        Integer.valueOf(1), excelContentProperty, "An error occurred", null);

    // Assert
    Integer actualRowIndex = actualExcelDataConvertException.getRowIndex();
    ExcelContentProperty actualExcelContentProperty = actualExcelDataConvertException.getExcelContentProperty();
    assertEquals(Integer.valueOf(1), actualRowIndex);
    assertEquals(Integer.valueOf(1), actualExcelDataConvertException.getColumnIndex());
    assertSame(excelContentProperty, actualExcelContentProperty);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ExcelDataConvertException actualExcelDataConvertException = new ExcelDataConvertException("An error occurred",
        null);

    // Assert
    Integer actualRowIndex = actualExcelDataConvertException.getRowIndex();
    ExcelContentProperty actualExcelContentProperty = actualExcelDataConvertException.getExcelContentProperty();
    assertNull(actualRowIndex);
    assertNull(actualExcelDataConvertException.getColumnIndex());
    assertNull(actualExcelContentProperty);
  }
}

