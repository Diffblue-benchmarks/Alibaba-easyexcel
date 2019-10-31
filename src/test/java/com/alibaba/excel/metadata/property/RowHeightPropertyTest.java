package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RowHeightPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildInputNullOutputVoid9997e1a0a23562ace02() {

    // Arrange
    final ContentRowHeight arg0 = null;

    // Act
    final RowHeightProperty actual = RowHeightProperty.build(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void buildInputNullOutputVoid999fb68d66c5b430b99() {

    // Arrange
    final HeadRowHeight arg0 = null;

    // Act
    final RowHeightProperty actual = RowHeightProperty.build(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99974f5e1885f2d3c70() {

    // Arrange
    final Short arg0 = new Short((short) 1);

    // Act, creating object to test constructor
    final RowHeightProperty actual = new RowHeightProperty(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getHeight());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeightOutputNotNull99943b331bb8910eab7() {

    // Arrange
    final Short short1 = new Short((short) 1);
    final RowHeightProperty thisObj = new RowHeightProperty(short1);

    // Act
    final Short actual = thisObj.getHeight();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeightInputNotNullOutputVoid999abbccdc6f56ea17f() {

    // Arrange
    final Short short1 = new Short((short) 1);
    final RowHeightProperty thisObj = new RowHeightProperty(short1);
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setHeight(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
