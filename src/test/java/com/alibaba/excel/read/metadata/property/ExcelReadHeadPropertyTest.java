package com.alibaba.excel.read.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;



public class ExcelReadHeadPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullNotNullOutputNotNull999ecea81b19fee6b3a() throws InvocationTargetException {

    // Arrange
    final Class arg0 = null;
    final ArrayList<List<String>> arg1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg1.add(arrayList);
    final Boolean arg2 = new Boolean(true);

    // Act, creating object to test constructor
    final ExcelReadHeadProperty actual = new ExcelReadHeadProperty(arg0, arg1, arg2);

    // Assert side effects
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("aaaaa");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHeadClazz());
    final TreeMap<Integer, ExcelContentProperty> treeMap = new TreeMap<Integer, ExcelContentProperty>();
    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
    treeMap.put(integer, null);
    Assert.assertEquals(treeMap, actual.getContentPropertyMap());
    Assert.assertEquals(HeadKindEnum.STRING, actual.getHeadKind());
    Assert.assertNotNull(actual.getHeadMap());
    Assert.assertEquals(1, actual.getHeadMap().size());
    Assert.assertNotNull(actual.getHeadMap().get(integer));
    Assert.assertNull(actual.getHeadMap().get(integer).getColumnWidthProperty());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getColumnIndex());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getForceIndex());
    Assert.assertNull(actual.getHeadMap().get(integer).getFieldName());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getForceName());
    final ArrayList<String> arrayList3 = new ArrayList<String>();
    arrayList3.add("aaaaa");
    Assert.assertEquals(arrayList3, actual.getHeadMap().get(integer).getHeadNameList());
    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
    Assert.assertEquals(hashMap, actual.getIgnoreMap());
    Assert.assertEquals(1, actual.getHeadRowNumber());

  }
}
