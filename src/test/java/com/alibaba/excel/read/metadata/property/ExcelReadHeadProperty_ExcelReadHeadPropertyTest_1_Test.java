package com.alibaba.excel.read.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReadHeadProperty_ExcelReadHeadPropertyTest_1_Test {
  @Test
  public void ExcelReadHeadPropertyTest() throws Exception {
    // Arrange
    Class headClazz = (Class) null;
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    arrayList.add(arrayList1);
    Boolean convertAllFiled = new Boolean(true);

    // Act
    ExcelReadHeadProperty excelReadHeadProperty = new ExcelReadHeadProperty(headClazz, arrayList, convertAllFiled);

    // Assert
    HeadKindEnum headKind = excelReadHeadProperty.getHeadKind();
    Map<Integer, Head> headMap = excelReadHeadProperty.getHeadMap();
    Map<Integer, ExcelContentProperty> contentPropertyMap = excelReadHeadProperty.getContentPropertyMap();
    String toStringResult = excelReadHeadProperty.toString();
    Class headClazz1 = excelReadHeadProperty.getHeadClazz();
    boolean hasHeadResult = excelReadHeadProperty.hasHead();
    int headRowNumber = excelReadHeadProperty.getHeadRowNumber();
    Map<String, Field> ignoreMap = excelReadHeadProperty.getIgnoreMap();
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
