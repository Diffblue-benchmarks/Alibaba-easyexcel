package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ColumnWidthPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildInputNullOutputVoid999a79d191040f2e5ad() {

    // Arrange
    final ColumnWidth arg0 = null;

    // Act
    final ColumnWidthProperty actual = ColumnWidthProperty.build(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9999556ff6b8c44aa2f() {

    // Arrange
    final Integer arg0 = new Integer(1);

    // Act, creating object to test constructor
    final ColumnWidthProperty actual = new ColumnWidthProperty(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getWidth());

  }

  // Test written by Diffblue Cover
  @Test
  public void getWidthOutputNotNull99905357c89a055bea1() {

    // Arrange
    final Integer integer = new Integer(1);
    final ColumnWidthProperty thisObj = new ColumnWidthProperty(integer);

    // Act
    final Integer actual = thisObj.getWidth();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setWidthInputNotNullOutputVoid99996281e4894df3a0e() {

    // Arrange
    final Integer integer = new Integer(1);
    final ColumnWidthProperty thisObj = new ColumnWidthProperty(integer);
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setWidth(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
