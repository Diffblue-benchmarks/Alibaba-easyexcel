package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.OnceAbsoluteMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class OnceAbsoluteMergeStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositivePositivePositivePositiveOutputNotNull99948aa8acd3078147b() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;
    final int arg2 = 1;
    final int arg3 = 1;

    // Act, creating object to test constructor
    final OnceAbsoluteMergeStrategy actual = new OnceAbsoluteMergeStrategy(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInputNullNullNotNullPositiveOutputNullPointerException9990c6e664ad391ec09() {

    // Arrange
    final OnceAbsoluteMergeStrategy thisObj = new OnceAbsoluteMergeStrategy(1, 1, 1, 1);
    final Sheet arg0 = null;
    final Cell arg1 = null;
    final Integer integer = new Integer(2561);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("All parameters must be greater than 0");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head arg2 = new Head(integer, "All parameters must be greater than 0", arrayList, boolean1, boolean2);
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
