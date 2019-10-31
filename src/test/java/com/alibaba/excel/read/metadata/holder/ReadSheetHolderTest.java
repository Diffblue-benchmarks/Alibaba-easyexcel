package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.holder.ReadSheetHolder;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReadSheetHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNullOutputNullPointerException999a297a3c0f3aa473f() {

    // Arrange
    final ReadSheet arg0 = new ReadSheet();
    final ReadWorkbookHolder arg1 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new ReadSheetHolder(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
