package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_setHeadClazzTest_7_Test {
  @Test
  public void setHeadClazzTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));
    Class resultClass = (Class) null;

    // Act
    excelHeadProperty.setHeadClazz(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
