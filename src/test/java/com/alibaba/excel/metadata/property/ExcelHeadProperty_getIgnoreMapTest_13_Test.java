package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_getIgnoreMapTest_13_Test {
  @Test
  public void getIgnoreMapTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));

    // Act
    Map<String, Field> actual = excelHeadProperty.getIgnoreMap();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
