package com.alibaba.excel.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_ExcelHeadPropertyTest_6_Test {
  @Test
  public void ExcelHeadPropertyTest() throws Exception {
    // Arrange
    Class headClazz = (Class) null;
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    Boolean convertAllFiled = new Boolean(true);

    // Act
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(headClazz, arrayList, convertAllFiled);

    // Assert
    HeadKindEnum headKind = excelHeadProperty.getHeadKind();
    Map<Integer, Head> headMap = excelHeadProperty.getHeadMap();
    Map<Integer, ExcelContentProperty> contentPropertyMap = excelHeadProperty.getContentPropertyMap();
    String toStringResult = excelHeadProperty.toString();
    Class headClazz1 = excelHeadProperty.getHeadClazz();
    boolean hasHeadResult = excelHeadProperty.hasHead();
    int headRowNumber = excelHeadProperty.getHeadRowNumber();
    Map<String, Field> ignoreMap = excelHeadProperty.getIgnoreMap();
    Assert.assertEquals(HeadKindEnum.STRING, headKind);
    Assert.assertTrue(ignoreMap instanceof java.util.HashMap);
    Assert.assertEquals(1, headRowNumber);
    Assert.assertEquals(0, ignoreMap.size());
    Assert.assertTrue(hasHeadResult);
    Assert.assertEquals(null, headClazz1);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(contentPropertyMap instanceof java.util.TreeMap);
    Assert.assertTrue(headMap instanceof java.util.TreeMap);
    Assert.assertEquals(1, contentPropertyMap.size());
    Assert.assertTrue(contentPropertyMap.containsKey(Integer.valueOf(0)));
    Assert.assertEquals(1, headMap.size());
    Assert.assertTrue(headMap.containsKey(Integer.valueOf(0)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
