package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileUtils_openInputStreamTest_4_Test {
//failed_run   @Test
//  public void openInputStreamTest() throws Exception {
//    // Arrange
//    File file = new File("' cannot be read");
//
//    // Act
//    FileInputStream actual = FileUtils.openInputStream(file);
//
//    // Assert
//    int availableResult = actual.available();
//    String toStringResult = actual.toString();
//    FileChannel channel = actual.getChannel();
//    FileDescriptor fD = actual.getFD();
//    Assert.assertEquals(24, availableResult);
//    String toStringResult1 = fD.toString();
//    boolean validResult = fD.valid();
//    Assert.assertTrue(channel instanceof sun.nio.ch.FileChannelImpl);
//    Assert.assertNotNull(toStringResult);
//    String toStringResult2 = channel.toString();
//    long sizeResult = channel.size();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(channel.isOpen());
//    Assert.assertEquals(24L, sizeResult);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertTrue(validResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
