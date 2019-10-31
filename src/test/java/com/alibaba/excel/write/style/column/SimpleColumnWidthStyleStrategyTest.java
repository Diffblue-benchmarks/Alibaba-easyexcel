package com.alibaba.excel.write.style.column;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class SimpleColumnWidthStyleStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void columnWidthInputNotNullOutputNotNull999c09aedca81b0c6ed() {

    // Arrange
    final Integer integer = new Integer(1);
    final SimpleColumnWidthStyleStrategy thisObj = new SimpleColumnWidthStyleStrategy(integer);
    final Integer integer1 = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head arg0 = new Head(integer1, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final Integer actual = thisObj.columnWidth(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999cc3ccfeb526a7ea1() {

    // Arrange
    final Integer arg0 = new Integer(1);

    // Act, creating object to test constructor
    final SimpleColumnWidthStyleStrategy actual = new SimpleColumnWidthStyleStrategy(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
