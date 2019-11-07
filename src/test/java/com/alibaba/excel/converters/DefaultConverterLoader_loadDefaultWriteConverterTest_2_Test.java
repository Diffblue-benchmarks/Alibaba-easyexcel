package com.alibaba.excel.converters;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.DefaultConverterLoader;
import com.alibaba.excel.converters.bigdecimal.BigDecimalNumberConverter;
import com.alibaba.excel.converters.booleanconverter.BooleanBooleanConverter;
import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import com.alibaba.excel.converters.date.DateStringConverter;
import com.alibaba.excel.converters.doubleconverter.DoubleNumberConverter;
import com.alibaba.excel.converters.file.FileImageConverter;
import com.alibaba.excel.converters.floatconverter.FloatNumberConverter;
import com.alibaba.excel.converters.integer.IntegerNumberConverter;
import com.alibaba.excel.converters.longconverter.LongNumberConverter;
import com.alibaba.excel.converters.shortconverter.ShortNumberConverter;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultConverterLoader_loadDefaultWriteConverterTest_2_Test {
  @Test
  public void loadDefaultWriteConverterTest() throws Exception {
    // Arrange and Act
    Map<String, Converter> actual = DefaultConverterLoader.loadDefaultWriteConverter();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(14, actual.size());
    Converter getResult = actual.get("java.lang.Float");
    Converter getResult1 = actual.get("java.lang.Double");
    Converter getResult2 = actual.get("java.util.Date");
    Converter getResult3 = actual.get("[B");
    Converter getResult4 = actual.get("[Ljava.lang.Byte;");
    Converter getResult5 = actual.get("java.lang.Integer");
    Converter getResult6 = actual.get("java.io.File");
    Converter getResult7 = actual.get("java.math.BigDecimal");
    Converter getResult8 = actual.get("java.lang.Long");
    Converter getResult9 = actual.get("java.lang.Short");
    Converter getResult10 = actual.get("java.lang.Boolean");
    Assert.assertTrue(getResult instanceof FloatNumberConverter);
    Assert.assertTrue(getResult10 instanceof BooleanBooleanConverter);
    String toStringResult = ((FloatNumberConverter) getResult).toString();
    String toStringResult1 = ((BooleanBooleanConverter) getResult10).toString();
    Assert.assertTrue(getResult1 instanceof DoubleNumberConverter);
    Assert.assertTrue(getResult3 instanceof ByteArrayImageConverter);
    String toStringResult2 = ((DoubleNumberConverter) getResult1).toString();
    String toStringResult3 = ((ByteArrayImageConverter) getResult3).toString();
    Assert.assertTrue(getResult7 instanceof BigDecimalNumberConverter);
    Assert.assertTrue(getResult8 instanceof LongNumberConverter);
    String toStringResult4 = ((BigDecimalNumberConverter) getResult7).toString();
    String toStringResult5 = ((LongNumberConverter) getResult8).toString();
    Assert.assertTrue(getResult4 instanceof BoxingByteArrayImageConverter);
    Assert.assertTrue(getResult9 instanceof ShortNumberConverter);
    String toStringResult6 = ((BoxingByteArrayImageConverter) getResult4).toString();
    String toStringResult7 = ((ShortNumberConverter) getResult9).toString();
    Assert.assertTrue(getResult2 instanceof DateStringConverter);
    Assert.assertTrue(getResult5 instanceof IntegerNumberConverter);
    String toStringResult8 = ((DateStringConverter) getResult2).toString();
    String toStringResult9 = ((IntegerNumberConverter) getResult5).toString();
    Assert.assertTrue(getResult6 instanceof FileImageConverter);
    Assert.assertNotNull(toStringResult4);
    Assert.assertNotNull(((FileImageConverter) getResult6).toString());
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
