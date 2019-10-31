package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;



public class FileUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void createCacheTmpFileOutputNotNull99955789c1130978fc0() {
//
//    // Act
//    final File actual = FileUtils.createCacheTmpFile();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("/tmp/excache/45716046-7c6f-49ff-9d49-cfc2db8d95f4", actual.getPath());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void createPoiFilesDirectoryOutputVoid999ea52c2fc9b69ea0a() {

    // Act
    FileUtils.createPoiFilesDirectory();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createTmpDirectoryInputNotNullOutputNotNull9996e651dc43a08cbf7() {

    // Arrange
    final String arg0 = "' cannot be read";

    // Act
    final File actual = FileUtils.createTmpDirectory(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("/tmp/' cannot be read", actual.getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void deleteInputNotNullOutputVoid99990a6692f4a56611d() {

    // Arrange
    final File arg0 = new File("' cannot be read");

    // Act
    FileUtils.delete(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void openInputStreamInputNotNullOutputNotNull999afa091ee1971e8a2() throws IOException {
//
//    // Arrange
//    final File arg0 = new File("' cannot be read");
//
//    // Act
//    final FileInputStream actual = FileUtils.openInputStream(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void readFileToByteArrayInputNotNullOutputFileNotFoundException999cabf75e1418a375a() throws IOException {
//
//    // Arrange
//    final File arg0 = new File("' cannot be read");
//
//    // Act
//    thrown.expect(FileNotFoundException.class);
//    FileUtils.readFileToByteArray(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void writeToFileInputNotNullNotNullOutputVoid999d1b678c0a4ccf43a() {

    // Arrange
    final File arg0 = new File("' cannot be read");
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    FileUtils.writeToFile(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertEquals(24, Reflector.getInstanceField(arg1, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg1, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg1, "buf")));
    Assert.assertEquals(24, Reflector.getInstanceField(arg1, "pos"));

  }
}
