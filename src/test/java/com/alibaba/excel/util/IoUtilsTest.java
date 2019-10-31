package com.alibaba.excel.util;

import com.alibaba.excel.util.IoUtils;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;



public class IoUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void copyInputNotNullNotNullOutputPositive999a7700d8dea46a9ba() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ByteArrayOutputStream arg1 = new ByteArrayOutputStream();

    // Act
    final int actual = IoUtils.copy(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg1, "buf")));
    Assert.assertEquals(24, ((ByteArrayOutputStream) arg1).size());
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(24, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toByteArrayInputNotNullZeroOutput099997309fdf9e4d7f04() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final int arg1 = 0;

    // Act
    final byte[] actual = IoUtils.toByteArray(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toByteArrayInputNotNullOutput2499988c2ea0f59c61b99() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final byte[] actual = IoUtils.toByteArray(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual);

  }
}
