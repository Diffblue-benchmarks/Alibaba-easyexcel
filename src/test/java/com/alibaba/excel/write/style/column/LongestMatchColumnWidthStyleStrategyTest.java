package com.alibaba.excel.write.style.column;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class LongestMatchColumnWidthStyleStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99995d97ac9b0486ad2() {

    // Act, creating object to test constructor
    final LongestMatchColumnWidthStyleStrategy actual = new LongestMatchColumnWidthStyleStrategy();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setColumnWidthInputNullNotNullNullNotNullPositiveTrueOutputNullPointerException999e1f201998ceb8ae9() {

    // Arrange
    final LongestMatchColumnWidthStyleStrategy thisObj = new LongestMatchColumnWidthStyleStrategy();
    final WriteSheetHolder arg0 = null;
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final CellData arg1 = new CellData(myByteArray);
    final Cell arg2 = null;
    final Integer integer = new Integer(8);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("akaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head arg3 = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final int arg4 = 8;
    final boolean arg5 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setColumnWidth(arg0, arg1, arg2, arg3, arg4, arg5);

    // The method is not expected to return due to exception thrown

  }
}
