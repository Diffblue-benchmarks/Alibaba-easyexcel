package com.alibaba.excel.write.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.CellRange;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
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



public class ExcelWriteHeadPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullNotNullOutputNotNull999a0ed565d04e3b8f5() throws InvocationTargetException {

    // Arrange
    final Class arg0 = null;
    final ArrayList<List<String>> arg1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("-");
    arg1.add(arrayList);
    final Boolean arg2 = new Boolean(true);

    // Act, creating object to test constructor
    final ExcelWriteHeadProperty actual = new ExcelWriteHeadProperty(arg0, arg1, arg2);

    // Assert side effects
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("-");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getContentRowHeightProperty());
    Assert.assertNull(actual.getHeadRowHeightProperty());
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
    arrayList3.add("-");
    Assert.assertEquals(arrayList3, actual.getHeadMap().get(integer).getHeadNameList());
    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
    Assert.assertEquals(hashMap, actual.getIgnoreMap());
    Assert.assertEquals(1, actual.getHeadRowNumber());

  }

  // Test written by Diffblue Cover
  @Test
  public void getContentRowHeightPropertyOutputVoid9993721be87769e58d7() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty thisObj = new ExcelWriteHeadProperty(null, arrayList, boolean1);

    // Act
    final RowHeightProperty actual = thisObj.getContentRowHeightProperty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadRowHeightPropertyOutputVoid999cfdcdd3a638de51b() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty thisObj = new ExcelWriteHeadProperty(null, arrayList, boolean1);

    // Act
    final RowHeightProperty actual = thisObj.getHeadRowHeightProperty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void headCellRangeListOutput099996441bf251e619d3() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty thisObj = new ExcelWriteHeadProperty(null, arrayList, boolean1);

    // Act
    final List<CellRange> actual = thisObj.headCellRangeList();

    // Assert result
    final ArrayList<CellRange> arrayList2 = new ArrayList<CellRange>();
    Assert.assertEquals(arrayList2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setContentRowHeightPropertyInputNotNullOutputVoid999de9e7fdb8af80297() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty thisObj = new ExcelWriteHeadProperty(null, arrayList, boolean1);
    final Short short1 = new Short((short) 1);
    final RowHeightProperty arg0 = new RowHeightProperty(short1);

    // Act
    thisObj.setContentRowHeightProperty(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getContentRowHeightProperty());
    Assert.assertNotNull(thisObj.getContentRowHeightProperty().getHeight());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadRowHeightPropertyInputNotNullOutputVoid9992594189ccfc2ba37() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty thisObj = new ExcelWriteHeadProperty(null, arrayList, boolean1);
    final Short short1 = new Short((short) 1);
    final RowHeightProperty arg0 = new RowHeightProperty(short1);

    // Act
    thisObj.setHeadRowHeightProperty(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHeadRowHeightProperty());
    Assert.assertNotNull(thisObj.getHeadRowHeightProperty().getHeight());

  }
}
