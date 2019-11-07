package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_setHeadTest_9_Test {
  @Test
  public void setHeadTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Head head = new Head(integer, "aaaaa", arrayList, null, new Boolean(true));

    // Act
    excelContentProperty.setHead(head);

    // Assert
    Boolean forceIndex = head.getForceIndex();
    String toStringResult = head.toString();
    String fieldName = head.getFieldName();
    ColumnWidthProperty columnWidthProperty = head.getColumnWidthProperty();
    Integer columnIndex = head.getColumnIndex();
    Boolean forceName = head.getForceName();
    List<String> headNameList = head.getHeadNameList();
    Assert.assertEquals(null, forceIndex);
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
