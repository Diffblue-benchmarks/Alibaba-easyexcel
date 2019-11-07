package com.alibaba.excel.converters;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.DefaultConverterLoader;
import com.alibaba.excel.converters.bigdecimal.BigDecimalNumberConverter;
import com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter;
import com.alibaba.excel.converters.booleanconverter.BooleanStringConverter;
import com.alibaba.excel.converters.byteconverter.ByteBooleanConverter;
import com.alibaba.excel.converters.date.DateNumberConverter;
import com.alibaba.excel.converters.integer.IntegerStringConverter;
import com.alibaba.excel.converters.shortconverter.ShortBooleanConverter;
import com.alibaba.excel.converters.string.StringBooleanConverter;
import com.alibaba.excel.converters.string.StringErrorConverter;
import com.alibaba.excel.converters.string.StringNumberConverter;
import com.alibaba.excel.converters.string.StringStringConverter;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultConverterLoader_loadAllConverterTest_3_Test {
  @Test
  public void loadAllConverterTest() throws Exception {
    // Arrange and Act
    Map<String, Converter> actual = DefaultConverterLoader.loadAllConverter();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(30, actual.size());
    Converter getResult = actual.get("java.lang.Boolean-STRING");
    Converter getResult1 = actual.get("java.lang.String-NUMBER");
    Converter getResult2 = actual.get("java.lang.Short-BOOLEAN");
    Converter getResult3 = actual.get("java.lang.String-BOOLEAN");
    Converter getResult4 = actual.get("java.math.BigDecimal-NUMBER");
    Converter getResult5 = actual.get("java.util.Date-NUMBER");
    Converter getResult6 = actual.get("java.lang.String-STRING");
    Converter getResult7 = actual.get("java.lang.Integer-STRING");
    Converter getResult8 = actual.get("java.lang.Boolean-NUMBER");
    Converter getResult9 = actual.get("java.lang.Byte-BOOLEAN");
    Converter getResult10 = actual.get("java.lang.String-ERROR");
    Assert.assertTrue(getResult instanceof BooleanStringConverter);
    Assert.assertTrue(getResult10 instanceof StringErrorConverter);
    String toStringResult = ((BooleanStringConverter) getResult).toString();
    String toStringResult1 = ((StringErrorConverter) getResult10).toString();
    Assert.assertTrue(getResult1 instanceof StringNumberConverter);
    Assert.assertTrue(getResult3 instanceof StringBooleanConverter);
    String toStringResult2 = ((StringNumberConverter) getResult1).toString();
    String toStringResult3 = ((StringBooleanConverter) getResult3).toString();
    Assert.assertTrue(getResult7 instanceof IntegerStringConverter);
    Assert.assertTrue(getResult8 instanceof BooleanNumberConverter);
    String toStringResult4 = ((IntegerStringConverter) getResult7).toString();
    String toStringResult5 = ((BooleanNumberConverter) getResult8).toString();
    Assert.assertTrue(getResult4 instanceof BigDecimalNumberConverter);
    Assert.assertTrue(getResult9 instanceof ByteBooleanConverter);
    String toStringResult6 = ((BigDecimalNumberConverter) getResult4).toString();
    String toStringResult7 = ((ByteBooleanConverter) getResult9).toString();
    Assert.assertTrue(getResult2 instanceof ShortBooleanConverter);
    Assert.assertTrue(getResult5 instanceof DateNumberConverter);
    String toStringResult8 = ((ShortBooleanConverter) getResult2).toString();
    String toStringResult9 = ((DateNumberConverter) getResult5).toString();
    Assert.assertTrue(getResult6 instanceof StringStringConverter);
    Assert.assertNotNull(toStringResult4);
    Assert.assertNotNull(((StringStringConverter) getResult6).toString());
    Assert.assertNotNull(toStringResult3);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult7);
    Assert.assertNotNull(toStringResult6);
    Assert.assertNotNull(toStringResult5);
    Assert.assertNotNull(toStringResult2);
    Assert.assertNotNull(toStringResult8);
    Assert.assertNotNull(toStringResult9);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
