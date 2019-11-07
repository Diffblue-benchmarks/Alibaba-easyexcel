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

public class ExcelHeadProperty_setHeadRowNumberTest_1_Test {
  @Test
  public void setHeadRowNumberTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));
    int headRowNumber = 0;

    // Act
    excelHeadProperty.setHeadRowNumber(headRowNumber);

    // Assert
    HeadKindEnum headKind = excelHeadProperty.getHeadKind();
    Map<Integer, Head> headMap = excelHeadProperty.getHeadMap();
    Map<Integer, ExcelContentProperty> contentPropertyMap = excelHeadProperty.getContentPropertyMap();
    String toStringResult = excelHeadProperty.toString();
    Class headClazz = excelHeadProperty.getHeadClazz();
    boolean hasHeadResult = excelHeadProperty.hasHead();
    int headRowNumber1 = excelHeadProperty.getHeadRowNumber();
    Map<String, Field> ignoreMap = excelHeadProperty.getIgnoreMap();
    Assert.assertEquals(HeadKindEnum.STRING, headKind);
    Assert.assertTrue(ignoreMap instanceof java.util.HashMap);
    Assert.assertEquals(0, headRowNumber1);
    Assert.assertEquals(0, ignoreMap.size());
    Assert.assertTrue(hasHeadResult);
    Assert.assertEquals(null, headClazz);
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
