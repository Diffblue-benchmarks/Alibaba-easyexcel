package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_HeadTest_8_Test {
  @Test
  public void HeadTest() throws Exception {
    // Arrange
    Integer columnIndex = new Integer(1);
    String fieldName = "aaaaa";
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean forceIndex = new Boolean(true);
    Boolean forceName = new Boolean(true);

    // Act
    Head head = new Head(columnIndex, fieldName, arrayList, forceIndex, forceName);

    // Assert
    Boolean forceIndex1 = head.getForceIndex();
    String toStringResult = head.toString();
    String fieldName1 = head.getFieldName();
    ColumnWidthProperty columnWidthProperty = head.getColumnWidthProperty();
    Integer columnIndex1 = head.getColumnIndex();
    Boolean forceName1 = head.getForceName();
    List<String> headNameList = head.getHeadNameList();
    Assert.assertEquals(Boolean.valueOf(true), forceIndex1);
    Assert.assertTrue(headNameList instanceof ArrayList);
    Assert.assertEquals(Boolean.valueOf(true), forceName1);
    Assert.assertEquals(1, headNameList.size());
    Assert.assertEquals("aaaaa", headNameList.get(0));
    Assert.assertEquals(Integer.valueOf(1), columnIndex1);
    Assert.assertEquals(null, columnWidthProperty);
    Assert.assertEquals("aaaaa", fieldName1);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
