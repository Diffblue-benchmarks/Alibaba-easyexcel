package com.alibaba.excel.write.style.row;

import com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SimpleRowHeightStyleStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999b9550452f80281c0() {

    // Arrange
    final Short arg0 = new Short((short) 1);
    final Short arg1 = new Short((short) 1);

    // Act, creating object to test constructor
    final SimpleRowHeightStyleStrategy actual = new SimpleRowHeightStyleStrategy(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setContentColumnHeightInputNullPositiveOutputNullPointerException999e440aa34d383d7b8() {

    // Arrange
    final Short short1 = new Short((short) 1);
    final Short short2 = new Short((short) 1);
    final SimpleRowHeightStyleStrategy thisObj = new SimpleRowHeightStyleStrategy(short1, short2);
    final Row arg0 = null;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setContentColumnHeight(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadColumnHeightInputNullPositiveOutputNullPointerException999f290caf5da2111f3() {

    // Arrange
    final Short short1 = new Short((short) 1);
    final Short short2 = new Short((short) 1);
    final SimpleRowHeightStyleStrategy thisObj = new SimpleRowHeightStyleStrategy(short1, short2);
    final Row arg0 = null;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setHeadColumnHeight(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
