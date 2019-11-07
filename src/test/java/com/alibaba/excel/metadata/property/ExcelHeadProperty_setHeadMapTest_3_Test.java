package com.alibaba.excel.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_setHeadMapTest_3_Test {
  @Test
  public void setHeadMapTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    Boolean resultBoolean = new Boolean(true);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, resultBoolean);
    HashMap<Integer, Head> hashMap = new HashMap<Integer, Head>();
    Integer integer = new Integer(0);
    ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("' must be inconsistent");
    hashMap.put(integer, new Head(null, "' must be inconsistent", arrayList2, new Boolean(true), resultBoolean));

    // Act
    excelHeadProperty.setHeadMap(hashMap);

    // Assert
    HeadKindEnum headKind = excelHeadProperty.getHeadKind();
    Map<Integer, Head> headMap = excelHeadProperty.getHeadMap();
    Map<Integer, ExcelContentProperty> contentPropertyMap = excelHeadProperty.getContentPropertyMap();
    String toStringResult = excelHeadProperty.toString();
    Class headClazz = excelHeadProperty.getHeadClazz();
    boolean hasHeadResult = excelHeadProperty.hasHead();
    int headRowNumber = excelHeadProperty.getHeadRowNumber();
    Map<String, Field> ignoreMap = excelHeadProperty.getIgnoreMap();
    Assert.assertEquals(HeadKindEnum.STRING, headKind);
    Assert.assertTrue(ignoreMap instanceof HashMap);
    Assert.assertEquals(1, headRowNumber);
    Assert.assertEquals(0, ignoreMap.size());
    Assert.assertTrue(hasHeadResult);
    Assert.assertEquals(null, headClazz);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(contentPropertyMap instanceof java.util.TreeMap);
    Assert.assertTrue(headMap instanceof HashMap);
    Assert.assertEquals(1, contentPropertyMap.size());
    Assert.assertTrue(contentPropertyMap.containsKey(Integer.valueOf(0)));
    Assert.assertEquals(1, headMap.size());
    Assert.assertTrue(headMap.containsKey(Integer.valueOf(0)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
