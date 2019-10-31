package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class BasicParameterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992487f5dd62a51345() {

    // Act, creating object to test constructor
    final BasicParameter actual = new BasicParameter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoTrimOutputVoid9996e3db3cbbf2cd7e2() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();

    // Act
    final Boolean actual = thisObj.getAutoTrim();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClazzOutputVoid99981c3288596076df6() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();

    // Act
    final Class actual = thisObj.getClazz();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCustomConverterListOutputVoid999ec1993a6e98b947d() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();

    // Act
    final List<Converter> actual = thisObj.getCustomConverterList();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadOutputVoid99982da225534bc3d14() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();

    // Act
    final List<List<String>> actual = thisObj.getHead();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUse1904windowingOutputVoid999baff025d65e0839b() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();

    // Act
    final Boolean actual = thisObj.getUse1904windowing();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoTrimInputNotNullOutputVoid999f8e42384bd5ce3cd() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoTrim(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAutoTrim());

  }

  // Test written by Diffblue Cover
  @Test
  public void setClazzInputNullOutputVoid999c9304eae4f5af72e() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();
    final Class arg0 = null;

    // Act
    thisObj.setClazz(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCustomConverterListInputNotNullOutputVoid99902c4179f37274453() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();
    final ArrayList<Converter> arg0 = new ArrayList<Converter>();
    final AutoConverter autoConverter = new AutoConverter();
    arg0.add(autoConverter);

    // Act
    thisObj.setCustomConverterList(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCustomConverterList());
    Assert.assertEquals(1, thisObj.getCustomConverterList().size());
    Assert.assertNotNull(thisObj.getCustomConverterList().get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadInputNotNullOutputVoid999b4c7e8e4a4670bd1() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg0.add(arrayList);

    // Act
    thisObj.setHead(arg0);

    // Assert side effects
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add("aaaaa");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, thisObj.getHead());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUse1904windowingInputNotNullOutputVoid999a4ff2da13e04db86() {

    // Arrange
    final BasicParameter thisObj = new BasicParameter();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setUse1904windowing(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getUse1904windowing());

  }
}
