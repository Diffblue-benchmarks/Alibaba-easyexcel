package com.alibaba.excel.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelHeadProperty_getHeadKindTest_11_Test {
  @Test
  public void getHeadKindTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(null, arrayList, new Boolean(true));

    // Act
    HeadKindEnum actual = excelHeadProperty.getHeadKind();

    // Assert
    Assert.assertEquals(HeadKindEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
