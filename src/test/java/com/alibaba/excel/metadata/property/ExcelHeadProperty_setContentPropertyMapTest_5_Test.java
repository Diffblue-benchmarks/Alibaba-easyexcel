package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_setContentPropertyMapTest_5_Test {
  @Test
  public void setContentPropertyMapTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));
    HashMap<Integer, ExcelContentProperty> hashMap = new HashMap<Integer, ExcelContentProperty>();
    Integer integer = new Integer(0);
    hashMap.put(integer, new ExcelContentProperty());

    // Act
    excelHeadProperty.setContentPropertyMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertTrue(hashMap.containsKey(Integer.valueOf(0)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
