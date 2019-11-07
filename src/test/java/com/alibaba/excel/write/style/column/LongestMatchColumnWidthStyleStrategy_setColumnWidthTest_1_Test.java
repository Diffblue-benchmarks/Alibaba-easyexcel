package com.alibaba.excel.write.style.column;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LongestMatchColumnWidthStyleStrategy_setColumnWidthTest_1_Test {
  @Test
  public void setColumnWidthTest() throws Exception {
    // Arrange
    LongestMatchColumnWidthStyleStrategy longestMatchColumnWidthStyleStrategy = new LongestMatchColumnWidthStyleStrategy();
    WriteSheetHolder writeSheetHolder = (WriteSheetHolder) null;
    CellData cellData = new CellData(
        new byte[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8});
    HSSFCell cell = (HSSFCell) null;
    Integer integer = new Integer(8);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("akaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));
    int relativeRowIndex = 8;
    boolean isHead = true;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    longestMatchColumnWidthStyleStrategy.setColumnWidth(writeSheetHolder, cellData, cell, head, relativeRowIndex,
        isHead);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
