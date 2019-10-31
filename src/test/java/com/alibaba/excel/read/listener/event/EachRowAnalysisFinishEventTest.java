package com.alibaba.excel.read.listener.event;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.event.EachRowAnalysisFinishEvent;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;



public class EachRowAnalysisFinishEventTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9994425ffe77ae0d4ae() throws InvocationTargetException {
//
//    // Arrange
//    final HashMap<Integer, CellData> arg0 = new HashMap<Integer, CellData>();
//    final Integer integer = new Integer(1);
//    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
//    final CellData cellData = new CellData(myByteArray);
//    arg0.put(integer, cellData);
//
//    // Act, creating object to test constructor
//    final EachRowAnalysisFinishEvent actual = new EachRowAnalysisFinishEvent(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getAnalysisResult());
//    Assert.assertEquals(1, actual.getAnalysisResult().size());
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    Assert.assertNotNull(actual.getAnalysisResult().get(integer1));
//    Assert.assertNotNull(actual.getAnalysisResult().get(integer1).getFormula());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getFormulaValue());
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual.getAnalysisResult().get(integer1).getImageValue());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getDataFormat());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getDataFormatString());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getStringValue());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getBooleanValue());
//    Assert.assertNull(actual.getAnalysisResult().get(integer1).getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.getAnalysisResult().get(integer1).getType());
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getAnalysisResultOutput199920996d909da5456b() throws InvocationTargetException {
//
//    // Arrange
//    final HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
//    final Integer integer = new Integer(1);
//    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
//    final CellData cellData = new CellData(myByteArray);
//    hashMap.put(integer, cellData);
//    final EachRowAnalysisFinishEvent thisObj = new EachRowAnalysisFinishEvent(hashMap);
//
//    // Act
//    final Map<Integer, CellData> actual = thisObj.getAnalysisResult();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(1, actual.size());
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    Assert.assertNotNull(actual.get(integer1));
//    Assert.assertNotNull(actual.get(integer1).getFormula());
//    Assert.assertNull(actual.get(integer1).getFormulaValue());
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual.get(integer1).getImageValue());
//    Assert.assertNull(actual.get(integer1).getDataFormat());
//    Assert.assertNull(actual.get(integer1).getDataFormatString());
//    Assert.assertNull(actual.get(integer1).getStringValue());
//    Assert.assertNull(actual.get(integer1).getBooleanValue());
//    Assert.assertNull(actual.get(integer1).getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.get(integer1).getType());
//
//  }
}
