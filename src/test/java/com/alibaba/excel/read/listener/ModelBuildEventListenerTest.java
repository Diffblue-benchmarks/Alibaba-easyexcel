package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.HashMap;



public class ModelBuildEventListenerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99958e7f392061b14ea() {

    // Act, creating object to test constructor
    final ModelBuildEventListener actual = new ModelBuildEventListener();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doAfterAllAnalysedInputNullOutputVoid9994c652d220e3c3ffd() {

    // Arrange
    final ModelBuildEventListener thisObj = new ModelBuildEventListener();
    final AnalysisContext arg0 = null;

    // Act
    thisObj.doAfterAllAnalysed(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void invokeInputNotNullNullOutputNullPointerException999bd9dd85227e88d31() {

    // Arrange
    final ModelBuildEventListener thisObj = new ModelBuildEventListener();
    final HashMap<Integer, CellData> arg0 = new HashMap<Integer, CellData>();
    final Integer integer = new Integer(1);
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData cellData = new CellData(myByteArray);
    arg0.put(integer, cellData);
    final AnalysisContext arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.invoke(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void invokeHeadInputNotNullNullOutputVoid999c051e3cc3541de8d() {

    // Arrange
    final ModelBuildEventListener thisObj = new ModelBuildEventListener();
    final HashMap<Integer, CellData> arg0 = new HashMap<Integer, CellData>();
    final Integer integer = new Integer(1);
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final CellData cellData = new CellData(myByteArray);
    arg0.put(integer, cellData);
    final AnalysisContext arg1 = null;

    // Act
    thisObj.invokeHead(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
