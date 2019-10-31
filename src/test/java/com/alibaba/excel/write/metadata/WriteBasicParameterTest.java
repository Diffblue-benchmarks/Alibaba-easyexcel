package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteBasicParameter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class WriteBasicParameterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999791dc11da5baccad() {

    // Act, creating object to test constructor
    final WriteBasicParameter actual = new WriteBasicParameter();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, actual.getCustomWriteHandlerList());
    Assert.assertNull(actual.getNeedHead());
    Assert.assertNull(actual.getRelativeHeadRowIndex());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCustomWriteHandlerListOutput09990455ccecf452a127() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();

    // Act
    final List<WriteHandler> actual = thisObj.getCustomWriteHandlerList();

    // Assert result
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNeedHeadOutputVoid99940cd5d88c829124e() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();

    // Act
    final Boolean actual = thisObj.getNeedHead();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRelativeHeadRowIndexOutputVoid9998f997be3b121a2c8() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();

    // Act
    final Integer actual = thisObj.getRelativeHeadRowIndex();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCustomWriteHandlerListInputNotNullOutputVoid9998df5e1a3ee9685ac() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();
    final ArrayList<WriteHandler> arg0 = new ArrayList<WriteHandler>();
    final LoopMergeStrategy loopMergeStrategy = new LoopMergeStrategy(1, 1);
    arg0.add(loopMergeStrategy);

    // Act
    thisObj.setCustomWriteHandlerList(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCustomWriteHandlerList());
    Assert.assertEquals(1, thisObj.getCustomWriteHandlerList().size());
    Assert.assertNotNull(thisObj.getCustomWriteHandlerList().get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void setNeedHeadInputNotNullOutputVoid99919b72589907a45ed() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setNeedHead(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getNeedHead());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRelativeHeadRowIndexInputNotNullOutputVoid999c2c3c2ebfba5bf4d() {

    // Arrange
    final WriteBasicParameter thisObj = new WriteBasicParameter();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setRelativeHeadRowIndex(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getRelativeHeadRowIndex());

  }
}
