package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WriteSheetHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNullPointerException999236a0362b8b097cc() {

    // Arrange
    final WriteSheet arg0 = new WriteSheet();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder arg1 = new WriteWorkbookHolder(writeWorkbook);

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new WriteSheetHolder(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
