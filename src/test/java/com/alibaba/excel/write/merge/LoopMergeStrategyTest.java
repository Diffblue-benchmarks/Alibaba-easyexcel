package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class LoopMergeStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositivePositiveOutputNotNull99958fd2da4d3cec50d() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act, creating object to test constructor
    final LoopMergeStrategy actual = new LoopMergeStrategy(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInputNullNullNotNullPositiveOutputNullPointerException99928ec1ca6ef154260() {

    // Arrange
    final LoopMergeStrategy thisObj = new LoopMergeStrategy(1, 1);
    final Sheet arg0 = null;
    final Cell arg1 = null;
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("ColumnIndex must be greater than 0");
    final Boolean boolean1 = new Boolean(true);
    final Head arg2 = new Head(integer, "ColumnIndex must be greater than 0", arrayList, null, boolean1);
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
