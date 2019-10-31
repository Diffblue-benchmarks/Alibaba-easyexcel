package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GlobalConfigurationTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998eaef8b3ea4e65f3() {

    // Act, creating object to test constructor
    final GlobalConfiguration actual = new GlobalConfiguration();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoTrimOutputVoid999c4c90688d16d1149() {

    // Arrange
    final GlobalConfiguration thisObj = new GlobalConfiguration();

    // Act
    final Boolean actual = thisObj.getAutoTrim();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUse1904windowingOutputVoid999fb462cc61c3f1c28() {

    // Arrange
    final GlobalConfiguration thisObj = new GlobalConfiguration();

    // Act
    final Boolean actual = thisObj.getUse1904windowing();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoTrimInputNotNullOutputVoid999eab2392f21036bbf() {

    // Arrange
    final GlobalConfiguration thisObj = new GlobalConfiguration();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoTrim(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAutoTrim());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUse1904windowingInputNotNullOutputVoid999988be24c7fa9a961() {

    // Arrange
    final GlobalConfiguration thisObj = new GlobalConfiguration();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setUse1904windowing(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getUse1904windowing());

  }
}
