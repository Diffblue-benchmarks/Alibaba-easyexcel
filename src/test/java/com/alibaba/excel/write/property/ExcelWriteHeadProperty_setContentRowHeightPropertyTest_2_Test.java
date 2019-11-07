package com.alibaba.excel.write.property;

import com.alibaba.excel.metadata.property.RowHeightProperty;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriteHeadProperty_setContentRowHeightPropertyTest_2_Test {
  @Test
  public void setContentRowHeightPropertyTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    ExcelWriteHeadProperty excelWriteHeadProperty = new ExcelWriteHeadProperty(null, arrayList, new Boolean(true));
    RowHeightProperty rowHeightProperty = new RowHeightProperty(new Short((short) 1));

    // Act
    excelWriteHeadProperty.setContentRowHeightProperty(rowHeightProperty);

    // Assert
    String toStringResult = rowHeightProperty.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Short.valueOf((short) 1), rowHeightProperty.getHeight());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
