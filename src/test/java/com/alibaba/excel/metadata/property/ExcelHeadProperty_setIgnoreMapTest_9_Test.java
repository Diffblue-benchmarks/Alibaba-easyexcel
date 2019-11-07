package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_setIgnoreMapTest_9_Test {
  @Test
  public void setIgnoreMapTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));
    HashMap<String, Field> hashMap = new HashMap<String, Field>();
    hashMap.put("' must be inconsistent", null);

    // Act
    excelHeadProperty.setIgnoreMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertTrue(hashMap.containsKey("' must be inconsistent"));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
