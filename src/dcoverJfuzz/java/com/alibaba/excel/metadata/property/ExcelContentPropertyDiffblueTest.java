package com.alibaba.excel.metadata.property;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Head;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import org.junit.Test;

public class ExcelContentPropertyDiffblueTest {
  @Test(timeout=10000)
  public void getDateTimeFormatPropertyTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelContentProperty()).getDateTimeFormatProperty());
  }

  @Test(timeout=10000)
  public void getHeadTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelContentProperty()).getHead());
  }

  @Test(timeout=10000)
  public void getConverterTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelContentProperty()).getConverter());
  }

  @Test(timeout=10000)
  public void setFieldTest() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    excelContentProperty.setField(null);

    // Assert
    assertNull(excelContentProperty.getField());
  }

  @Test(timeout=10000)
  public void setNumberFormatPropertyTest() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("foo", RoundingMode.UP);

    // Act
    excelContentProperty.setNumberFormatProperty(numberFormatProperty);

    // Assert
    assertSame(numberFormatProperty, excelContentProperty.getNumberFormatProperty());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ExcelContentProperty actualExcelContentProperty = new ExcelContentProperty();

    // Assert
    NumberFormatProperty actualNumberFormatProperty = actualExcelContentProperty.getNumberFormatProperty();
    Field actualField = actualExcelContentProperty.getField();
    Converter actualConverter = actualExcelContentProperty.getConverter();
    Head actualHead = actualExcelContentProperty.getHead();
    assertNull(actualNumberFormatProperty);
    assertNull(actualExcelContentProperty.getDateTimeFormatProperty());
    assertNull(actualHead);
    assertNull(actualConverter);
    assertNull(actualField);
  }

  @Test(timeout=10000)
  public void setDateTimeFormatPropertyTest() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("foo", Boolean.valueOf(true));

    // Act
    excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);

    // Assert
    assertSame(dateTimeFormatProperty, excelContentProperty.getDateTimeFormatProperty());
  }

  @Test(timeout=10000)
  public void getFieldTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelContentProperty()).getField());
  }

  @Test(timeout=10000)
  public void setHeadTest() {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    Head head = new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true));

    // Act
    excelContentProperty.setHead(head);

    // Assert
    assertSame(head, excelContentProperty.getHead());
  }

  @Test(timeout=10000)
  public void getNumberFormatPropertyTest() {
    // Arrange, Act and Assert
    assertNull((new ExcelContentProperty()).getNumberFormatProperty());
  }
}

