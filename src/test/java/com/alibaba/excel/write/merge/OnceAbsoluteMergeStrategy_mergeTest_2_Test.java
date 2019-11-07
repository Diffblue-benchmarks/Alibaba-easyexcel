package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.OnceAbsoluteMergeStrategy;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OnceAbsoluteMergeStrategy_mergeTest_2_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    OnceAbsoluteMergeStrategy onceAbsoluteMergeStrategy = new OnceAbsoluteMergeStrategy(1, 1, 1, 1);
    HSSFSheet sheet = (HSSFSheet) null;
    HSSFCell cell = (HSSFCell) null;
    Integer integer = new Integer(2561);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("All parameters must be greater than 0");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "All parameters must be greater than 0", arrayList, resultBoolean, new Boolean(true));
    int relativeRowIndex = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    onceAbsoluteMergeStrategy.merge(sheet, cell, head, relativeRowIndex);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
