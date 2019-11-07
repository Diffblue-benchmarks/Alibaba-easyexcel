package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_getExcelTypeTest_2_Test {
  @Test
  public void getExcelTypeTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    ExcelTypeEnum actual = writeWorkbookHolder.getExcelType();

    // Assert
    Assert.assertEquals(ExcelTypeEnum.XLSX, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
