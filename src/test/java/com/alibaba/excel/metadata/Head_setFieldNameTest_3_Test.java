package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_setFieldNameTest_3_Test {
  @Test
  public void setFieldNameTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    String string = "aaaaa";
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, string, arrayList, resultBoolean, new Boolean(true));

    // Act
    head.setFieldName(string);

    // Assert
    Boolean forceIndex = head.getForceIndex();
    String toStringResult = head.toString();
    String fieldName = head.getFieldName();
    ColumnWidthProperty columnWidthProperty = head.getColumnWidthProperty();
    Integer columnIndex = head.getColumnIndex();
    Boolean forceName = head.getForceName();
    List<String> headNameList = head.getHeadNameList();
    Assert.assertEquals(Boolean.valueOf(true), forceIndex);
    Assert.assertTrue(headNameList instanceof ArrayList);
    Assert.assertEquals(Boolean.valueOf(true), forceName);
    Assert.assertEquals(1, headNameList.size());
    Assert.assertEquals("aaaaa", headNameList.get(0));
    Assert.assertEquals(Integer.valueOf(1), columnIndex);
    Assert.assertEquals(null, columnWidthProperty);
    Assert.assertEquals("aaaaa", fieldName);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
