package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CellRangeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositivePositivePositivePositiveOutputNotNull9991878980f15d1c2f6() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;
    final int arg2 = 1;
    final int arg3 = 1;

    // Act, creating object to test constructor
    final CellRange actual = new CellRange(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getFirstRow());
    Assert.assertEquals(1, actual.getFirstCol());
    Assert.assertEquals(1, actual.getLastCol());
    Assert.assertEquals(1, actual.getLastRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFirstColOutputPositive999d6a3431019da8d02() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);

    // Act
    final int actual = thisObj.getFirstCol();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFirstRowOutputPositive999c926942f76fa904a() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);

    // Act
    final int actual = thisObj.getFirstRow();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLastColOutputPositive9999fe0712ed6d44179() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);

    // Act
    final int actual = thisObj.getLastCol();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLastRowOutputPositive9990791c62f0ab13225() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);

    // Act
    final int actual = thisObj.getLastRow();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFirstColInputPositiveOutputVoid99926dc0df8d27bc2fa() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setFirstCol(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFirstRowInputPositiveOutputVoid999cb813ed7f1bc6b53() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setFirstRow(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLastColInputPositiveOutputVoid999514747e603dba34f() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setLastCol(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLastRowInputPositiveOutputVoid9994ca51e17cb2d19cb() {

    // Arrange
    final CellRange thisObj = new CellRange(1, 1, 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setLastRow(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
