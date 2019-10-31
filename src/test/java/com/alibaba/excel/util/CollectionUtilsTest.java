package com.alibaba.excel.util;

import com.alibaba.excel.util.CollectionUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class CollectionUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void isEmptyInputNotNullOutputFalse9994d8486dc55341bea() {

    // Arrange
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");

    // Act
    final boolean actual = CollectionUtils.isEmpty(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isEmptyInputNotNullOutputFalse999254eb53884ebabad() {

    // Arrange
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final boolean actual = CollectionUtils.isEmpty(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
