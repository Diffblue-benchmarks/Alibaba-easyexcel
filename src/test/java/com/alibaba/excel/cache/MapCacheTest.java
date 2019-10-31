package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import com.alibaba.excel.context.AnalysisContext;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MapCacheTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d6196a82b4b0d9bd() {

    // Act, creating object to test constructor
    final MapCache actual = new MapCache();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void destroyOutputVoid9995934681f7534fe3c() {

    // Arrange
    final MapCache thisObj = new MapCache();

    // Act
    thisObj.destroy();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullOutputVoid999987baa5a1b0c0b33() {

    // Arrange
    final MapCache thisObj = new MapCache();
    final Integer arg0 = new Integer(0);

    // Act
    final String actual = thisObj.get(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initInputNullOutputVoid999cc156cf2da9277a2() {

    // Arrange
    final MapCache thisObj = new MapCache();
    final AnalysisContext arg0 = null;

    // Act
    thisObj.init(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void putFinishedOutputVoid999bafb4b4a855fb868() {

    // Arrange
    final MapCache thisObj = new MapCache();

    // Act
    thisObj.putFinished();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void putInputNotNullOutputVoid999fda7647a85ecfac4() {

    // Arrange
    final MapCache thisObj = new MapCache();
    final String arg0 = "aaaaa";

    // Act
    thisObj.put(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
