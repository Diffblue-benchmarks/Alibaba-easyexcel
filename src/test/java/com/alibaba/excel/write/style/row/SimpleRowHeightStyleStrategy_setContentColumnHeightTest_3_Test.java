package com.alibaba.excel.write.style.row;

import com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SimpleRowHeightStyleStrategy_setContentColumnHeightTest_3_Test {
  @Test
  public void setContentColumnHeightTest() throws Exception {
    // Arrange
    Short resultShort = new Short((short) 1);
    SimpleRowHeightStyleStrategy simpleRowHeightStyleStrategy = new SimpleRowHeightStyleStrategy(resultShort,
        new Short((short) 1));
    HSSFRow row = (HSSFRow) null;
    int relativeRowIndex = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    simpleRowHeightStyleStrategy.setContentColumnHeight(row, relativeRowIndex);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
