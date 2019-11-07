package com.alibaba.excel.converters.date;

import com.alibaba.excel.converters.date.DateNumberConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DateNumberConverter_convertToExcelDataTest_1_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    DateNumberConverter dateNumberConverter = new DateNumberConverter();
    Date value = new Date(1L);
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    dateNumberConverter.convertToExcelData(value, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
