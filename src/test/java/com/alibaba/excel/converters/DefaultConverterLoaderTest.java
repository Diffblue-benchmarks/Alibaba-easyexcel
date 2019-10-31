package com.alibaba.excel.converters;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.DefaultConverterLoader;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Map;



public class DefaultConverterLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994b5be62388f6f15e() {

    // Act, creating object to test constructor
    final DefaultConverterLoader actual = new DefaultConverterLoader();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void loadAllConverterOutput30999bc2e7236b93c24ff() {

    // Act
    final Map<String, Converter> actual = DefaultConverterLoader.loadAllConverter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(30, actual.size());
    Assert.assertNotNull(actual.get("java.lang.Boolean-STRING"));
    Assert.assertNotNull(actual.get("java.lang.String-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Short-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.String-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-NUMBER"));
    Assert.assertNotNull(actual.get("java.util.Date-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.String-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Integer-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Boolean-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Byte-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.String-ERROR"));
    Assert.assertNotNull(actual.get("java.lang.Integer-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Boolean-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Double-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Long-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Integer-NUMBER"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Float-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Long-NUMBER"));
    Assert.assertNotNull(actual.get("java.util.Date-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Float-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Byte-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Double-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Float-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Long-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Short-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Byte-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Double-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Short-STRING"));

  }

  // Test written by Diffblue Cover
  @Test
  public void loadDefaultReadConverterOutput30999ee27968aa0cc2ae2() {

    // Act
    final Map<String, Converter> actual = DefaultConverterLoader.loadDefaultReadConverter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(30, actual.size());
    Assert.assertNotNull(actual.get("java.lang.Boolean-STRING"));
    Assert.assertNotNull(actual.get("java.lang.String-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Short-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.String-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-NUMBER"));
    Assert.assertNotNull(actual.get("java.util.Date-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.String-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Integer-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Boolean-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Byte-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.String-ERROR"));
    Assert.assertNotNull(actual.get("java.lang.Integer-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Boolean-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Double-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Long-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Integer-NUMBER"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Float-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Long-NUMBER"));
    Assert.assertNotNull(actual.get("java.util.Date-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Float-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Byte-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Double-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Float-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Long-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Short-NUMBER"));
    Assert.assertNotNull(actual.get("java.lang.Byte-STRING"));
    Assert.assertNotNull(actual.get("java.lang.Double-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal-BOOLEAN"));
    Assert.assertNotNull(actual.get("java.lang.Short-STRING"));

  }

  // Test written by Diffblue Cover
  @Test
  public void loadDefaultWriteConverterOutput1499997e7d8372805d02b() {

    // Act
    final Map<String, Converter> actual = DefaultConverterLoader.loadDefaultWriteConverter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(14, actual.size());
    Assert.assertNotNull(actual.get("java.lang.Float"));
    Assert.assertNotNull(actual.get("java.lang.Double"));
    Assert.assertNotNull(actual.get("java.util.Date"));
    Assert.assertNotNull(actual.get("[B"));
    Assert.assertNotNull(actual.get("[Ljava.lang.Byte;"));
    Assert.assertNotNull(actual.get("java.lang.Integer"));
    Assert.assertNotNull(actual.get("java.io.File"));
    Assert.assertNotNull(actual.get("java.math.BigDecimal"));
    Assert.assertNotNull(actual.get("java.lang.Long"));
    Assert.assertNotNull(actual.get("java.lang.Short"));
    Assert.assertNotNull(actual.get("java.lang.Boolean"));
    Assert.assertNotNull(actual.get("java.lang.String"));
    Assert.assertNotNull(actual.get("java.lang.Byte"));
    Assert.assertNotNull(actual.get("java.io.InputStream"));

  }
}
