package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LoopMergeStrategy_mergeTest_2_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    LoopMergeStrategy loopMergeStrategy = new LoopMergeStrategy(1, 1);
    HSSFSheet sheet = (HSSFSheet) null;
    HSSFCell cell = (HSSFCell) null;
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("ColumnIndex must be greater than 0");
    Head head = new Head(integer, "ColumnIndex must be greater than 0", arrayList, null, new Boolean(true));
    int relativeRowIndex = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    loopMergeStrategy.merge(sheet, cell, head, relativeRowIndex);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
