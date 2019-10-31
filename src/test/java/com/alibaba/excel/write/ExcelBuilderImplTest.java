package com.alibaba.excel.write;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class ExcelBuilderImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addContentInputNotNullNotNullNotNullOutputVoid999d3a1431e7ee59850() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final ExcelBuilderImpl thisObj = new ExcelBuilderImpl(writeWorkbook);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add(" error,at row:");
    final WriteSheet arg1 = new WriteSheet();
    final WriteTable arg2 = new WriteTable();

    // Act
    thisObj.addContent(arg0, arg1, arg2);

    // Assert side effects
    Assert.assertNotNull(arg2);
    Assert.assertNotNull(arg2.getTableNo());
    Assert.assertNull(arg2.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, arg2.getCustomWriteHandlerList());
    Assert.assertNull(arg2.getNeedHead());
    Assert.assertNull(arg2.getRelativeHeadRowIndex());
    Assert.assertNull(arg2.getClazz());
    Assert.assertNull(arg2.getAutoTrim());
    Assert.assertNull(arg2.getCustomConverterList());
    Assert.assertNull(arg2.getHead());
    Assert.assertNull(arg2.getUse1904windowing());
    Assert.assertNotNull(arg1);
    Assert.assertNull(arg1.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, arg1.getColumnWidthMap());
    Assert.assertNotNull(arg1.getSheetNo());
    Assert.assertNull(arg1.getTableStyle());
    final ArrayList<WriteHandler> arrayList1 = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList1, arg1.getCustomWriteHandlerList());
    Assert.assertNull(arg1.getNeedHead());
    Assert.assertNull(arg1.getRelativeHeadRowIndex());
    Assert.assertNull(arg1.getClazz());
    Assert.assertNull(arg1.getAutoTrim());
    Assert.assertNull(arg1.getCustomConverterList());
    Assert.assertNull(arg1.getHead());
    Assert.assertNull(arg1.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void addContentInputNotNullNotNullOutputVoid9994dd379abfc19868e() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final ExcelBuilderImpl thisObj = new ExcelBuilderImpl(writeWorkbook);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add(" error,at row:");
    final WriteSheet arg1 = new WriteSheet();

    // Act
    thisObj.addContent(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertNull(arg1.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, arg1.getColumnWidthMap());
    Assert.assertNotNull(arg1.getSheetNo());
    Assert.assertNull(arg1.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, arg1.getCustomWriteHandlerList());
    Assert.assertNull(arg1.getNeedHead());
    Assert.assertNull(arg1.getRelativeHeadRowIndex());
    Assert.assertNull(arg1.getClazz());
    Assert.assertNull(arg1.getAutoTrim());
    Assert.assertNull(arg1.getCustomConverterList());
    Assert.assertNull(arg1.getHead());
    Assert.assertNull(arg1.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999b960b8553547a0d4() {

    // Arrange
    final WriteWorkbook arg0 = new WriteWorkbook();

    // Act, creating object to test constructor
    final ExcelBuilderImpl actual = new ExcelBuilderImpl(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void finishOutputExcelGenerateException999a969e3833683dc8f() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final ExcelBuilderImpl thisObj = new ExcelBuilderImpl(writeWorkbook);

    // Act
    thrown.expect(ExcelGenerateException.class);
    thisObj.finish();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInputZeroZeroZeroZeroOutputNullPointerException999f9f277b28c7510ed() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final ExcelBuilderImpl thisObj = new ExcelBuilderImpl(writeWorkbook);
    final int arg0 = 0;
    final int arg1 = 0;
    final int arg2 = 0;
    final int arg3 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeContextOutputNotNull999fef12f5125f13097() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final ExcelBuilderImpl thisObj = new ExcelBuilderImpl(writeWorkbook);

    // Act
    final WriteContext actual = thisObj.writeContext();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
