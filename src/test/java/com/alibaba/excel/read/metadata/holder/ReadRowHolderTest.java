package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReadRowHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999318b88f6d13a8498() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final GlobalConfiguration arg1 = new GlobalConfiguration();

    // Act, creating object to test constructor
    final ReadRowHolder actual = new ReadRowHolder(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getGlobalConfiguration());
    Assert.assertNull(actual.getGlobalConfiguration().getAutoTrim());
    Assert.assertNull(actual.getGlobalConfiguration().getUse1904windowing());
    Assert.assertNull(actual.getCurrentRowAnalysisResult());
    Assert.assertNotNull(actual.getRowIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurrentRowAnalysisResultOutputVoid9990982238d17c0cc7e() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);

    // Act
    final Object actual = thisObj.getCurrentRowAnalysisResult();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getGlobalConfigurationOutputNotNull999b691a239a5280e20() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);

    // Act
    final GlobalConfiguration actual = thisObj.getGlobalConfiguration();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowIndexOutputNotNull99933d5eb695814aa27() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);

    // Act
    final Integer actual = thisObj.getRowIndex();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void holderTypeOutputRow999093216ac36ef9c94() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);

    // Act
    final HolderEnum actual = thisObj.holderType();

    // Assert result
    Assert.assertEquals(HolderEnum.ROW, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCurrentRowAnalysisResultInputNotNullOutputVoid9995633db586519c9f4() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);
    final Object arg0 = "aaaaa";

    // Act
    thisObj.setCurrentRowAnalysisResult(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCurrentRowAnalysisResult());

  }

  // Test written by Diffblue Cover
  @Test
  public void setGlobalConfigurationInputNotNullOutputVoid999f4cb3cd8490a3f9e() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);
    final GlobalConfiguration arg0 = new GlobalConfiguration();

    // Act
    thisObj.setGlobalConfiguration(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRowIndexInputNotNullOutputVoid99952891305ff65ee18() {

    // Arrange
    final Integer integer = new Integer(1);
    final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    final ReadRowHolder thisObj = new ReadRowHolder(integer, globalConfiguration);
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setRowIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
